Feature: Our first Scenario Outline

  Scenario Outline: First scenario outline test
    Given Open 'Enter number' page
    When I send '<number>'
    And I click button 'Submit'
    Then I see result '<message>'
    Examples:
      | number | message                   |
      | 12     | Number is too small       |
 #     | 88     | Square root of 88 is 9.38 |
      | 400    | Number is too big         |