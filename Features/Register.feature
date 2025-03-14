Feature: Register 

Scenario: verify user is able to register a new account 
Given open the browser
And enter the url "https://www.facebook.com/r.php?entry_point=login"
When user provider the regstration data 
|jhon|jack|13|may|
Then user can see login page

