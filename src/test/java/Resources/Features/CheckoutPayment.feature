@search
Feature: Filling out payment

  Background:
    Given I am on the homepage
    When I choose flight path from "Paris" to "Rome"
    And click search flights button
    And I choose flight number "9696"

  @paymentScenario
  Scenario: Filling in with user information
    Given I have the following details
      | Name               | Bob              |
      | Address            | 12 bob lane      |
      | City               | Leeds            |
      | State              | Utah             |
      | Zip Code           | 12345            |
      | Credit Card Number | 6666666666666666 |
      | Credit Card Month  | 11               |
      | Credit Card Year   | 2027             |
      | Name On Card       | Bob Smith        |
