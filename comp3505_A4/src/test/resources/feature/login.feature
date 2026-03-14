Feature: Login to JPetStore

Scenario Outline: User logs into JPetStore

Given I open Chrome browser
And I navigate to JPetStore login page
When I enter username "<username>" and password "<password>"
Then I should see the homepage

Examples:
| username | password |
| j2ee | j2ee |
| quality1 | 12345678 |
