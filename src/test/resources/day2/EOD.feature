Feature: Sign in then populate forms and sign out
  Background:
    Given I am on EOD page

  Scenario: Clicking buttons
    When I click sign in
    And I click sign up
    And I add email 'tani.soboleva@piu.lv' and password 'AlmondMilk123'
    And I press sign up
    Then I sign out

#  open http://a.testaddressbook.com/
#  click sing in
#  click sing up
#  populate it and remember this
#  sing out

#  open http://a.testaddressbook.com/
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