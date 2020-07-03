@TestFeature
Feature: First Test in cucumber
@TestScenario1
  Scenario: First Test
    Given open site HeroKuapp
    When I click Add button
    Then button Delete added
  @TestScenario2
  Scenario: Second Test
    Given open site Book
    When I click Chapter two button
    Then can see Button with name