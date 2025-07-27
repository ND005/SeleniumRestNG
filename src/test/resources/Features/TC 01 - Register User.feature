@UserProfile
Feature: TC 01: Verify user registration, user login & User profile delete

  @User-Registration
  Scenario Outline: TS 01 - Verify user registration form
    Given Launch and navigate to AEC application UI
    When Verify the home screen and navigate signup screen
    And Create an account with new <UserName> and <Email> details
    Then Verify the account creation form and its fields
    Then Verify the profile creation with confirmation messagae

    Examples: 
      | UserName  | Email              |
      | UI Tester | UITester@email.com |

  @User-Login
  Scenario: TS 02 - Verify user login process
    Given Launch and navigate to AEC application UI
    When Verify the home screen and navigate login screen
    Then Verify login functionality of created data

  @User-delete
  Scenario: TS 03 - Verify user profile delete functionality
    Given Launch and navigate to AEC application UI
    When Verify the home screen
    Then Delete the profile
    And Verify the delete action with confirmation messagae
