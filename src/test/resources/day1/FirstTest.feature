@TestFeature
Feature: First Test in cucumber

  # 1 Scenario = Test 1
  @TestScenario1
  Scenario: First test
    Given open site HeroKuapp
    When I click Add button
    Then button Delete added

  # 2 Scenario = Test 2
  @TestScenario2
  Scenario: Second test
    Given open site TheAutomatedTester
    When I click Chapter2 button
    Then button 'button with name' appeared

