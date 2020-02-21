@JP002 @smoketest
Feature: As a user we need to modify a previously created Job Plan in MPO

  Scenario: Modify a previously created Job Plan in MPO
    Given user open web browser and navigate to Maximo login screen
    And user enter a valid username and password
    And user click the Sign in button
    Then user Navigate to Page and verify the Page Title is "Start Center"
    And user navigates to Job Plan page from go to button
    Then user Navigate to Page and verify the Page Title is "Job Plans (Tr)"
    When user type captured "JP001" in Job Plan textbox and hit Enter key
    And user click on the Job Plan name and navigate to details page of the Job Plan
    And user navigate to Select Action drop down and click on Revise Job Plan
    And user enter "Revision 1-Test" into the revision description field and hit Enter key
    And user verify "status changed to PNDREV" message appears
    And user navigate to Select Action drop down and click on View Revision History
    And user verify revision number zero as ACTIVE
    And user verify revision number one as PNDREV
    And user verify revision number one display comments as "Revision 1-Test" 
    And user click on OK button in View Revision History
    Then user navigate to Job Plan Tasks section and click on New Row button
    And user type "1" as hour for Duration of Job
    And user type "10" as task number for Task field
    And user enter "Task 10- Test" into the task description field
 		Then user navigate to Job Plan Labor section and click on New Row button
    And user type "10" as task number for Task field  under Planned Labor
    And user select a valid craft type for the Craft field
    And user type "1" as hour for Hours of Planned Labor
    And user left mouse click on disk icon for Save Job Plan within Maximo toolbar
    And user verify "Record has been saved" message appears