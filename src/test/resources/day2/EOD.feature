Feature: EOD

  Background:
    Given I am on Homepage page
    When I click on 'Login' button

  Scenario: Add new user and sign out
    And I click 'Sign up'
    And I add email '5cencz@test.lv' and password '121ncez5' and remember
    And I click Sign up button
    Then click 'Sign out'

  Scenario Outline: Sign in with previous data, create and verify address 3x
    And i add data from previous test
    And i click Login in
    And click 'Addresses'
    And click new Address
    And fill '<name>', '<surname>', '<address1>', '<city>', '<zipcode>'
    And click Create Address
    And verify if "Address was successfully created."
    And click List
    And verify address on page
    Examples:
      | name  | surname   | address1  | city  | zipcode |
      | Davis | Kronbergs | Maskavas  | Riga  | 2445    |
      | Olga  | Cool      | Rigas 23  | Valka | 2224    |
      | Sasha | Basha     | Centrs 22 | Ogre  | 1156    |

#Scenario:
#  open site
#  sing in
#  destroy one address
#  verify address removed from page

