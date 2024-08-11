Feature: US1006 Users can easily send message through contact form.

  Scenario:  TC1006  Contact Us Form

    Given kullanici "autoUrl" anasayfaya gider

    Then  Verify that home page is visible successfully
    And   Click on Contact Us button
    And   Verify GET IN TOUCH is visible
    And   Enter name, email, subject and message
    And   Upload file
    And   Click Submit  button
    And   Click OK button
    And   Verify success message 'Success! Your details have been submitted successfully.' is visible
    And   Click 'Home' button and verify that landed to home page successfully


