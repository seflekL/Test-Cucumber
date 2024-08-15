
  Feature:  US11_VerifySubscriptioninCartpage

    Scenario: TC11_VerifySubscriptioninCartpage


    Given navigate to url autoUrl
     Then Verify that home page is visible successfully
     And Click Cart button
     And Scroll down to footer
     And Verify text SUBSCRIPTION
     And Enter email address in input and click arrow button
     And Verify success message You have been successfully subscribed! is visible