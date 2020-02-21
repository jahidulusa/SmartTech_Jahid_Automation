@smokeTest 
Feature: Validate login function in Orange HRM

Scenario: User able to login with valid credential 
	Given user open web browser and navigate to HRM login screen
	Then user Navigate to Page and verify the Page Title is "OrangeHRM"
	And user enter a valid username and password
	And user click the Sign in button
	Then user Navigate to Page and verify the Page Title is "OrangeHRM"
	When user click on log out button for Orange Hrm
	Then user Navigate to Page and verify the Page Title is "OrangeHRM"