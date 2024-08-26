Feature: US_1018_ViewCategoryProducts

  Scenario: TC11018 CategoryTest


    Given navigate to url "autoUrl"
    Then Verify that categories are visible on left side bar
    And Click on Women category
    And Click on any category link under Women category, for example: Dress
    And Verify that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'
    And On left side bar, click on any sub-category link of 'Men' category
    And Verify that user is navigated to that category page
    And close the page