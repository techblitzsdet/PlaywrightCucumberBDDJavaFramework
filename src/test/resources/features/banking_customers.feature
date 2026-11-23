Feature: Manage customers in the banking application
  As a bank employee
  I want to view, search, and remove customers
  So that I can maintain customer records

  Background:
    Given I am on the "Way2Automation Banking App" page
    And the "Customers" tab is open

  Scenario: View the customer list
    Then I should see the customer table
    And the table should show First Name, Last Name, Post Code, Account Number, and Delete columns

  Scenario Outline: Search for a customer
    When I enter "<search_text>" in the Search Customer field
    Then I should see customer rows matching "<search_text>"

    Examples:
      | search_text |
      | Hermione    |
      | E725JB      |

  Scenario Outline: Delete a customer
    When I click Delete for the customer with first name "<first_name>" and last name "<last_name>"
    And I confirm the deletion if prompted
    Then the customer "<first_name> <last_name>" should no longer appear in the customer list

    Examples:
      | first_name | last_name |
      | Hermione   | Granger   |
      | Harry      | Potter    |