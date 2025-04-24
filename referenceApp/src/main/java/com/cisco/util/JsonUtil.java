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

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.Optional;

public final class JsonUtil {
    // Private constructor to prevent instantiation
    private JsonUtil() {
        throw new UnsupportedOperationException("Utility class");
    }

    // Add static utility methods here
    public static String prettyPrintJson(final String json) {
        try {
            final ObjectMapper mapper = new ObjectMapper();
            final Object jsonObject = mapper.readValue(json, Object.class);
            final ObjectWriter writer = mapper.writerWithDefaultPrettyPrinter();
            return writer.writeValueAsString(jsonObject);
        } catch (final Exception e) {
            throw new RuntimeException("Failed to pretty print JSON", e);
        }
    }

    public static Optional<String> getMostRecentCustomerId(final String jsonBody) {
        try {
            final JsonObject jsonObject = JsonParser.parseString(jsonBody).getAsJsonObject();
            final JsonArray customersArray = jsonObject.getAsJsonArray("items");
            if (customersArray != null && customersArray.size() > 0) {
                final JsonObject firstCustomer = customersArray.get(0).getAsJsonObject();
                return Optional.of(firstCustomer.get("id").getAsString());
            }
        } catch (Exception e) {
            System.err.println("Error parsing customer ID from JSON");
            e.printStackTrace();
        }

        return Optional.empty();
    }

    public static Optional<String> getMostRecentSubscriberId(final String jsonBody) {
        try {
            final JsonObject jsonObject = JsonParser.parseString(jsonBody).getAsJsonObject();
            final JsonArray subscribersArray = jsonObject.getAsJsonArray("items");
            if (subscribersArray != null && subscribersArray.size() > 0) {
                final JsonObject firstSubscriber = subscribersArray.get(0).getAsJsonObject();
                return Optional.of(firstSubscriber.get("id").getAsString());
            }
        } catch (Exception e) {
            System.err.println("Error parsing subscriber ID from JSON");
            e.printStackTrace();
        }

        return Optional.empty();
    }

    public static Optional<String> getFirstLocationIdForOrg(final String jsonBody) {
        try {
            JsonObject jsonObject = JsonParser.parseString(jsonBody).getAsJsonObject();
            JsonArray locationsArray = jsonObject.getAsJsonArray("items");

            if (locationsArray != null && locationsArray.size() > 0) {
                JsonObject firstLocation = locationsArray.get(0).getAsJsonObject();
                return Optional.of(firstLocation.get("id").getAsString());
            }
        } catch (Exception e) {
            System.err.println("Error parsing location ID from JSON");
            e.printStackTrace();
        }

        return Optional.empty();
    }
}
