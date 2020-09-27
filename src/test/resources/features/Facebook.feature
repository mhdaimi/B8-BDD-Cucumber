Feature: Test facebook login
Background: 
 Given User is at facebook login page

Scenario: Login with invalid password
When User enters valid username
And User enters invalid password
And User clicks on signin button
Then Login should not be successful


Scenario: Login with valid username; pass values from step
When User enters valid username "mhdaimi@gmxx.com"
And User enters invalid password "123456789"
And User clicks on signin button
Then Login is unsuccessful with text "Log in to Facebook" displayed on page

