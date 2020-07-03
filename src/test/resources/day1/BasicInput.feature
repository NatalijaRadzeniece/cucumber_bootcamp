Feature: Doing our first test with passing input
Background:
  Given I navigated to Selenium Easy site

@input
  Scenario: Add input and verify it added.
    Given I navigated to Selenium Easy site
    When I add text 'Unicorns'
    And I click button Show message
    Then My message displayed

  Scenario: Add another
    Given I navigated to Selenium Easy site
    When I add text 'Money'
    And I click button Show message
    Then My message displayed