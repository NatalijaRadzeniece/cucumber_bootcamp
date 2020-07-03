Feature:  Creating and testing our first Scenario Outline

  Scenario Outline: First scenario outline test
    Given Open 'Enter number' page
    When I send '<number>'
    And I click button 'Submit'
    Then I see result '<message>'
    Examples:
      | number | message                   |
      | 8      | Number is too small       |
#      | 55     | Square root of 55 is 7.42 |
      | 192    | Number is too big         |