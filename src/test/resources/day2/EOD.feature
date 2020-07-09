Feature: Cucumber final task

  Background:
  Given I am in HomePage

  Scenario: Register new User
  When I click Sign in
  And I click Sign up
  And I write Email ginger@inbox.lv and Password test123
  And I click Sign up again
  Then I click Sing out

  Scenario Outline: Test adresses
  When I add Username and Password to credintials
  And I click Sign in again
  And I click Addreses
  And I click New Address
  And I add '<FirstName>', '<LastName>', '<StreetAdress>', '<City>', '<ZipCode>'
  And I click Creat Address
  And I chech if address successfully created
  And I click List
  Then I check if addresses match by '<FirstName>'
    And I Sign out
  Examples:
    |FirstName|LastName|StreetAdress|City|ZipCode|
    |Janis    |Berzins |Laba iela 2 |Riga|LV-3222|
    |Juris    |Kalnins |Slikt iel 3 |Msc |LV-333 |
    |Martins  |Ozols   |Videj iel 4 |Igaf|IG-3343|

  Scenario: Destroy addreses
  When I open site
  And I write Email ginger@inbox.lv and Password test123 again
  And I click Sign in againagain
  And I click Addresses again
  And I destroy first address
  Then success message appears


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