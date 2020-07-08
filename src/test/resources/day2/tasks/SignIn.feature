Feature: Testing Address Book

  Background:
    Given Open 'Enter Number' page
    When click sign in

  Scenario Outline:Save account
    When click sign up
    And add '<e-mail>' address
    And add '<password>'
    Then click sign up
    Examples:
      | e-mail           | password |
      | Aija098@inbox.lv | 09876    |
      | Aija765@inbox.lv | 54321    |

  Scenario: sign in, add address, sign out //Repeat 3x
    When click sign in
    And click sign up
    And add e-mail address
    And add password
    And click sign in
    And click 'Address'
    And click 'New Address'
    And populate all fields in form
    And click button crate address
    And verify if 'Address was successfully created.' appeared
    And click List
    And verify Address on page
    Then Sign out

  Scenario:Delete address
    When click sign in
    And add e-mail address
    And add password
    And click sign in
    And click Addresses
    And click destroy address
    And verify address removed
    Then Sign out




