@MyTest
Feature: 6-07-20 Home work
  Background:
    Given I am on Home page

  Scenario: Sign up a new user
  When I click sign in button
  And I click sign up button
  And I add email 'test17@test.com' and password 'testPass'
  Then I sign out

#  open http://a.testaddressbook.com/
#  click sing in
#  click sing up
#  populate it and remember this
#  sing out

  Scenario Outline: Creating addresses
  When I click sign in button
  And I logIn with registered email and password
  And I click on Addresses link
    And I click on New Address link
  And I fill '<FirstName>', '<LastName>', '<Address>', '<City>' and '<ZipCode>'
    And I click Create Address
    And I verify address added
    And I click List link
  Then I verify address on page
    Examples:
      | FirstName | LastName | Address | City | ZipCode |
      |A          |B         |C        |D     |12       |
      |E          |F         |G        |H     |34       |
      |I          |G         |K        |L     |56       |

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

  Scenario: Destroy address
  When I click sign in button
    And I logIn with registered email and password
  And I click on Addresses link
  And I destroy one address
  Then I verify address removed


#  open site
#  sing in
#  destroy one address
#  verify address removed from page