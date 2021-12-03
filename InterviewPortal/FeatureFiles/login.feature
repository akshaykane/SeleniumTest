Feature: SauceDemo login feature

  Scenario: Login with valid credentials
    Given User is on login page
    When User enters valid username
    When User enters valid password
    And User clicks on login button
    Then User closes the browser
