Feature: School Departmetn Functionality

  Background:
    Given Navigate to website
    And   Enter username that as "username" and password that as "password"
    When  Click login button
    Then  Verify that user logged in

  Scenario:
    When  Click on the element in SchoolPage
      | setupLink   |
      | schoolSetup |
      | departments |
    Then  Click on the Element in DialogPage
      | AddButton |
    And User Add New School Departments with ApachePoi
      | nameInput                   |
      | codeInput                   |
      | activeButtonOn              |
      | sectionButton               |
      | activeButtonOn              |
      | nameInput                   |
      | shortNameInput              |
      | addInSchoolDepartmentButton |
      | departmentParametersButton  |
      | keyInput                    |
      | valueInput                  |
      | addInSchoolDepartmentButton |
      | saveButton                  |
    Then Success Message should be displayed
