@JP001 @smoketest
Feature: As a user we need to create a New Job Plan in MPO

  Scenario: Create a New Job Plan in MPO
    Given user open web browser and navigate to Maximo login screen
    And user enter a valid username and password
    And user click the Sign in button
    Then user Navigate to Page and verify the Page Title is "Start Center"
    When user click on Systems Administrator
    And user click on New Job Plan from Quick Insert menu
    And user enter "This Job Plan is for test Automation" into the Job Plan description field
    And user type and capture a Job Plan name as "JP001" into Job Plan field
    And user click on magnifying glass icon adjacent to Organization under Job Plan
    Then user select "TBT" from the organization dialog box for Job Plan
    And user click on magnifying glass icon adjacent to Site under Job Plan
    Then user select "GWB" from the Site dialog box for Job Plan
    And user click on magnifying glass icon adjacent to Maintenance Type under Job Plan
    Then user select "IR" from the Maintenance Type dialog box for Job Plan
    And user click on the paperclipped paper icon labeled Attachments and select Add from Library
    Then user clicks on a checkbox next to attachments from documents in the library
    And user click OK button in Create Attachments
    And user enter "TEST" into the Job plan procedure field
    And user select "Maintenance" for the Template Type field
    And user enter "1" into the Duration Type field
    And user click on magnifying glass icon adjacent to Job Priority under Job Plan
    Then user select "4" from the Job Priority dialog box for Job Plan
    And user left mouse click on disk icon for Save Job Plan within Maximo toolbar
    And user verify "Record has been saved" message appears
    And user select Active as New Status from Change Status for Job Plan
    And user verify "status changed to ACTIVE" message appears