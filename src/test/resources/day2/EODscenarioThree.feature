Feature: Sign in and destroy one address

  Scenario: Destroy
    Given Im on Page
    When click Sign In
    And Add Email '355@gmail.com' and password 'asdf'
    And click Sign In button
    Then click Addresses Link
    And destroy one address
    And verify that address removed



