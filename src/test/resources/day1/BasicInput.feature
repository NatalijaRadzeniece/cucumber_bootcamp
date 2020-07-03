Feature: Basic Input Steps
  Background:
    Given I navigated to Selenium Easy site

@Input
Scenario: Add input and verify it added.
  When I add text 'asda'
  And I click button Show message
  Then My message displayed

  Scenario: Add input another
    When I add text 'hello'
    And I click button Show message
    Then My message displayed
