Feature: Sign in and Verify adresses

    #  open http://a.testaddressbook.com/
#  click sing in
#  click sing up
#  populate it and remember this
#  sing out

  Background:
    Given I'm on testaddressbook main page
  Scenario Outline: Sign up and remember user data
    When I click on Sign In
    And Click on Sign Up
    And Insert '<email>' and '<password>'
    And Click Sign Up
    Then Click Sign Out
    Examples:
      | email             | password  |
      | random6@gmail.com | Parole123 |

  Scenario: Create and verify addresses
    When I click sign in
    And insert '<email>' and '<password>' from previous test
    And I click on sign in
    And click Addresses
    And click new Address
    And populate form
    And click Create Address
    And verify address added
    And click List
    Then I verify address on page
#
##
#
#Scenario: Destroy address
#  When I open site
#  And I sign in
#  And I destroy one address
#  Then I verify address removed from page