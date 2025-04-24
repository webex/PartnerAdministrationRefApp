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

import com.cisco.model.TokenInfo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.util.Optional;

public class FileSystemTokenPersister implements TokenPersister {

    private final String refreshTokenFile;

    public FileSystemTokenPersister(final String refreshTokenFile) {
        this.refreshTokenFile = refreshTokenFile;
    }

    @Override
    public void save(final TokenInfo tokenInfo) {
        try (final var writer = new BufferedWriter(new FileWriter(refreshTokenFile))) {
            writer.write(tokenInfo.getRefreshToken());
            writer.flush();
        } catch (final IOException e) {
            throw new RuntimeException("Failed to save refresh token", e);
        }
    }

    @Override
    public Optional<String> readRefreshToken() {
        final var refreshTokenFileHandle = new File(refreshTokenFile);
        if (!refreshTokenFileHandle.exists()) {
            return Optional.empty();
        } else {
            try (final var reader = new BufferedReader(new FileReader(refreshTokenFileHandle))) {
                return Optional.of(reader.readLine());
            } catch (final IOException e) {
                throw new RuntimeException("Failed to read refresh token file", e);
            }
        }
    }
}
