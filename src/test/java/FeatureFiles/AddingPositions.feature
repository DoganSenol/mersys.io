Feature: Adding Positions

  Background:
    Given Navigate to website
    And Enter username that as "username" and password that as "password"
    When Click login button
    Then Verify that user logged in

  Scenario Outline: Adding New Positions to the Admin Panel
    When the user navigates to Positions
      | Human Resources |
      | Setup           |
      | Position        |

    And Click on the Element in DialogPage
      | AddButton |

    And User Sending Keys in DialogPage
      | nameInput      | <name>      |
      | ShortNameInput | <shortName> |

    And Click on the save button in Dialog
      | saveButton |

    Then Success Message should be displayed


    And User Sending Keys in DialogPage
      | fieldNameInput | <name> |

    And Click on the Element in DialogPage
      | searchButton |

    And Click on the Edit Button

    And User Sending Keys in DialogPage
      | nameInput | <newName> |

    And Click on the Element in DialogPage
      | saveButton |

    Then Success Message should be displayed

    And User Sending Keys in DialogPage
      | fieldNameInput | <newName> |

    And Click on the Element in DialogPage
      | searchButton |

    And Click on the Element in DialogPage
      | deleteIcon   |
      | deleteButton |

    Then Success Message should be displayed

    Then there should be a search button on the page

    Then there should be an option to enable and disable positions with options "active" and "deactivate"

    Examples:
      | name     | shortName | newName  |
      | 4OtCkN15 | 4OtCkNf0  | 4OtCkN45 |

