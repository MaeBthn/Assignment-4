Feature: Create new account

Scenario: User registers a new account

Given I open the JPetStore website
When I navigate to register page
And I fill in registration details
Then the account should be created
