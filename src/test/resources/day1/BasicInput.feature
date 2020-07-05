Feature: Doing our first test with passing input

  Background:
    Given I navigated to Selenium Easy site

  @Input
  Scenario: Add input and verify it added.
    Given I navigated to Selenium Easy site
    When I add text 'Corgies'
    And  I click button Show message
    Then My message displayed

    Scenario: Add another input
      When I add text 'Dalmatians'
      And  I click button Show message
      Then My message displayed