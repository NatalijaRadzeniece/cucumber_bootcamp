Feature: Testing pass input with data table using Map

  Scenario: Populate Name and Comment using Map
    Given I am on Ajax Form page
    When I add:
      | name    | Mark                |
      | comment | Let's play the Game |
    And click on Submit Button
    Then I see 'Form submited Successfully!'