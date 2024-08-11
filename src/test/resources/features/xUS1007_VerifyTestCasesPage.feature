Feature:US1007 User will be able to see the main page of automationecercise.com

  Scenario: TC1007 Verify Test Cases Page

    Given kullanici "autoUrl" anasayfaya gider
    Then Verify automationExercise's home page is visible successfully
    And click on Test Cases button
    And Verify user is navigated to test cases page successfully
    And close the page
