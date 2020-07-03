
@TestFeature
Feature: First Test in cucumber
# 1 Scenario=1 Test
  @TestScenario2
  Scenario: First test
    Given open site HeroKuapp
    When I click Add button
    Then button Delete added
# 2 Scenario=1 Test
  @TestScenario3
  Scenario:Second test
    Given open site bookSite
    When I click Chapter 2 button
    Then button Button with Name added

