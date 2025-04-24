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
package com.cisco.util;

import org.springframework.stereotype.Component;

import java.security.SecureRandom;

@Component
public class MacAddrUtil {

    /**
     * Provide a default MAC address for demonstration purposes.
     *
     * The MAC addresses provided here are in the Locally Administered Address range that fall within the range
     * 02:00:00:FF:00:00 to 02:00:00:FF:FF:FF.
     * These addresses are intended solely for demonstration purposes within the Webex cloud service.
     *
     * They are not globally unique and should not be used in production environments where real-world device
     * interoperability is required.
     * You must assign unique MAC addresses to your devices to avoid network conflicts.
     *
     * Cisco Systems Inc. is not responsible for any issues arising from the use of these demonstration MAC addresses in
     * a live network.
     *
     * @return A string representing the generated MAC address in the format 00:00:00:FF:XX:XX
     */
    public static String generateRandomMacAddress() {
        final var random = new SecureRandom();
        return String.format("02:00:00:FF:%02X:%02X", random.nextInt(256), random.nextInt(256));
    }
}
