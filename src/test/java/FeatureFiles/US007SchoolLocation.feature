Feature:  School Location Functionality

  Background:
    Given Navigate to website
    And   Enter username that as "username" and password that as "password"
    When  Click login button
    Then  Verify that user logged in

  Scenario: : Add School Location
    When  Click on the element in SchoolPage
      | setupLink   |
      | schoolSetup |
      | Locations   |

    Then  Click on the Element in DialogPage
      | AddButton |

    And   User Add the New School Locations


    Then  User Click randomly LocationType
      | selectButton |
      | LocationType |

    When Click on the Element in DialogPage
      | activeButtonOn |
      | saveButton     |
    And   Success Message should be displayed



