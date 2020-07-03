Feature: Creating and testing our first Scenario Outline

  Scenario Outline: First scenario outline test
    Given Open 'Enter number' page
    When I insert '<number>'
    And I click button 'Submit'
    Then I see result '<message>'
    Examples:
      | number | message                   |
      | 49     | Number is too small       |
      | 99     | Square root of 99 is 9.95 |
      | 101    | Number is too big         |
