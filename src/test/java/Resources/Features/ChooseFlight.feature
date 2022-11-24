@search
Feature: Choosing Flights

  @scenario1
  Scenario: Search for flight path with given flight number
    Given I am on the homepage
    When I choose flight path from "Paris" to "Rome"
    And click search flights button
    And I choose flight number "9696"
    Then I see the correct airline is chosen

  @scenario2
  Scenario: Departure to destination flight check
    Given I am on the homepage
    When I choose flight path from "Paris" to "Rome"
    And click search flights button
    Then I see the flight path from "Paris" to "Rome"

  @scenario3
  Scenario: Departure to destination flight check
    Given I am on the homepage
    When I choose flight path from "Paris" to "Buenos Aires"
    And click search flights button
    Then I see the flight path from "Paris" to "Buenos Aires"