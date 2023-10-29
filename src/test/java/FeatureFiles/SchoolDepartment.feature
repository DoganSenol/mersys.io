Feature: School Departments Functionality

  Background:
    Given Navigate to website
    And   Enter username that as "username" and password that as "password"
    When  Click login button
    Then  Verify that user logged in

  Scenario: Add New School Department
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

  Scenario: Edit School Department
    When  Click on the element in SchoolPage
      | setupLink   |
      | schoolSetup |
      | departments |
    Then  Click on the Element in DialogPage
      | activeButton |
      | editButton   |
    And  User Edit School Departments with ApachePOI
      | nameInput                       |
      | codeInput                       |
      | activeButtonOnSchoolDepartments |
      | sectionButton                   |
      | EditButtonInSchoolDepartments   |
      | nameInput                       |
      | shortNameInput                  |
      | activeButtonOnSchoolDepartments |
      | EditButtonInSchoolDepartments   |
      | departmentParametersButton      |
      | valueButton                     |
      | keyInput                        |
      | valueInput                      |
      | EditConfirmInSchoolDepartments  |
      | saveButton                      |
    Then Success Message should be displayed


