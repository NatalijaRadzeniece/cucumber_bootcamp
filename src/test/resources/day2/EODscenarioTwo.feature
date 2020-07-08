Feature: Add some addresses in user account

  Scenario Outline: Add Address and verify it
    Given Im on Home Page
    When click Sign in link
    And Add email '355@gmail.com' and password 'asdf'
    And click Sign in button
    Then click Addresses link
    And click New Address link
    And I create a new address:
      | First Name | '<name>'      |
      | Last name  | '<last name>' |
      | Adress     | '<address1>'  |
      | City       | '<city>'      |
      | Zipcode    | '<zip code>'  |
    And verify address is added
    And click List link
    Then verify address on page

    Examples:
      | name   | last name | address1 | city  | zip code |
      | Max    | White     | Street 1 | Porto | 1111     |
      | Helena | Black     | Street 2 | Paris | 4444     |
      | Sam    | Tier      | Street 3 | Leon  | 2222     |