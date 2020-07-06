Feature: Doing our first test with passing input
  Background:
    Given I navigated to Selenium Easy site

  @Input
  Scenario: Add input and verify it added
    When I add text 'meow'
    And I click button Show message
    Then My message displayed

