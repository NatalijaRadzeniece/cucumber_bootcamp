@TestFeature
Feature: First Test in cucumber

#  1 Scenario = 1 Test
  @TestScenario1
  Scenario: First test
    Given open site HeroKuapp
    When I click Add button
    Then button Delete added

  @TestScenario2
  Scenario: Verify button on page
    Given Im on Tester site
    When click on Chapter 2
    Then button with name appeared.