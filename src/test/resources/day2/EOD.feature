Feature: Testing test address book webpage

  Background:
    Given I am on TestAddress page
    When I click sign in

  Scenario: sign up as a new user
    When I click sign up
    And I add email 'corgi@corgi.lv' and password 'corgi55' in sign up fields
    And I click sign up again
    Then I press sign out

  Scenario Outline: add addresses for the previous created account
    When I add email 'corgi@corgi.lv' and password 'corgi55' in sign in fields
    And I click sign in button
    And I click Addresses
    And I click new Address
    And I add first name'<first name>'
    And I add last name'<last name>'
    And I add address'<address1>'
    And I add city'<city>'
    And I add state'<state>'
    And I add zip code'<zip code>'
    And I click create Address
    And I see message 'Address was successfully created.'
    And I click on list
    Then I verify address is now on page by first name '<first name>'
    Examples:
      | first name | last name | address1     | city      | state | zip code |
      | Darth      | Vader     | Star 1       | Tataouine | MT    | 2255     |
      | Han        | Solo      | Galaktikas 5 | Matmata   | NY    | 6688     |
      | Boba       | Fett      | Storm 11     | Finse     | HI    | 44527    |

  Scenario: destroy address
    When I add email once more 'corgi@corgi.lv' and password 'corgi55' in sign in fields
    And I click sign in button again
    And I click on Addresses
    And I destroy one address
    Then Appears message 'Address was successfully destroyed.'

#  open http://a.testaddressbook.com/
#  click sing in
#  click sing up
#  populate it and remember this
#  sing out

#  open http://a.testaddressbook.com/ scenario outline
#  click sing in
#  add data from previous test
#  click 'Addresses'
#click new Address
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