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

      | name          | code |
      | Programming12 | PR12 |
      | Gaming12      | GM12 |
      | History12     | HS12 |
      | English12     | EN12 |

  Scenario Outline: The User Edit Subject Categories under Education
    When User Click to Education
    Then User CLick to Setup
    Then User Click to Subject Categories
    And  User Search the Category searchText as "<searchText>"
    And   User Edit  New Subject Categories name as "<name>" and code as "<code>"


    Examples:
      | name          | searchText | code |
      | Programming12 | Physik     | Ps   |
      | Gaming12      | Sport      | St   |
      | History12     | Erdkunde   | Ek   |
      | English12     | Geschicte  | Gt   |
