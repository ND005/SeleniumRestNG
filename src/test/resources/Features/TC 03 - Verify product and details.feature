Feature: TC 03: Verify Products screen, cart screen and all it's functionalities

  Scenario Outline: TS 01 - Verify products section and its functionalities
    Given Launch and navigate to AEC application UI
    When Verify the home screen and navigate login screen
    Then Login to user profile using <Email> and <Password> details
    And Verify search by product details functionality
    And Verify category and brands sections

    Examples: 
      | Email                   | Password   |
      | DefaultUser@testing.com | A2ZTesting |

  Scenario Outline: TS 02 - Verify Top 3 product details and add in cart
    Given Launch and navigate to AEC application UI
    When Verify the home screen and navigate login screen
    Then Login to user profile using <Email> and <Password> details
    And Verify top 3 product details and add them in cart
    And Verify the added item and Delete them from cart

    Examples: 
      | Email                   | Password   |
      | DefaultUser@testing.com | A2ZTesting |