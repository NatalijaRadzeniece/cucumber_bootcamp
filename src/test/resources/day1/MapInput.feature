Feature: Testing pass input with data table using Map

  @map
  Scenario: Populate Name and Comment using Map
    Given I am on Ajax Form page
    When I add:
      | name    | Dawka           |
      | comment | please help me |
    And click on Submit button
    Then I see 'Form submited Successfully!'
