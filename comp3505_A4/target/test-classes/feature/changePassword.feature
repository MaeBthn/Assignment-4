Feature: Change password

Scenario: User updates password

Given I log into JPetStore
When I change my password
Then the password should update successfully
