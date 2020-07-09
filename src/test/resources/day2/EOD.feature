Feature: Testing the test address site

  Background:
    Given Im on test address Page
    Given I click Sign in link

  Scenario: Sign up to test address Page
    When I click Sign up link
    And I enter email 'abbb@nmb.lv' and password 'test9086'
    And I click Sign up button
    Then I click Sign out button

  Scenario: Create address
    When I enter email 'abbb@nmb.lv' and password 'test9086'
    And I click Sign in button
    And I click on Alert button save
    And I click Addresses
    And I click New Address
    And I enter details into Address form:
      | First name | Karina           |
      | Last name  | Ivanova          |
      | Address1   | Varnu street 5   |
      | City       | Riga             |
      | Zip code   | 16789            |
    And I click create address
    And verify address added
    And click list
    And verify address on page
    And repeat adding address for three times

   Scenario:Destroy address
     When I enter email 'abbb@nmb.lv' and password 'test9086'
     And I click Sign in button
     And I click Addresses
     And I click Destroy address button
     And I click on the Alert OK button
     Then I verify that address moved from page


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