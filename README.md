# eDot Automation Testing with Katalon

This repository contains automation test scripts for the edot.id website, utilizing Katalon Studio. The test cases cover essential functionalities to ensure a smooth user experience on the site.

## Table of Contents
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Test Cases](#test-cases)
  - [1. Open eSuite Page from Home Page](#1-open-esuite-page-from-home-page)
  - [2. Submit Valid Contact Us Form](#2-submit-valid-contact-us-form)
  - [3. Apply Filter on Articles Page](#3-apply-filter-on-articles-page)
- [Execution](#execution)
- [Contributing](#contributing)
- [License](#license)

## Prerequisites

Before running the tests, ensure you have the following installed:
- [Katalon Studio](https://www.katalon.com)
- Java Development Kit (JDK) 8 or higher
- Git

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/edotid-automation.git
2. Open the project in Katalon Studio.
3. Configure the necessary environment variables and test data as needed.

## Test Cases

1. Open eSuite Page from Home Page
   - Objective:
       Verify that users can navigate to the eSuite page from the home page.
   - Steps:
      - Launch the browser and navigate to the edot.id home page.
      - Click "Products" on the header
      - Click 'eSuite"
      - Verify that the eSuite page is displayed.
   - Expected Result:
      The eSuite page should load successfully with all expected elements visible.

2. Submit Valid Contact Us Form
   - Objective:
      Ensure that users can submit a valid "Contact Us" form.
   - Steps:
      - Navigate to the Contact Us page from the home page.
      - Fill in the form with valid details (Name, Email, Phone Number, etc.).
      - Submit the form.
      - Verify that a success message is displayed.
   - Expected Result:
      A confirmation message should appear, indicating that the form was submitted successfully.

3. Apply Filter on Articles Page
   - Objective:
       Validate the functionality of the filter feature on the Articles page.
   - Steps:
      - Navigate to the Articles page from the home page.
      - Apply a specific filter.
      - Verify that the displayed articles match the applied filter criteria.
   - Expected Result:
      The articles displayed should correspond to the filter applied.

  ## Execution
    - To execute the tests:
    - Open Katalon Studio.
    - Select the desired test suite or individual test cases.
    - Click on the "Run" button to start the test execution.
    - Results will be displayed in the Katalon Studio console and the Test Explorer pane.
