#@Piu
Feature: Sign in then populate forms and sign out

  Background:
    Given I am on this page

  Scenario: Clicking buttons
    When I click sign in
    And I click sign up
    And I add email 'karinastepanovaa@piu.lv' and password 'picllkeAvmf123'
    And I press sign up

    Then I sign out

#  open http://a.testaddressbook.com/
#  click sing in
#  click sing up
#  populate it and remember this
#  sing out




#  open site
#  sing in
#  destroy one address
#  verify address removed from page