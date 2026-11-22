@register
Feature: User registration
  As a visitor
  I want to complete the registration form
  So that I can register my account

  Background:
    Given I am on the "Way2Automation Sample Form" page
#    And I validate banking app page title

  Scenario Outline: Register with valid details
    When I enter "<first_name>" in the First Name field
    And I enter "<last_name>" in the Last Name field
    And I enter "<email>" in the Email field
    And I enter a valid "password" in the Password field
    And I select "<gender>" as my Gender
    And I select the hobbies "<hobbies>"
    And I enter "<about>" in the About Yourself field
    And I click the Register button
    Then I should see the confirmation message "User registered successfully!"

    Examples:
      | first_name | last_name | email              | gender | hobbies                  | about                                  |
      | Bhabani    | Shankar   | test@example.com   | Male   | Reading                  | I enjoy learning and exploring things. |
      | Alex       | Morgan    | alex@example.com   | Male   | Traveling, Sports        | I like travel and sports.              |
      | Sam        | Taylor    | sam@example.com    | Male   | none                     | I enjoy meeting new people.            |