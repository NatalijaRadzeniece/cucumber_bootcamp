Feature: Testing pass input with data table using Map

  @map
  Scenario: Populate Name and Comment using Map
    Given I am on Ajax Form page
    When I will add:
    | name    | Ariel           |
    | comment | please add this |
    And click on Subbmit button
    Then I see 'Form submited Successfully!' message