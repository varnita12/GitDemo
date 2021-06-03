Feature: Search and order for a Vegitable

@SeleniumTest
Scenario: Search for a Vegitable and validate the result
Given User is on GreenKart Landing page
When User search for Cucumber vegitable
Then "Cucumber" Result is displayed

@SeleniumTest
Scenario Outline: Search for a Vegitable and validate the result
Given User is on GreenKart Landing page
When User search for <Name> vegitable
And added item to cart
And user proceed to checkout
Then <Name> Result is added to checkout page

Examples:
|Name |
|Brinjal|
|Cucumber|