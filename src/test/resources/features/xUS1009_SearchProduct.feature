Feature: user should be able to search for products on the page
  Scenario:  Search Product

    Given navigate to url 'autoUrl'
    Then  that home page is visible successfully
    When Click on Products button
    And  Verify user is navigated to ALL PRODUCTS page successfully
    And  Enter product name "Blue Top" in search input and click search button
    And  Verify SEARCHED PRODUCTS is visible
    And  Verify all the products related to search are visible

