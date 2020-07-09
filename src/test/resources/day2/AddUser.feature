Feature: Add user and confirm login succesfull

  Background:
    Given Im on Add user page

  Scenario: Add user and check login
    When I add username 'nanajka' and password 'nanajka1'
    And click save button
    Then username and password appeared on page

  Scenario: Check login
    When I click on 'login'
    And Add username and password
    And click Test login
    Then message '**Successful Login**' appeared
