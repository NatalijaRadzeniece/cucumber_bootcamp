Feature: EOD
#  open http://a.testaddressbook.com/
#  click sign in
#  click sign up
#  populate it and remember this
#  sign out

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
#       REPEAT 3 TIMES

#  open site
#  sing in
#  destroy one address
#  verify address removed from page

  Scenario: Add user and sign out
    Given I am on Homepage page
    When I click on 'Login' button
    And I click 'Sign up'
#   And I add email '1234@test.lv' and password 'test123' and remember
#    Then click 'Sign out'
#
