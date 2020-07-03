#@TestScenario
Feature: First Test in cucumber

  @TestScenario
  Scenario: First test
    Given open site HeroKuapp
    When I click Add button
    Then button Delete added



  Scenario: Second test
    Given open site book
    When click Chapter2
    Then button with name appears
