@TestFeature
Feature: First Test in cucumber

  #//to run one scenario tag must be here before it
  @TestScenario1
  Scenario: First test
    Given open site HeroKuapp
    When I click Add button
    Then extra button Delete added

    #open site http://book.theautomatedtester.co.uk/
    #click add Chapter two
    #see be able to
  @TestScenario2
  Scenario: Second test
    Given open site TheAutomatedTester
    When I click chapter two
    Then I see other Buuton with name