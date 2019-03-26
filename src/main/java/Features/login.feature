Feature: HRM Login Feature

#with Examples keyword
Scenario Outline: HRM login test Scenartio

Given User is already on Login page
When title of login page is OrangeHRM
Then user enters '<username>' and '<password>'
Then user clicks on login button
Then user is on the home page
Then browser closed
Examples:
	| username | password |
	| admin | admin123|
	| Tom 	| test123 |