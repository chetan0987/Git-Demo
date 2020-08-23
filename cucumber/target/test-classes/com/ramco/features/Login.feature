Feature: Application Login

@mobTest
Scenario: HomePage Login 
Given users should be at login page
When user login with username "chetan" and password "lal"
Then home page is populated
And All cards are displayed

@smokeTest
Scenario: HomePage Login
Given users should be at login page 
When user signup with following details
|chetan|lal|ranchi|
|vivek|lal|Muz|
|chetan|kumar|chennai|
|mickey|kumar|chennai|
|mickey|kumar|chennai|
|mickey|kumar|chennai|
|mickey|kumar|chennai|
Then home page is populated
And All cards are displayed

@regTest
Scenario Outline: HomePage Login
Given users should be at login page
When user signin with following credentials <username> and <password> 
Then home page is populated
And All cards are displayed

Examples:
|username|password|
|user1|pass1|
|user2|pass2|