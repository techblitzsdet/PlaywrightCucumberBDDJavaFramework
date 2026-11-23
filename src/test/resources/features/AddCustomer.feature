Feature: Add a customer in the banking application
  As a bank employee
  I want to add a customer
  So that the customer can be associated with a bank account

  Background:
    Given I am on the "Banking App" page
    And the "Add Customer" tab is open

  Scenario Outline: Add a new customer
    When I enter "<first_name>" in the First Name field
    And I enter "<last_name>" in the Last Name field
    And I enter "<post_code>" in the Post Code field
    And I click the Add Customer button
    And I confirm the customer addition if prompted
    Then the customer should appear in the Customers list with first name "<first_name>" and last name "<last_name>"

    Examples:
      | first_name | last_name | post_code |
      | Bhabani    | Shankar   | 560001    |
      | Alex       | Morgan    | 10001     |