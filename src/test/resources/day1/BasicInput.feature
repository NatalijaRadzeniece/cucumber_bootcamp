Feature: Doing our first test with passing input
@Input
  Scenario: Ann input and veryfy it added.
    Given I navigate to Selenium Easy site
    When I add text 'Unicorns'
    And I click button Show message
    Then my message displayed