@UserProfile
Feature: TC 01: Verify user registration, user login & User profile delete

  @User-Login
  Scenario Outline: TS 01 - Verify user login process
    Given Launch and navigate to AEC application UI
    When Verify the home screen and navigate login screen
    Then Verify login functionality with <Email> and <Password> details

    Examples: 
      | Email                   | Password   |
      | DefaultUser@testing.com | A2ZTesting |

  @User-Registration
  Scenario: TS 02 - Verify user registration form
    Given Launch and navigate to AEC application UI
    When Verify the home screen and navigate signup screen
    And Create an account with details provided in test files
    Then Verify the account creation process and its fields
    Then Verify the profile creation with confirmation messagae

  @User-delete
  Scenario: TS 03 - Verify user profile delete functionality
    Given Launch and navigate to AEC application UI
    When Verify the home screen and navigate login screen
    Then Verify the login ui before delete the profile
    And Verify the delete action with confirmation message
