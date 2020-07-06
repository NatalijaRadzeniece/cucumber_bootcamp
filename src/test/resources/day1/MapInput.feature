Feature: Testing pass input with data table using Maps
  @MapInput
  Scenario: Populate Name and Comment using Map
    Given I am on Ajax Form page
    When I add:
      | name    | Sheldon   |
      | comment | bazzinga! |
    And click on Submit button
    Then I see 'Form submited Successfully!'