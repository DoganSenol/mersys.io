Feature: Add Subjects functionality

  Background:
    Given Navigate to website
    And   Enter username that as "username" and password that as "password"
    When  Click login button
    Then  Verify that user logged in

  Scenario Outline: The User Add New Subject Categories under Education
    When  User Click to Education
    Then  User CLick to Setup
    And   User Click to Subject Categories
    And   User Create  New Subject Categories name as "<name>" and code as "<code>"
    And   Success Message should be displayed
    When  User Create  New Subject Categories name as "<name>" and code as "<code>"
    Then  Already exist message should be displayed
    Examples:

      | name         | code |
      | Programming1 | PR1  |
      | Gaming1      | GM1  |
      | History1     | HS1  |
      | English1     | EN1  |
