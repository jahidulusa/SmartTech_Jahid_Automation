@PM001 @smoketest
Feature: As a user we need to create a New Preventive Maintenance in MPO

  Scenario: Create a New Preventive Maintenance in MPO
    Given user open web browser and navigate to Maximo login screen
    And user enter a valid username and password
    And user click the Sign in button
    Then user Navigate to Page and verify the Page Title is "Start Center"
    When user click on Systems Administrator
    And user click on New PM from Quick Insert menu
    Then user Navigate to Page and verify the Page Title is "Preventive Maintenance(Tr)"
    And user enter "This PM is for test Automation" into the PM description field
    And user captures the PM number for "PM001" test case
    And user click on magnifying glass icon adjacent to Maintenance Type for PM
    Then user select "IR" from the Maintenance Type dialog box for PM
    And user click on magnifying glass icon adjacent to Shift work is performed for PM
    Then user select "A" from the Shift work is performed dialog box for PM
    And user enter "2019" into the Start Year dialog box
    And user click on magnifying glass icon adjacent to Section Sub Section for PM
    Then user select "1640501" from the Section Sub Section dialog box for PM
    And user enter "1" hours into the PM Duration text field 
    Then user navigate to details section and enter captured "AS001" as Asset
    And user enter "15" Days into the Lead Time text field
    And user navigate to Work Order section and select captured "JP001" as Job Plan
    And user click on magnifying glass icon adjacent to Job Priority for PM
    Then user select "4" from the Job Priority dialog box for PM
    And user enter "10" into the Extra Value for Work Order Priority text field
    Then user navigate to Resource Information and enter valid GL Account for PM
    And user enter valid Cost Center for PM
    And user enter valid Internal Order for PM
    When user navigate to frequency tab for PM
    And user enter tomorrows date into the Start Date text field for PM
    And user enter "3" into Frequency text field for PM
    Then user enter tomorrows date into the Estimated Next Due Date field for PM
    And user navigate to Seasonal Dates tab for PM
    And user click checkbox for Sunday Wednesday and Friday
    And user left mouse click on disk icon for Save PM within Maximo toolbar
    And user verify "Record has been saved" message appears
    And user navigate to Common Actions for PM and click on Change Status
    And user select "Active" as New Status from Change Status for PM
    Then user click OK button in Change Status for PM
    And user verify "status changed to ACTIVE" message appears