# Webex Partner Reference Application

## Introduction

The Webex Partner Reference Application is an example project designed to demonstrate the usage of various APIs and services provided by Cisco and is tailored at our Service Providers use cases.

It serves as a practical example for developers to understand how to interact with Cisco's APIs, manage resources, and implement common use cases such as managing Wholesale customer organizations, users, locations, phone numbers, and devices.

## Purpose

The application is intended to:

*   Provide a reference implementation for interacting with Cisco's APIs, specifically for Webex Wholesale provisioning.
*   Showcase best practices for API integration, error handling, and data validation.
*   Serve as a starting point for developers building their own applications using Cisco's APIs.

## Features

*   **Interactive authorization flow:**
    *   Authenticate users interactively to obtain access tokens for API calls.
    *   Handle token refresh and error scenarios.

*   **Wholesale customer and subscriber provisioning:**
    *   Provision wholesale customers and subscribers.
    *   Manage subscriber details, including phone numbers and devices.

*   **Webex Calling configuration:**
    *   Set up PSTN connections for calling locations.
    *   Assign phone numbers to locations and subscribers.
    *   Configure subscriber devices.

*   **Journey menus:**
    *   Provide guided workflows for complex operations, such as renaming an organization.

*   **Individual API Menus:**
    *   Allow direct interaction with specific APIs for granular operations.

## Menus

This reference application provides an interactive menu which provides the following:

### Onboarding Journey Menu

Journey menus provide guided workflows for performing complex, multi-step operations.

These workflows abstract the underlying API calls and present a user-friendly interface for completing tasks.

There are 3 separate journeys provided:

*   **Onboard and Configure Customer** - Provisions a Wholesale customer organization, verifies partner administrator delegated authorization to access the organization is available, along with setting up Webex Calling location, PSTN connection and phone numbers.
*   **Onboard and Configure Subscriber** - Provisions a Wholesale subscriber along with assigning a phone number and extension, and creating a device for that user.
*   **Rename Organization** - Demonstrates how to rename a customer organization, utilising conversion mechanisms between Base64 Webex URI resource format and UUID format.

### Individual APIs Menu

These menus allow users to interact with specific APIs directly. For example:

*   List Wholesale Customers - List the Wholesale customers managed by your Partner organization.
*   Get a Wholesale Customer - Get the details of a particular Wholesale customer.
*   Provision a Wholesale Customer - Provision a new Wholesale customer in your Partner organization.
*   Create a Location - Create a Webex Calling location in a customer organization.
*   Set up PSTN Connection - Configure the PSTN carrier provider for a particular Webex Calling location.
*   Get an Organization's Details - Retrieve details for a particular organization.

## Architecture

The application is built using a modular architecture to ensure separation of concerns and maintainability. It leverages the following technologies:

*   Java: The primary programming language for the application.
*   Spring Boot: Used for dependency injection and component management.
*   Gradle: For build automation and dependency management.
*   Gson: For JSON serialization and deserialization.

### Key Components

*   **Managers:** These classes encapsulate the business logic for interacting with specific API endpoints. For example:
    *   Wholesale Customer Manager: handles operations for provisioning and managing Wholesale customers.
    *   Wholesale Subscriber Manager: Handles operations for provisioning and managing Wholesale subscribers.
    *   LocationManager: Manages operations related to locations.
    *   OrganizationManager: Handles organization-related operations.
*   **Input Providers:** These classes handle user input, and provide the necessary data to the managers. For example:
    *   WholesaleCustomerInputProvider: Collects input for Wholesale customer operations.
*   **Mappers:** These classes are responsible for converting internal data models into API request objects for outgoing API calls. For example:
    *   WholesaleCustomerMapper: Maps the `WholesaleCustomerDetails` internal data model to a `ProvisionAWholesaleCustomerRequest` object for API communication.
*   **Utility Classes:** These include helper classes for common tasks, such as:
    *   PagingUtil: Handles pagination for API responses.
    *   ErrorResponseParser: Extracts error details from API responses.
*   **Client Layer:** The WebexClient class acts as the primary interface for making API calls to Cisco's services.
*   **Authorization Layer:** Provides functionality for obtaining and managing access tokens, including an interactive web browser based OAuth authorization flow.
*   **Models:** These are data models representing the structure of API request and responses. They are used for serialization and deserialization of JSON data.

### Layout

The project is organized into the following modules and packages:

*   `manager`: Contains manager classes that encapsulate business logic for interacting with APIs.
*   `input`: Includes input provider classes for collecting user input.
*   `mapper`: Contains mappers for converting internal data models into API request objects.
*   `model`: Defines data models used throughout the application.
*   `auth`: Provides functionality for managing access tokens, including obtaining, refreshing, and attaching them to API requests for secure authentication.
*   `client`: Includes the `WebexClient` class for making API calls and handling responses.
*   `util`: Provides utility classes for common tasks like pagination and error parsing.

## Installation

1.  **Prerequisites**
    *   Java 21.
    *   Gradle 7.0 or higher.
    *   Webex Partner administration account in Partner organization.
    *   Webex Integration created.
    
		> **Note**: When creating the *Webex Integration*, it is recommended to do the following:
		> 
		> Set the Redirect URI(s) to a local callback URL
		> e.g.
		>
		> - `http://localhost:4200/authorize`
		> 
		> (Also see related item `Step 4. Add Configuration`) 
		> 
		> Enable the following scopes:
		> 
		> - spark-admin:wholesale\_customers\_write, spark-admin:wholesale\_customers\_read
		> 
		> - spark-admin:wholesale\_subscribers\_write, spark-admin:wholesale\_subscribers\_read
		> 
		> - spark-admin:telephony\_config\_write, spark-admin:telephony\_config\_read
		> 
		> - spark-admin:telephony\_pstn\_write, spark-admin:telephony\_pstn\_read
		> 
		> - spark-admin:locations\_write, spark-admin:locations\_read
		> 
		> - spark-admin:devices\_write, spark-admin:devices\_read
		> 
		> - spark-admin:organizations\_write, spark-admin:organizations\_read
		> 
		> - identity:people\_rw, identity:people\_read
		> 
		> - identity:organizations\_rw, identity:organizations\_read
		> 
		> - spark:all
		> 
		> - spark:calls\_write, spark:calls\_read
		> 
		> - spark:people\_write
		> 
		> - spark:devices\_write, spark:devices\_read
		> 
		> - spark:telephony\_config\_write, spark:telephony\_config\_read
		> 
		> - spark:organizations\_read


2.  **Obtain the source code**

    Navigate to <https://github.com/webex/PartnerAdministrationRefApp> GitHub repository

    Download the ZIP File or clone the repository using git

    e.g.

    ```bash
    git clone https://github.com/webex/PartnerAdministrationRefApp
    cd PartnerAdministrationRefApp
    ```

3.  **Run the Application:**

    Start the application using Gradle:

    Windows:

    ```bash
    gradlew bootRun
    ```

    MacOS/Linux:

    ```bash
    ./gradlew bootRun
    ```

4.  **Add Configuration:**

    Optionally update the `referenceApp/src/main/resources/application.properties` configuration file with various configurations as desired, as an alternative to entering it when prompted at application startup. For example:

    *   Webex Integration OAuth Client ID
    *   Webex Integration OAuth Secret
    *   Webex Integration Redirect URI
    *   Onboarding Template Provisioning ID
    *   PSTN Connection Provider ID
    
> **Tip**: For the *PSTN Connection Provider ID* configuration property, use the `Try It` section of the [Retrieve PSTN Connection Options for a Location](https://developer.webex.com/docs/api/v1/pstn/retrieve-pstn-connection-options-for-a-location) API reference on the [Webex for Developers](https://developer.webex.com/) portal to select the ID of the desired PSTN connection provider.


## How to Use

1.  **Start the Application:**

    Run the application using the instructions above.

    Windows:

    ```bash
    gradlew bootRun
    ```

    MacOS, Linux:

    ```bash
    ./gradlew bootRun
    ```

2.  **Navigate Menus:**

    *   Use the **Journey Menu** for guided workflows like provisioning a Wholesale customer or renaming an organization.
    *   Use the **API Menu** for specific API operations.

3.  **Perform Operations:**

    *   Follow the prompts to provide necessary inputs for the selected menu item.

4.  **API Integration:**

    *   Refer to the `WebexClient` class for examples of API calls.

## License

This project is licensed under the MIT License. See the `LICENSE` file for details.

This application is for reference purposes only. Cisco Systems takes no responsibility for any issues arising from reuse of the source code contained within this application.