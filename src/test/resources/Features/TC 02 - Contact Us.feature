Feature: TC 02: Verify contact us ui

  Scenario Outline: TS 01 - Verify contact us screen with logged UI
    Given Launch and navigate to AEC application UI
    When Verify the home screen and navigate login screen
    Then Login to user profile using <Email> and <Password> details
    And Verify all featurs in contact us UI
    And Verify all featurs functionality in conatact us UI

    Examples: 
      | Email                   | Password   |
      | DefaultUser@testing.com | A2ZTesting |

  Scenario: TS 02 - Verify contact us screen without logged UI
    Given Launch and navigate to AEC application UI
    When Verify the home screen and navigate login screen
    And Verify all featurs in contact us UI
    And Verify all featurs functionality in conatact us UI
