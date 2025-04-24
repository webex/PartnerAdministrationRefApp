package com.cisco.client;

import com.google.gson.JsonParser;

public class ErrorResponseParser {

    public static String extractErrorDescriptionsWithTrackingId(final String errorResponse) {
        final var result = new StringBuilder();
        try {
            final var jsonObject = JsonParser.parseString(errorResponse).getAsJsonObject();
            if (jsonObject.has("errors")) {
                final var errors = jsonObject.getAsJsonArray("errors");
                for (int i = 0; i < errors.size(); i++) {
                    final var error = errors.get(i).getAsJsonObject();
                    if (error.has("description")) {
                        result.append(error.get("description").getAsString());
                        if (i < errors.size() - 1) {
                            result.append(", ");
                        }
                    }
                }
            }
            if (jsonObject.has("trackingId")) {
                result.append(" | Tracking ID: ").append(jsonObject.get("trackingId").getAsString());
            }
        } catch (final Exception e) {
            System.out.println("Error parsing errorResponse: " + e.getMessage());
        }
        return result.toString();
    }
}
