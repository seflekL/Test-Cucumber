Feature: US1019_TestCaseViewCartBrandProducts

  Scenario: TC1019


    Given  navigate to url "autoUrl"
    Then Click on Products button
    And Verify that Brands are visible on left side bar
    And Click on any brand name
    And Verify that user is navigated to brand page and brand products are displayed
    And On left side bar, click on any other brand link
    And Verify that user is navigated to that brand page and can see products
    And close the page