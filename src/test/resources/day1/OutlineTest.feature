Feature: Creating and testing our first Scenario Outline

  Scenario Outline: First scenario outline test
    Given Open 'Enter number' Page
    When I send '<number>'
    And I click button 'Submit'
    Then I see result '<message>'
    Examples:
      | number | message                   |
      | 48     | Number is too small       |
#      | 51     | Square root of 51 is 7.14 |
      | 101    | Number is too big         |