Feature: Testing pass input with dat Table using Map
@MapExample
  Scenario: Populate Name and Comment using Map
    Given  Im on Ajax Form page
    When I add:
      | name    | Ariel           |
      | comment | please add this |
    And click on Submit button
    Then I see 'Form submited Successfully!' message


