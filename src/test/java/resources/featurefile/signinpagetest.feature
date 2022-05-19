Feature: SignIn Page Test

  Scenario: User should navigate to sign in page successfully
    Given I am on homepage
    When I click on SignIn link
    Then I should navigate to SignIn page
    And Verify that AUTHENTICATION message is displayed

  Scenario Outline: Verify the error message with invalid credentials
    Given I am on homepage
    When I click on SignIn link
    And I enter username "<username>"
    And I enter password "<password>"
    Then I click on SignIn Button
    And Verify the error message "<message>"

    Examples:
      | username       | password | message                    |
      |                | 123456   | An email address required. |
      | abcd@gmail.com |          | Password is required.      |
      | adfdfgfg       | 123456   | Invalid email address.     |
      | abcd@gmail.com | 123456   | Authentication failed.     |

    Scenario: Verify that user should log in successfully with valid credentials
      Given I am on homepage
      When I click on SignIn link
      And I enter EmailID
      And I enter password
      And I click on SignIn Button
      Then Verity that Sign out link is displayed

      Scenario: Verify that user should logOut successfully
        Given I am on homepage
        When I click on SignIn link
        And I enter EmailID
        And I enter password
        And I click on SignIn Button
        And I click on Sign Out Link
        Then Verity that Sign In link is displayed