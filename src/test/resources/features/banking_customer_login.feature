Feature: Customer login to the banking application
  As a registered customer
  I want to select my name and log in
  So that I can access my bank account

  Background:
    Given I am on the "Way2Automation Banking App" customer login page

  Scenario Outline: Log in as a registered customer
    When I select "<customer_name>" from the Your Name dropdown
    Then the Login button should be displayed
    When I click the Login button
    Then I should be logged in as "<customer_name>"
    And I should see my account information

    Examples:
      | customer_name    |
      | Hermione Granger |
      | Harry Potter     |
      | Ron Weasly       |
