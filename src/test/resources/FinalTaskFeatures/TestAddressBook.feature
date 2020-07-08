Feature: Test Address Book Site functionality check

  Background:
    Given User opens "http://a.testaddressbook.com/"
      And User has email "testacc123456789@email.com" and password "Password1"

  Scenario: Register user
    Given User opens Login page
      And User is on Login Page
    When User register new account using predefined credentials
    Then User is able to see correct email
      And User logout


  Scenario Outline: Create new address
    Given User opens Login page
      And User is on Login Page
      And User login using predefined credentials
      And User opens Addresses page
      And User is on Addresses Page
      And User click New Address
      And User is on New Address Page
      And User fill New Address Form
        | firstName | <name>     |
        | lastName  | <surname>  |
        | address1  | <address>  |
        | address2  | <address>  |
        | city      | <city>     |
        | zipCode   | <zipCode>  |
        | birthday  | <birthday> |
        | age       | <age>      |
        | webSite   | <webSite>  |
        | phone     | <phone>    |
        | note      | <note>     |
      And User selects "<state>"
      And User select country "<country>"
    When User submit address data
    Then User is on Address Details Page
      And User is able to see confirmation message "Address was successfully created." on Address Details Page
      And User is able to see correct address details
        | firstName | <name>     |
        | lastName  | <surname>  |
        | address1  | <address>  |
        | address2  | <address>  |
        | city      | <city>     |
        | zipCode   | <zipCode>  |
        | birthday  | <birthday> |
        | age       | <age>      |
        | webSite   | <webSite>  |
        | phone     | <phone>    |
        | climbing  | <climbing> |
        | dancing   | <dancing>  |
        | reading   | <reading>  |
        | note      | <note>     |
      And User clicks List on Address Details Page
      And User is able to see name "<name>" and surname "<surname>" and city "<city>" address in table

    Examples:
      | name  | surname | address          | city      | zipCode | birthday   | age | webSite             | phone        | note      | state   | country      | climbing | dancing | reading |
      | Alex  | Nilson  | Rembo Street 1a  | Tokyo     | JP-777  | 12/12/1900 | 120 | http://rembo.com    | 777-777-7701 | I'm Rembo | Iowa    | Canada       | No       | No      | No      |
      | Yan   | Smite   | High Street 123  | New York  | TT-1234 | 10/10/2000   | 25  | http://yensmite.com | 777-777-7701 | none      | Alabama | United State | No       | No      | No      |
      | Simon | Rolberg | Earth Street 222 | Amsterdam | ZP-1245 | 11/11/2008 | 12  | http://Simon2008.eu | 777-777-7701 | none      | Hawaii  | Canada       | No       | No      | No      |


  Scenario: Remove existing address
    Given User opens Login page
      And User is on Login Page
      And User login using predefined credentials
      And User opens Addresses page
      And User is on Addresses Page
    When User deletes row by surname "Nilson" from Address Details table
    Then User is able to see confirmation message "Address was successfully destroyed." on Address List Page
      And User is not able to see name "Alex" and surname "Nilson" and city "Tokyo" address in table