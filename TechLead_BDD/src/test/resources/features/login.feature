@loginScenarios
Feature: Login Page Related Scenarios

  Background: Navigate to page
    Given I open url of LoginPage

  @CB-1
  Scenario: Verify the title of the page
    Then I should see "Log In to Canvas" in the title

  @CB-2
  Scenario: The home page main logo should be displayed
    Then I should see the main logo on the page

  @CB-3
  Scenario: Verify user will login in as a student to canvas
    When User enters email "student@example.com" and password "TEST_PASSWORD"
    And User clicks on " Log In " button
    Then User should be logged in as a student an see title "Dashboard"
    And User should see the dashboard tab

  @CB-4
  Scenario: Verify user forget password functionality
    When User clicks on "Forgot Password" link
    Then User should see the "Forgot Password" page
    Then User should see the text "Enter your Email and we'll send you a link to change your password." on the page
    And User should see the "Email" field
   And User enters email "student@example.com"
    And User clicks on Request Password button
    Then User should see the Password Reset Email Sent message

