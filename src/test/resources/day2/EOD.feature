Feature: Add user and confirm login successful

  Background:
    Given Im on Test address book page

  Scenario: Sign up, remember credentials and sign out
    When I click sign in
    Then sign in message 'Sign in' appeared
    And I click sign up
    Then sign up message 'Sign up' appeared
    And I add e-mail 'twentyfive@inbox.lv' and password 'fiveeee'
    And I click user sign up
    Then welcome message 'Welcome to Address Book' appeared
    And I click user sign out
    Then second sign in message 'Sign in' appeared


  Scenario Outline: Sign in and populate address
    When I click first user sign in
    Then first user sign in message 'Sign in' appeared
    And I populate e-mail and password from previous test
    And I click user sign in
    Then user welcome page message 'Welcome to Address Book' appeared
    And I click button Addresses
    Then table 'Addresses' appeared
    And I click button NewAddress
    Then new table 'New Address' appeared
    And I populate '<First Name>', '<Last Name>', '<Address1>', '<City>', '<State>', '<Zip code>'
    And click button create address
    Then I see message 'Address was successfully created.'
      #    And I click List
      #    Then verify that '<First Name>', '<Last Name>', '<City>' on list are the same as  were populated
    Examples:
      | First Name | Last Name | Address1 | City | State   | Zip code |
      | Tanja      | Krav      | Sunny    | Riga | Iowa    | hh1122   |
      | John       | Harn      | Greeny   | Old  | Alabama | gg2233   |
      | Kate       | Blanc     | Summer   | Ica | Florida | ff4455   |


  Scenario: Sign up and destroy address
    And I click address sign in
    Then address user sign in message 'Sign in' appeared
    And I enter e-mail and password from previous test to address
    And I sign in to address
    Then I see address enter message 'Welcome to Address Book'
    And I click tab Addresses to address
    Then list of addresses 'Addresses' appeared
  And I click destroy button for first address row
  Then destroyed address 'Riga' removed from table

