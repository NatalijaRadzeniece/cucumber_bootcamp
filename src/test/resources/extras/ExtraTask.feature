Feature: Asos Women and Man item selection

  Background:
    Given I navigate to Asos homepage

#    in limited time could not locate how to use Asos page filters (they are not select)
#  it would be easy to complite task as not a scenario outline, but simple scenario
#  using only clicks, but i assume that is not the task

  Scenario Outline: : Women item search for shoes
    When I click on Women
    And I navigate to Shoes
    And I click on Loafer
#    And I add leather filter'<leather>'
    And I select leather filter
    And I add size filter '<size>'
    And I add brand filter '<brand>'
    Then I get 'Vagabond Layla leather flat loafers in black'
    Examples:
      | leather | size | brand    |
      | Leather | 36   | Vagabond |

  Scenario Outline: : Men item search for shoes
    When I click on Men
    And I click on Accessories
    And I click on Caps & Hats
    And I add filter '<beanies>'
    And I add color filter '<color>'
    And I add brand filter '<brand>'
    Then I get 'Vagabond Layla leather flat loafers in black'
    Examples:
      | beanies | color | brand    |
      | Leather | 36    | Vagabond |

#using Scenario Outline and data table create test:

#Scenario 1:
#navigate to Asos
# select 'Women'
#  then select category 'Shoes'
#  and then 'Loafers'
#  Select filters:
    #Leather/Non Leather - Leather
    #Size  -  36
    # Brand - 'Vagabond'
#Result 'Vagabond Layla leather flat loafers in black'


#  Scenario 2:
# navigate to Asos
# select 'Man'
#  then select category 'Accessories'
#  and then 'Caps & Hats'
#  Select filters:
    #Product type - 'Beanies'
    # Brand - 'Asos Design'
    #Colour - ' Tan'
#Result 'ASOS DESIGN co-ord oversized beanie in brown tobacco rib'
