Feature: Search Functionality 

Background:
Given user open chrome Browser 
And user navigate the url ecom
When user click on serach field 


Scenario: verify we are able to serach products 

And user provided input as flower
And user click on serach btn 
Then user can see the flower list

Scenario: verify we are able to serach products 

And user provided input as mobile 
And user searchs with voice command 
Then user can see the mobile list

