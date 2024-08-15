Feature: User should able to place a new order  before Checkout

  Scenario:  TC1015 Place Order: Register before Checkout

    Given navigate to url "autoUrl"
  And Verify that home page is visible successfully
  And Click Signup-Login button
  And Fill all details in Signup and create account
  And Verify ACCOUNT CREATED! and click Continue button
    And Verify  Logged in as username at top
  And Add products to cart
  And Click Cart button
  And Verify that cart page is displayed
  And Click Proceed To Checkout
  And Verify Address Details and Review Your Order
  And Enter description in comment text area and click Place Order
    And Enter payment details: Name on Card, Card Number, CVC, Expiration date
  And Click Pay and Confirm Order button
  And Verify success message Your order has been placed successfully!
  And Click Delete Account button
  And Verify ACCOUNT DELETED! and click Continue button