Feature: US1008 The user should be able to see the information on the product details page
  Scenario: TC1008 VerifyAllProductsandproductdetailpage

    Given kullanici "autoUrl" anasayfaya gider

  Then Verify that home page is visible successfully
  And Click on Products button
  And user is navigated to ALL PRODUCTS page successfully
  And products list is visible
  And on View Product of first product
  And is landed to product detail page
  And Verify that detail detail is visible: product name, category, price, availability, condition, brand
  And close the page