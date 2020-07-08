Feature: extra
#using Scenario Outline and data table create test:

  Scenario Outline:
    Given Go to Asos Homepage page
    And select '<gender>'
    And then select '<category>'
    And  then '<item>'
    And  then '<value1>'
    And then '<value2>'
    And then '<Brand>'
    And  Select filters:
  #in map:  Key        Value
      |  |  |  |
    Then i should see '<result>'
    Examples:

      | gender | category      | item          | value1    | value2 | Brand         | result                                                     |
      | Woman  | Shoes         | Loafers       | Leather   | 36     | Vagabond      | 'Vagabond Layla leather flat loafers in black'             |
      | Man    | 'Accessories' | 'Caps & Hats' | 'Beanies' | Tan    | 'Asos Design' | 'ASOS DESIGN co-ord oversized beanie in brown tobacco rib' |





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