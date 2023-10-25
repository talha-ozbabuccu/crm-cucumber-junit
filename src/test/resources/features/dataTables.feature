Feature: Examples of Cucumber data table implementations

  @wip
  Scenario: List of fruits I like
    Then user should see fruits I like
      | kiwi        |
      | banana      |
      | cucumber    |
      | orange      |
      | banana      |
      | grape       |
      | pomegranate |
  # to beautify above fruits use ctrl+alt+L

