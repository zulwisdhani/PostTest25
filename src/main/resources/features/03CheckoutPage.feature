Feature: Checkout page
  Scenario: Checkout product from cart
    When User click button view cart
    And User click button proceed to checkout
    And User enter firstname
    And User enter lastname
    And User select country
    And User enter address
    And User enter town
    And User select province
    And User enter postcode
    And User enter phone number
    And User enter email address
    And User click checkbox terms
    And User click button place order
    Then User get text success order
