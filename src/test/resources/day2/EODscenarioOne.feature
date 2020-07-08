Feature: Create a new user account

  Scenario: Sign up and Sign out
    Given Im on Sign in Page
    When click Sign in
    And click Sign up
    Then I add email '355@gmail.com' and password 'asdf'
    And click Sign up button
    And click Sign out
