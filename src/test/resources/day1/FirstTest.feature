@TestFeature
Feature: First Test in cucumber

  @TestScenario1
  Scenario: First test
    Given open site HeroKuapp
    When I click Add button
    Then button Delete added

    @TestScenario2
    Scenario: Second test
      Given  open site TheAutomatedTester
      When I click Chapter two button
      Then button With Name appears




