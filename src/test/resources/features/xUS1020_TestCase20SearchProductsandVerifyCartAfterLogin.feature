Feature: Search Products and Verify Cart After Login

  Scenario: TC1020


    Given navigate to url "autoUrl"
    Then  Click on Products button
    And Verify user is navigated to ALL PRODUCTS page successfully
    And Enter product name mean jean in search input and click search button
    And Verify SEARCHED PRODUCTS is visible
    And Verify all the products related to search are visible
    And Add those products to cart
    And Click Cart button and verify that products are visible in cart
    And Click Signup-Login button and submit login details
    And Again, go to Cart page
    And Verify that those products are visible in cart after login as well


