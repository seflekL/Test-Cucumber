Feature:US1013 user should be able to verifyproduct quantity in Cart

  Scenario: Test Case 1013 : Verify Product quantity in Cart

    Given navigate to url "autoUrl"
    When Verify that home page is visible successfully
    And Click View Product for any product on home page
    And Verify product detail is opened
    And Increase quantity to "4"
    And Click Add to cart button
    And Click View Cart button
    And Verify that product is displayed in cart page with exact quantity
