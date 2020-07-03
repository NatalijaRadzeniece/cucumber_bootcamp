Feature: Creating and testing our first Scenario Outline

  Scenario Outline: First scenario Outline
    Given  Open Enter Number page
    When I send '<number>'
    And I click button Sumbit
    Then I see result '<message>'
    Examples:
      | number | message                   |
      | 23     | Number is too small       |
#      | 50     | Square root of 50 is 7.07 |
      | 200    | Number is too big         |


