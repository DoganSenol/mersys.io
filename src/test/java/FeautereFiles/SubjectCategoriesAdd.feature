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

      | name  | code |
      | pedro | ped  |
      | johan | joh  |
      | cisse | cis  |
      | abdul | abd  |

  Scenario Outline: The User Edit Subject Categories under Education
    When User Click to Education
    Then User CLick to Setup
    Then User Click to Subject Categories
    And  User Search the Category searchText as "<searchText>"
    And   User Edit  New Subject Categories name as "<name>" and code as "<code>"
    Then  Subject Category successfully updated message should be displayed


    Examples:
      | name | searchText | code |
      | saha | pedro      | er1  |
      | maha | johan      | er2  |
      | taha | cisse      | er3  |
      | oha  | abdul      | er4  |
