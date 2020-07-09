#  open http://a.testaddressbook.com/
#  click sing in
#  click sing up
#  populate it and remember this
#  sing out

#  open http://a.testaddressbook.com/
#  click sing in
#  add data from previous test
#  click 'Addresses'
#  click new Address
#  populate form
#  click Create Address
#  verify address added
#  click List
#  verify address on page
#       REPEAT 3 TINES

#  open site
#  sing in
#  destroy one address
#  verify address removed from page
Feature:

  Background:
    Given Im on Address Book Home page
    And I click sign in link

  Scenario: Sign in, input data and save
    When I click sign up link
    And I input test88@test.com and 12345 and remember them
    And I click sign up button
    Then Im signed in with remembered email

  Scenario:
    Given Im signed in with remembered credentials
    When I click sign out
    Then Im signed out

  Scenario Outline: Sign in and populate address
    Given Im signed in with remembered credentials
    And I click Addresses button
    And I click New Address
    And I create new address with '<First Name>', '<Address1>', '<Last Name>', '<City>', '<ZIP>'
    And I check address added
    And I click List
    Then Address is the same as populated
    Examples:
      | First Name | Last Name | Address1 | City   | ZIP |
      | Hot        | Dog       | Brivi1   | Riga   | 123 |
      | John       | BonJovi   | Brivi2   | Oslo   | 456 |
      | Alex       | Trump     | Brivi3   | London | 789 |

  Scenario:
    Given Im signed in with remembered credentials
    When I click Addresses button
    And I remember and delete address 1
    Then Remembered address is missing from the list
