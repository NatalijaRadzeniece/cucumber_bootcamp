Feature: Add user and confirm login successful
  Background:
    Given Im on Add user page

  Scenario: Add user and check login
    When I add username 'baby' and password 'test123'
    And click save button
    Then username and password appeared on page

    Scenario: Check login
      When I click on 'Login'
      And Add user name and password
      And click Test login
      Then message '**Successful Login**' appeared