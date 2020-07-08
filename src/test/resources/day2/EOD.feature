Feature: Creating account, adding new addresses and destroying existing addresses

  Background:
    Given Im on a Homepage

  Scenario: Sign in and create a new account
    When I click sign in
    And I click sign up
    And I add email 'androq.kazlinski@gmail.com' and password 'ts12345'
    And I click Sign up button
#    And I click sign out
#    Then Sign in page appears

#  Scenario Outline: Sign in and create new address
#    And I click sign in
#    And I add data from previous step
#    And I click sign in
#    And I click Addresses link
#    When I click New Address link
#    And I add '<First name>'
#    And I add '<Last name>'
#    And I add '<Address1>'
#    And I add '<City>'
#    And I add '<Zip code>'
#    And I click Create Address
#    Then message 'Address was successfully created.' appears
#    When I click list
#    Then Previously added address appears
#    Examples:
#      | First name | Last name | Address1     | City  | Zip code |
#      | Andris     | Krauja    | Ludzas 23    | Riga  | 3434     |
#      | Ilze       | Spoilo    | Maskavas 56  | Valka | 2346     |
#      | Viktors    | Fugazo    | Daugavpils 5 | Balvi | 4365     |
#
#    Scenario: Sign in and destroy existing address
#      And I click Addresses link
#      And I click Destroy link
#      Then message 'Address was successfully destroyed.' appears









