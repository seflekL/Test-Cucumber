Feature:US1012 user should be able to add products in the cart

  Scenario: TC1012 Add Products in Cart



    Given navigate to url autoUrl

    Then  Verify that home page is visible successfully
    And Click Products button
    And Hover over first product and click Add to cart
    And Click Continue Shopping button
    And Hover over second product and click Add to cart
    And Click View Cart button
    And Verify both products are added to Cart
    And Verify their prices, quantity and total price