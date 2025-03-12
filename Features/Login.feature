Feature: Login feature

Scenario: Verify the login feature with valid credentials
Given open the chrome
And enter the url practice.expandtesting.comlogin
When user enters username as practice
And user enters password as SuperSecretPassword!
And user clicks on the login button 
Then user will be navigated to logout page
Then user closes the browser


Scenario: Verify the login feature with invalid credentials
Given open the chrome
And enter the url practice.expandtesting.comlogin
