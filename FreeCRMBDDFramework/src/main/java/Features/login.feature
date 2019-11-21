Feature: Free CRM Login Feature


Scenario Outline: Free CRM Login Test Scenario

Given user is already on Login Page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then user clicks on contact page clicks on new
Then user enters contact details "<firstname>" and "<lastname>" and "<email>" and "<position>"
Then Close the browser


Examples:
	| username                 | password | firstname        | lastname	| email               |position   |
	| chitramale345@gmail.com  | Intelli321 | bondy            |Neil        |bondyneil@gmail.com    |Manager    |	
	| chitramale345@gmail.com  | Intelli321 | stella           |robert        |strobert@gmail.com    |Analyst    |	
    

    