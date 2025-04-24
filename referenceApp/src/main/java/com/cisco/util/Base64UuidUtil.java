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

import java.util.Base64;

public class Base64UuidUtil {
    // Private constructor to prevent instantiation
    private Base64UuidUtil() {
        throw new UnsupportedOperationException("Utility class");
    }

    /**
     * Get the base64 encoded organization resource URI for an organization UUID
     *
     * @param orgUuid the UUID of the organization
     * @return the base64 encoded organization resource URI
     */
    public static String getOrganizationBase64(final String orgUuid) {
        final String formattedString = "ciscospark://us/ORGANIZATION/" + orgUuid;
        return Base64.getUrlEncoder().withoutPadding().encodeToString(formattedString.getBytes());
    }

    /**
     * Get the organization UUID from a base64 encoded organization resource URI
     *
     * @param encodedOrgId the base64 encoded organization resource URI
     * @return the organization uuid
     */
    public static String getOrganizationUuid(final String encodedOrgId) {
        final String decodedString = new String(Base64.getUrlDecoder().decode(encodedOrgId));
        return decodedString.substring(decodedString.lastIndexOf('/') + 1);
    }
}
