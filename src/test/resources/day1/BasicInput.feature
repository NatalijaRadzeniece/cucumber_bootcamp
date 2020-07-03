Feature: First test with passing input

  Background:
    Given I navigated to Selenium Easy site



  @TestScenarioGG
  Scenario: Add input and verify it is added.
    Given I navigated to Selenium Easy site
    When I add text 'GGWP'
    And I click button Show Message
    Then My message displayed

  Scenario: Add another input
    When I add text 'Money'
    And I click button Show Message
    Then My message displayed