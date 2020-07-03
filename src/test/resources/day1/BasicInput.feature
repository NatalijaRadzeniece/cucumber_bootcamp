Feature: First test with passing input

#  Background:
#  Given I navigated to Selenium site
  # then its all the same for all scenarius

  @Input
  Scenario: Add input and verify it added.
    Given I navigated to Selenium site
    When  I add text 'Unicorns'
    And i click button show msg
    Then My msg displayed