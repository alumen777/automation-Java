Feature: view tickets

  @tag1
  Scenario: Open kayak in chrome
    Given I open "https://www.kayak.com/flights"
    Then I wait for page title to be present
