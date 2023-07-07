Feature: Cart Page
  Scenario: Add product 1 to cart
    When User click demo site
    And User click product one
    And User choose product1 color
    And User choose product1 size
    Then User click button add to cart

  Scenario: Add product 2 to cart
    When User click logo to shop
    And User click product two
    And User choose product2 color
    And User choose product2 size
    Then User click button add to cart