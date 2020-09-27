Feature: Test facebook login
Background: 
 Given User is at facebook login page

@Regression
Scenario: Login with invalid password
When User enters valid username
And User enters invalid password
And User clicks on signin button
Then Login should not be successful

@Smoke @Regression
Scenario: Login with valid username; pass values from step
When User enters valid username "mhdaimi@gmxx.com"
And User enters invalid password "123456789"
And User clicks on signin button
Then Login is unsuccessful with text "Log in to Facebook" displayed on page

@datadriven
Scenario Outline: Login with different set of values
When User enters valid username "<username>"
And User enters invalid password "<password>"
And User clicks on signin button
Then Login is unsuccessful with text "<text>" displayed on page
Examples:
	| username | password | text |
	| mhdaimi@gmx.com  | 12345678 | Log in to Facebook |
	| batman@gmx.com   | 09876543 | Log in to Facebook |
	| superman@gmx.com | asdf123  | Log in to Facebook |
	

