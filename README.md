# Mashtura Automation Suite

This project is an automation suite built with Selenium WebDriver, TestNG, and Java. It is designed to automate tests for login, user creation, date manipulation, and email verification processes.

## Project Structure

```
mashtura-automation/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── mashtura/
│   │   │           └── tests/
│   │   │               ├── base/
│   │   │               │   ├── BaseTest.java
│   │   │               │   └── WebDriverManagerUtil.java
│   │   │               ├── pages/
│   │   │               │   ├── LoginPage.java
│   │   │               │   ├── UserCreationPage.java
│   │   │               │   ├── DateManipulationPage.java
│   │   │               │   └── EmailVerificationPage.java
│   │   │               └── tests/
│   │   │                   ├── LoginTest.java
│   │   │                   ├── CreateUserTest.java
│   │   │                   ├── DateManipulationTest.java
│   │   │                   └── EmailVerificationTest.java
└── resources/
    └── testng.xml
```

## Overview

### **Base Directory (`base/`)**
Contains the core utility classes that set up and manage the WebDriver and handle the base test functionality.
- **BaseTest.java**: This class initializes the WebDriver and contains setup/teardown methods for running tests.
- **WebDriverManagerUtil.java**: A utility class to manage the WebDriver binaries and configurations for different browsers.

### **Pages Directory (`pages/`)**
Contains the page object classes, each representing a web page or component of the web application under test.
- **LoginPage.java**: Contains methods for interacting with the login page.
- **UserCreationPage.java**: Contains methods for interacting with the user creation page.
- **DateManipulationPage.java**: Handles interactions with the date picker or calendar component.
- **EmailVerificationPage.java**: Handles interactions for email verification.

### **Tests Directory (`tests/`)**
Contains the actual test classes for the various functionalities that need to be automated.
- **LoginTest.java**: Contains tests for the login functionality.
- **CreateUserTest.java**: Contains tests for the user creation functionality.
- **DateManipulationTest.java**: Contains tests to verify that date manipulations are functioning correctly.
- **EmailVerificationTest.java**: Contains tests to verify the email verification process.

### **Resources**
- **testng.xml**: The TestNG configuration file that defines the test suite and test execution parameters.

## Prerequisites

To run this project, make sure you have the following installed:

- Java 17 (or later)
- Maven
- Selenium WebDriver
- TestNG

## Setup Instructions

1. Clone the repository to your local machine.

```bash
git clone https://github.com/mashtura-m/seleniumTestNG-automation-suite.git
```

2. Navigate to the project directory.

```bash
cd seleniumTestNG-automation-suite
```

3. Ensure you have all the dependencies by running Maven.

```bash
mvn clean install
```

4. Set the WebDriver for the desired browser (e.g., ChromeDriver or GeckoDriver).

5. Run the tests using Maven.

```bash
mvn test -DsuiteXmlFile=resources/testng.xml
```

## Running Tests

- To run specific tests, you can specify the class name using the `-Dtest` flag.

```bash
mvn test -Dtest=LoginTest
```

## Test Suite

- The **TestNG** test suite is defined in the `testng.xml` file located in the `resources/` directory. It includes all the tests in the `tests/` directory.

## Project Configuration

### **TestNG**
- **testng.xml** defines the test suite for the project and includes the test classes to be executed.
  
### **WebDriver Setup**
- The `WebDriverManagerUtil.java` ensures that the correct version of the WebDriver for the browser (Chrome/Firefox) is automatically managed.

## Contribution

Feel free to fork this repository, clone it, and submit pull requests for any enhancements or fixes. Make sure to follow the coding standards used in the project.

### License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- Selenium WebDriver
- TestNG
- Maven
