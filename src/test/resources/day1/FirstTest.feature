@TestFeature
Feature: First Test in cucumber

  @TestScenario1
  Scenario: First test
    Given open site HeroKuapp
    When I click Add button
    Then button Delete added

#   // open site http://the-internet.herokuapp.com/add_remove_elements/
#    // click add button
#    // verify button appeared
  @TestScenario2
  Scenario: Second test
    Given open site TheAutomatedTester
    When I click on Chapter two
    Then I see Button With Name

