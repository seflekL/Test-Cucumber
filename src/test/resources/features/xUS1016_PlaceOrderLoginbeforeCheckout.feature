Feature:User should be able to place a new order  before Checkout
 Scenario:TC1016 Place Order: Register before Checkout



    Given navigate to url "autoUrl"

   Then Verify that home page is visible successfully
   And Click Signup-Login button
   And Fill email, password and click Login button
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
   And Verify ACCOUNT CREATED! and click Continue button
