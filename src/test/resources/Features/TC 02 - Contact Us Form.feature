Feature: TC 01:Verify Contact Us form

  Scenario Outline: TS 01 - Verify user login process
    Given Launch and navigate to AEC application UI
    When Login to ACE using <Email> and <Password> profile
    Then Verify Contact us UI and it's elements

    Examples: 
      | Email                   | Password   |
      | DefaultUser@testing.com | A2ZTesting |
