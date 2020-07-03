Feature: Testing pass input with data table using Map

  Scenario: Populate Name and Coment using map
    Given Im on Ajax Form page
    When I add:
      | name    | Dave            |
      | comment | this is comment |
    And click on Sumbit button
    Then I see 'Form submited Successfully!'
