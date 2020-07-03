@TestFeature
Feature: First Test in cucumber

  @TestScenario1
  Scenario: First test
    Given open site HeroKuapp
    When I click Add button
    Then button Delete added

  @TestScenario2
  Scenario: Verify button on page
    Given open web page TheAutomatedTester
    When I click on Chapter two
    Then button With Name is visible

    #  http://book.theautomatedtester.co.uk/
#  click on "Chapter two"
#  will be able to see "Button With Name"
