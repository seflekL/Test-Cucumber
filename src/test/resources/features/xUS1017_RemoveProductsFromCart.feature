Feature:   Remove Products From Cart

  Scenario: Remove first product from the cart

    Given navigate to url "autoUrl"


    When Verify that home page is visible successfully
    Then  Add products to cart
    Then Click Cart button
    And Verify that cart page is displayed
    And Click X button corresponding to particular product
    And Verify that product is removed from the cart
    And close the page