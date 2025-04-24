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

import com.cisco.model.ListApiPagingFunction;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.openapitools.client.ApiResponse;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static com.cisco.util.JsonUtil.prettyPrintJson;

public class PagingUtil {

    private static final int DEFAULT_MAX_RECORDS_TO_DISPLAY = 10;

    public static Map<String, Integer> parseLinkHeader(final String linkHeader) {
        final Map<String, Integer> links = new HashMap<>();

        if (linkHeader != null) {
            final var parts = linkHeader.split(",");
            for (var part : parts) {
                final var sections = part.split(";");
                if (sections.length == 2) {
                    final var url = sections[0].trim().substring(1, sections[0].trim().length() - 1);
                    final var rel = sections[1].trim().split("rel=")[1].replace("\"", "").replace("]", "");
                    final var offset = Integer.parseInt(url.split("offset=")[1].split("&")[0]);
                    links.put(rel, offset);
                }
            }
        }

        return links;
    }

    public static <T> String listWithPaginationMenu(final int maxRecords, final String id, final ListApiPagingFunction<String, Integer, Integer, ApiResponse<T>> listFunction) {
        int offset = 0;
        boolean hasNextPage;
        boolean hasPrevPage;

        while (true) {
            final var response = listFunction.apply(id, maxRecords, offset);

            // Assuming T is a type that can be converted to JSON
            final String jsonResponse;
            try {
                jsonResponse = prettyPrintJson(new ObjectMapper().writeValueAsString(response.getData()));
            } catch (final JsonProcessingException e) {
                throw new RuntimeException("Failed to convert data to JSON", e);
            }
            System.out.println(jsonResponse);

            Map<String, Integer> links = parseLinkHeader(String.valueOf(response.getHeaders().get("link")));
            Integer nextOffset = links.get("next");
            Integer prevOffset = links.get("prev");
            hasNextPage = nextOffset != null;
            hasPrevPage = prevOffset != null;

            System.out.println("\n\n###########################");
            System.out.println("Pagination Menu");
            System.out.println("###########################");
            if (hasNextPage) {
                System.out.println("1. Next Page");
            }
            if (hasPrevPage) {
                System.out.println("2. Previous Page");
            }
            System.out.println("0. Return to API menu");
            System.out.println("###########################\n");

            System.out.print("Enter your choice: ");

            final var scanner = new Scanner(System.in);
            var choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    if (hasNextPage) {
                        offset = nextOffset;
                    } else {
                        System.out.println("No next page.");
                    }
                    break;
                case 2:
                    if (hasPrevPage) {
                        offset = prevOffset;
                    } else {
                        System.out.println("No previous page.");
                    }
                    break;
                case 0:
                    System.out.println("Returning to API menu");
                    return "Exiting...";
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static int getMaxRecordsFromUser() {
        final var scanner = new Scanner(System.in);
        var maxRecords = DEFAULT_MAX_RECORDS_TO_DISPLAY;
        while (true) {
            System.out.print("\nEnter the maximum number of records to display [" + DEFAULT_MAX_RECORDS_TO_DISPLAY + "] (max 100): ");
            final var maxRecordsInput = scanner.nextLine().trim();
            if (maxRecordsInput.isEmpty()) {
                break;
            }
            try {
                maxRecords = Integer.parseInt(maxRecordsInput);
                if (maxRecords > 0 && maxRecords <= 100) {
                    break;
                } else {
                    System.out.println("Please enter a positive integer not greater than 100.");
                }
            } catch (final NumberFormatException e) {
                System.out.println("Invalid input. Please enter a positive integer.");
            }
        }
        return maxRecords;
    }
}
