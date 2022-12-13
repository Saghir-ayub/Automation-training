@search
Feature: Choosing Flight paths

  Background:
    Given I am on the homepage

  Scenario Outline: Flight from <departure> to <destination>
    When I choose flight path from "<departure>" to "<destination>"
    And click search flights button
    Then I see the flight path from "<departure>" to "<destination>"
    Examples:
      | departure | destination  |
      | Paris     | Rome         |
      | Paris     | Cairo        |
      | Boston    | Buenos Aires |