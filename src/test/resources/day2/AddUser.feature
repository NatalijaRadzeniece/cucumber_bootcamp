Feature: Add user and confirm login successful

  Background:
    Given Im on Add user Page

  Scenario: Add user and check login
    When I add username 'swert' and password 'test6789'
    And click save button
    Then verify username and password appeared on page

  Scenario: Check login
    When I click on 'Login'
    And Add user name and password
    And click Test login
    Then message '**Successful Login**' appeared