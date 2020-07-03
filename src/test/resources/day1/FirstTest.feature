@TestFeature
Feature: First Test in cucumber

  # 1 Scenario = 1 Test
  @TestScenario1
  Scenario: First test
    Given open site HeroKuapp
    When I click Add button
    Then button Delete added
  @TestScenario2
  Scenario: Second test
    Given open site AutomatedTester
    When I click Chapter2 button
    Then button WithName added
