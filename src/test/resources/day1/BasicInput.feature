Feature: Doing our first test with passing input
  Background:
    Given I navigated to Selenium Easy site

  @TestInput
  Scenario: Add input and verify it added.
    When I add text 'Unicorns'
    And I click button Show message
    Then My message displayed

    Scenario: Add another input
      When I add text 'Money'
      And I click button Show message
      Then My message displayed