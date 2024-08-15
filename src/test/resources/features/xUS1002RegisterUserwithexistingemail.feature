Feature:     Feature: Test Case 5: Register User with existing email


  Scenario: Register User with existing email

    Given  navigate to url "autoUrl"
    Then   Verify that home page is visible successfully
    And    Click on SignupLogin button
    And    Verify New User Signup! is visible
    And    Enter name and already registered email address
    And    Click Signup button
    And    Verify error 'Email Address already exist!' is visible
