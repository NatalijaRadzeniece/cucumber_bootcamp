#A feature would describe the current test script which has to be executed.
Feature: Sample
  #Scenation: - is our test name and under can be added explanation of test
  Scenario: The name of the scenario
     #Given -It describes the pre-requisite for the test to be executed.
    Given an initial condition
#    And  -It provides the logical AND condition between any two statements. AND can be used in conjunction with GIVEN, WHEN and THEN statement.
    And another condition
     #When -It defines the trigger point for any test scenario execution
    When something happens
    And something else happens
     #Then -Then holds the expected result for the test to be executed.
    Then this is the result
    And this is also the result

    #this is the step definitioon