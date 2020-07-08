Feature: EOD final cucumber task

  Background:
    Given I am on Homepage page
    When I click 'Sign in' button

  Scenario: Add new user and sign out
    And I click 'Sign up'
    And I add email 'teegeg@test.lv' and password 'ghtthh'
    And I click 'Sign up' button
    Then Click 'Sign out'

  Scenario Outline: Sign in with previous data, create and verify address 3x
    And i add user details from previous test
    And i click 'Login' button
    And click 'Addresses'
    And click 'New Address'
    And fill '<name>', '<surname>', '<address1>', '<city>', '<zipcode>'
    And click 'Create Address'
    And verify if "Address was successfully created."
    And click 'List'
    Then verify address on page
    Examples:
      | name  | surname   | address1  | city  | zipcode |
      | Davis | Kronbergs | Maskavas  | Riga  | 2445    |
      | Olga  | Cool      | Rigas 23  | Valka | 2224    |
      | Sasha | Basha     | Centrs 22 | Ogre  | 1156    |

  Scenario: Again Login and destroy one address and confirm it
    And again add user data to log in
    And i click 'Login' again
    And i click 'Addresses' again
    And  i destroy one address
    Then verify address removed from page

