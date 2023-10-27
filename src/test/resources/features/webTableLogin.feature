Feature: User should be able to login using correct credentials

  @wip
  Scenario: Positive scenario
    Given user is on the login page of web table app
    When user enters username "Test"
    And user enters password "Tester"
    And user clicks to login button
    Then user shoul see url contains orders

  Scenario: Positive login scenario
    Given user is on the login page of web table app
    When user enters username "Test" password "Tester" and logins
    Then user shoul see url contains orders