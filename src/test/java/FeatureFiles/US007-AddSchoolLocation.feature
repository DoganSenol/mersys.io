Feature:  School Location Functionality

  Background:
    Given Navigate to website
    And   Enter username that as "username" and password that as "password"
    When  Click login button
    Then  Verify that user logged in

  Scenario Outline: Add School Location

    When  Click on the element in SchoolPage
      | setupLink   |
      | schoolSetup |
      | Locations   |
    Then  Click on the Element in DialogPage
      | AddButton |

    And   User Sending Keys in DialogPage
      | nameInput      | <name>      |
      | shortNameInput | <shortName> |
      | capacityInput  | <capacity>  |

    Then  User Click randomly LocationType
      | selectButton |
      | LocationType |

    When Click on the Element in DialogPage
      | activeButtonOn |
      | saveButton     |

    And   Success Message should be displayed

    Examples:
      | name   | shortName | capacity |
      | ben1   | asas11    | 953      |
      | sen1   | sfsd11    | 753      |
      | biz1   | Nfdsa11   | 453      |
      | onlar1 | asdasd1   | 783      |


