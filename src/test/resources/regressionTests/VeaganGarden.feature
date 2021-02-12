@functionalTest 
Feature: Confirming for booking a table at Veagan Garden 
Scenario Outline: Successfully book a table at Veagan Garden 
	Given user go to Veagan Grden home page 
	And user enter a valid <username> and <password> 
	When user click on the login button 
	And user verify successfull login 
	Then user enter a date in date fields 
	And user enter enter number of guest in geat field 
	And user click on the submit button 
	Then user verify success message "Your booking is confirmed" 
	
	Examples:
	|username|password|
	|Parmita|5431354|
	|Adel|6531354|
	
Scenario: Unsuccessfully when booking a table at Veagan Garden 
	Given user go to Veagan Grden home page 
	And user enter a valid username and password 
	When user click on the login button 
	And user verify successfull login 
	#	Then user enter a date that the resturant is closed in date fields
	#	And user enter enter number of guest in geat field
	Then user enter date and guest number 
		|Date|02-06-2021|
		|Guest|5|
	And user click on the submit button 
	Then user verify error message "We are closed in the date you selected, please choose another date"