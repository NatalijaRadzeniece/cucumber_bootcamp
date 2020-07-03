Feature: Doing our first test with passing input
Background:
  Given I navigated to Selenium Easy site

@input
  Scenario: Add input and verify it added.
    When I add text 'piupiu'
    And I click button Show message
    Then My message displayed

  Scenario: Add another input
    When I add text 'pww'
    And I click button Show message
    Then My message displayed