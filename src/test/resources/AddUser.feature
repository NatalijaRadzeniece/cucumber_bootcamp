@User
Feature: Add user and confirm login successful

  Background:
    Given Im on Add user Page

  Scenario: Add user and check Login
    When I add username "KinyaevFoma" and password "qwerty12"
      And click save button
    Then username and password appeared on page

  Scenario: Check login
    When I click on 'Login'
      And Add user name "KinyaevFoma" and password "qwerty12"
      And click Test login
    Then message "**Successful Login**" appeared