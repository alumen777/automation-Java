@usps
Feature: Smoke Tests

  @usps1
  Scenario: Calculate Price
    Given I open "https://www.usps.com/" page
    When I click on WebElement
    #Then I validate price