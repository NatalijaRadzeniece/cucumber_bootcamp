Feature: Add user and confirm login successful

  Background:
    Given Im on Test address book page

  Scenario: Sign up, remember credentials and sign out
    When I click sign in
    Then sign in form appeared
    And click sign up
    Then sign up form appeared
    And I add e-mail and password
    And click sign up
    Then save password alert appeared
    And click save button
    And click sign out
    Then sign in page appeared

  Scenario Outline: Sign in and populate address
    And I click sign in
    Then sign in form appeared
    And populate e-mail and password from previous test
    And click sign in
    Then welcome page appeared
    And click button Addresses
    Then address form appeared
    When click button New Address
    Then new Address form appeared
    And populate '<First Name>', '<Last Name>', '<City>', '<State>' and other fields in form
    And click button create address
    Then verify message 'Address was successfully created.' appeared and '<City>', '<State>' are the same as were populated
    When click List
    Then verify that '<City>', '<State>' on list ate the same as  were populated
    Examples:
      | First Name | Last Name | City | State   |
      | Tanja      | Krav      | Riga | Iowa    |
      | John       | Harn      | Old  | Alabama |
      | John       | Harn      | Old  | Alabama |

  Scenario: Sign up and destroy address
    And I click sign in
    Then sign in form appeared
    And populate e-mail and password from previous test
    And click sign in
    Then welcome page appeared
    And click button Addresses
    Then address form appeared
  And I click destroy button for first address row
  Then allert is showing
  And click ok button on allert
  Then destroyed address removed from table




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