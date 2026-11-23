Feature: Open a bank account
  As a bank employee
  I want to open an account for a customer
  So that the customer can use the selected currency account

  Background:
    Given I am on the "Banking App" page
    And the "Open Account" tab is open

  Scenario Outline: Open an account for a customer
    When I select "<customer>" from the Customer dropdown
    And I select "<currency>" from the Currency dropdown
    And I click the Process button
    Then I should see a confirmation that the account was created

    Examples:
      | customer       | currency |
      | Bhabani Shankar| Dollar   |
      | Alex Morgan    | Pound    |
      | Sam Taylor     | Rupee    |