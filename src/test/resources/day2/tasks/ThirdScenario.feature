Feature: Sign in destroy and verify

  Scenario: Destroy adress
    Given Im on the Page
    When I press sign in
    And I type in email 'karinastepanovaa@piu.lv' and password 'picllkeAvmf123'
  And I click sign in button
  And click on adress link
  And destroy one adress
  Then message 'Address was successfully destroyed.' appears this


#  open site
#  sing in
#  destroy one address
#  verify address removed from page