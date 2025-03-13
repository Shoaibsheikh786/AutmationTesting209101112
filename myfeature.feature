Feature: myfeature

# admin1 password1
# admin2 passwrod2
# admin3 password3
Scenario Outline: verify login functionality with invalid credentilas 
Given user open the chrome Browser
And  user navigated to the url
When user enter username as <username>
And user enters passwrod as <password>
And user clicks on login button
Then user can see the home page

Examples:
|username|password|
|"admin1"|"password1"|
|"admin2"|"password2"|
|"admin3"|"password3"|


