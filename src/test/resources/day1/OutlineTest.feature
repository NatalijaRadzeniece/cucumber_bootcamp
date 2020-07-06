Feature: Creating and testing our first scenario outline

  Scenario Outline: First scenario outline test
    Given I open site 'Enter number'
    When I send '<number>'
    And I click submit
    Then I see result '<message>'

    Examples:
      | number | message                   |
      | 12     | Number is too small       |
     # | 88     | Square root of 88 is 9.38 |
      | 150    | Number is too big         |