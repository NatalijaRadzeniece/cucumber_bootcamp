Feature: Creating and testing our first Scenario Outline

  Scenario Outline: First scenario outline test
    Given Open 'Enter Number' page
    When I send '<number>'
    And I click button Submit
    Then I see result '<message>'
    Examples:
      | number | message                   |
      | 12     | Number is too small       |
      ##| 88     | Square root of 88 is 9.38 |
      | 400    | Number is too big         |