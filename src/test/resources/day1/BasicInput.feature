Feature: Doing our first test with passing input

  @InputTest
  Scenario: Add input and verify it added
    Given I navigated to Selenioum Easy site
    When I add text 'Unicorns'
    And I click button Show message
    Then my message displayed