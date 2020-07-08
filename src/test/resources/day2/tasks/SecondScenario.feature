Feature: Learning to code

  Background:
    Given I am on a page

  Scenario Outline: Continue adding new data
    When I go to sign in
    And I add email 'karinastepanova@piu.lv' and password 'piclkeAvmf123' from previous test
    And I click Sign in
    And I click Addresses
    And I click New Address

    When I add :
      | First name | '<name>'      |
      | Last name  | '<last name>' |
      | adress     | '<Adress1>'   |
      | city       | '<City>'      |
      | state      | '<State>'     |
      | zipcode    | '<Zip code>'  |

    And click create adress
    Then message 'Address was successfully created.' appears
    And I click List
    Then verify address is added

    Examples:
      | name   | last name | Adress1       | City   | State     | Zip code |
      | Tania  | Mia       | Bounce str.1  | Moscow | Alabama   | 2124     |
      | Bred   | Pit       | Palace str.32 | Puerto | Alabama   | 2125     |
      | Andrew | Smith      | Pickel str.87 | Berlin | Wisconsin | 3356     |


##  open http://a.testaddressbook.com/
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