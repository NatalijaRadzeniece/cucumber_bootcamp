Feature: Testing pass input using map

  Scenario: Populate Name and Comment using Map
    Given I'm on Ajax Form page
    When I add :
    |name   | Ariel         |
    |comment|please add this|
    And click on Submit button
    Then I see 'Form submited Successfully!' message
