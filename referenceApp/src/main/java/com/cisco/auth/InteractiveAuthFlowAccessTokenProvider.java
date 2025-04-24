// Copyright 2025 Cisco Systems Inc.
//
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
//
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
// THE SOFTWARE.
package com.cisco.auth;

import com.cisco.input.OAuthInputProvider;
import com.cisco.model.TokenInfo;
import org.springframework.web.client.RestTemplate;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Optional;
import java.util.UUID;

/**
 * Complete a full login for the user. The flow is as follows:<br>
 * 1. The system internet browser is opened by this class.<br>
 * 2. A server is initiated on the specified port.<br>
 * 3. The user completes the login through the window.<br>
 * 4. The redirect URI is invoked by Webex authentication services<br>
 * 5. The local server receives the redirect data and parses the authorization code<br>
 * 6. The server is shut down and an access token is generated using the authorization code<br>
 * <br>
 * Important - the redirect URI specified when creating the integration must be the hostname,
 * loop-back address or ip address of the machine running this class, otherwise the server will not receive an update
 * via the redirect URI. This is a simple example, and the server running here completely ignores the resource in the
 * URL, it only reads the code from the URL from the Webex authentication service.
 */
public class InteractiveAuthFlowAccessTokenProvider extends AccessTokenProvider {

    private static final Duration SOCKET_LISTEN_TIMEOUT = Duration.ofMinutes(2);

    private URI redirectUri;
    private final OAuthInputProvider oAuthInputProvider;
    private final String state;

    public InteractiveAuthFlowAccessTokenProvider(final OAuthInputProvider oAuthInputProvider,
                                                  final TokenPersister tokenPersister,
                                                  final RestTemplate restTemplate) {
        super(tokenPersister, restTemplate, oAuthInputProvider);
        this.oAuthInputProvider = oAuthInputProvider;
        this.state = UUID.randomUUID().toString();
    }

    @Override
    protected TokenInfo login() {
        this.redirectUri = URI.create(this.oAuthInputProvider.getRedirectUri());
        initiateBrowserLogin();
        var authorizationCode = startServerAndWaitForToken();

        if (authorizationCode.isEmpty()) {
            // unauthorized or user did not interact with browser
            System.err.println("Failed to authenticate user.");
            throw new RuntimeException();
        }

        return obtainAccessTokenWithAuthorizationCode(this.oAuthInputProvider.getClientId(),
                this.oAuthInputProvider.getClientSecret(),
                authorizationCode.get(),
                this.oAuthInputProvider.getRedirectUri());
    }

    private void initiateBrowserLogin() {
        try {
            final var scopesString = String.join(" ", this.oAuthInputProvider.getScopes());
            final var clientId = this.oAuthInputProvider.getClientId();
            this.oAuthInputProvider.getClientSecret();  // request the client secret to ensure it is set before the browser is opened
            Desktop.getDesktop()
                    .browse(URI.create("https://webexapis.com/v1/authorize?client_id=" + clientId +
                            "&redirect_uri=" + this.redirectUri.toString() + "&response_type=code&" +
                            "scope=" + URLEncoder.encode(scopesString, StandardCharsets.UTF_8).replace("+", "%20") +
                            "&state=" + this.state));   // set state to prevent CSRF attacks. State will be validated when redirect is processed
        } catch (final IOException e) {
            // browser failed to launch
            System.err.println("Failed to open browser for user login.");
            throw new RuntimeException(e);
        }
    }

    private Optional<String> startServerAndWaitForToken() {
        try (final var serverSocket = new ServerSocket(this.redirectUri.getPort())) {
            serverSocket.setSoTimeout((int) SOCKET_LISTEN_TIMEOUT.toMillis());
            return waitForAuthCodeFromRedirect(serverSocket);
        } catch (final IOException e) {
            // could not bind to socket
            System.err.println("Failed to start server to listen for auth redirect. Please ensure that port " +
                    this.redirectUri.getPort() + " is not in use.");
            throw new RuntimeException(e);
        }
    }

    private Optional<String> waitForAuthCodeFromRedirect(final ServerSocket serverSocket) {
        try (final var clientSocket = serverSocket.accept()) {
            return readFromSocketAndExtractToken(clientSocket);
        } catch (final IOException e) {
            System.err.println("Failed to accept browser redirect.");
            return Optional.empty();
        }
    }

    private Optional<String> readFromSocketAndExtractToken(final Socket socket) {
        try {
            final var inputStream = socket.getInputStream();
            final var reader = new BufferedReader(new InputStreamReader(inputStream));
            final var line = reader.readLine();

            // the HTTP request will have the code in the first line and will be in the following format
            // GET /{path}?code={codeHere} HTTP/1.1
            final var authorizationCode = extractVarFromLine("code=", line);

            if (authorizationCode.isEmpty() ||
                    !this.state.equals(extractVarFromLine("state=", line).orElse(null))) {
                displayErrorPageToUserBrowser(socket);
            } else {
                displaySuccessPageToUserBrowser(socket);
            }

            return authorizationCode;
        } catch (final IOException e) {
            System.err.println("Could not read redirect data from the socket");
            return Optional.empty();
        }
    }

    private void displaySuccessPageToUserBrowser(final Socket socket) {
        try {
            final var outputStream = socket.getOutputStream();
            final var httpResponse = """
                    HTTP/1.1 200 OK\r
                    \r
                    <html>
                        <body>
                            Successfully logged in. You can close this window
                        </body>
                    </html>
                    """;
            outputStream.write(httpResponse.getBytes(StandardCharsets.UTF_8));
        } catch (final IOException e) {
            // ignore the failure when trying to display the response to the browser
        }
    }

    private void displayErrorPageToUserBrowser(final Socket socket) {
        try {
            final var outputStream = socket.getOutputStream();
            final var httpResponse = """
                    HTTP/1.1 200 OK\r
                    \r
                    <html>
                        <body>
                            Failed to log in. Please check the requested user has the necessary permissions and the specified integration has the required scopes and then try again.
                        </body>
                    </html>
                    """;
            outputStream.write(httpResponse.getBytes(StandardCharsets.UTF_8));
        } catch (final IOException e) {
            // ignore the failure when trying to display the response to the browser
        }
    }

    /**
     * Extract the variable from the line in the format of
     * GET /path?code={authCode}&state={state} HTTP/1.1
     * @param varName the variable from the line, e.g. code= or state=
     * @param line the full line where the data is being extracted from
     * @return the extracted variable, if it is present, otherwise an empty optional
     */
    private Optional<String> extractVarFromLine(final String varName, final String line) {
        final var startOfVar = line.indexOf(varName) + varName.length();

        final var indexOfNextParam = line.indexOf("&", startOfVar);
        var endOfVar = line.indexOf(" ", startOfVar);

        if (indexOfNextParam != -1) {
            endOfVar = indexOfNextParam;
        }

        if (startOfVar == varName.length() -1 || endOfVar == -1) {
            return Optional.empty();
        }

        return Optional.of(line.substring(startOfVar, endOfVar));
    }
}
