Feature: Testing pass input with data table using Map

  Scenario: Populate Name and Comment using Map
    Given Im on Ajax Form page
    When I add:
      | name    | Ariel           |
      | comment | please add this |
    And click on Submit button
    Then I see 'Form submited Successfully!' message
