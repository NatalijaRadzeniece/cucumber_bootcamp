@User
Feature: Add user and confirm login successful
  Background:
    Given I am on Add userPage

  Scenario: Add user and check login
    When I add username 'alex' and password 'test1234'
    And click save button
    Then  user name and password appeared

    Scenario: Check login
      When I click on 'login'
      And Add user name and password
      And click Test login
      Then message '**Successful Login**' appeared
