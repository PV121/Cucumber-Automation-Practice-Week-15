Feature: Create Account Page Test
  Scenario: verify that user should create account successfully
    Given I am on homepage
    When I click on SignIn link
    And I enter Email Address
    And I Click on Create an account button
    And I click on Gender radio Button
    And I enter Firstname
    And I enter Lastname
    And I enter Email
    And I enter password
    And I enter Address
    And I enter City
    And I enter State
    And I enter Zip/Postal Code
    And I enter Country
    And I enter Mobile phone
    And I assign an address alias for future reference
    Then I click on Register button
    And I Verify message My Account
