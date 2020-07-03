Feature: Testing pass input with data table using Map
  @TestMapBoris
  Scenario: Populate Name and Comment using Map
    Given Im on Ajax Form page
    When I add:
      | name    | BorisTheBlade |
      | comment | Where is money, Lebowski? |
    And click on submit button
    Then I see 'Form submited Successfully!'