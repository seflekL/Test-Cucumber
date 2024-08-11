
Feature:US1010 user should be able to navigato Subscription's Homepage

  Scenario: TC1010  Verify Subscription in home page

    Given navigate to url "autoUrl"
    Then Verify that home page is visible successfully
    And Scroll down to footer
    And Verify text SUBSCRIPTION
    And Enter email address in input and click arrow button
    And Verify success message You have been successfully subscribed! is visible
