@WO004 @smoketest
Feature: As a user we need to create New Work Order in MPO

  Scenario: Create a New Work Order in MPO
    Given user open web browser and navigate to Maximo login screen
    And user enter a valid username and password
    And user click the Sign in button
    Then user Navigate to Page and verify the Page Title is "Start Center"
    When user click on Systems Administrator
    And user click on New Work Order from Quick Insert menu
    And user enter "This Work Order is for test Automation" into the Work Order description field
    And user select captured value from "AS001" for Assets field by clicking arrow then select value
    And user click on magnifying glass icon adjacent to Work Type text box
    Then user select "BE" from the Work Type dialog box
    And user click on magnifying glass icon adjacent to Enhanced Priority text box
    Then user select "1" from the Enhanced Priority dialog box
    And user click on magnifying glass icon adjacent to Maintenance Type text box under EAM New Fields
    Then user select "AO" from the Maintenance Type dialog box
    And user click on magnifying glass icon adjacent to Shift work is performed text box under EAM New Fields
    Then user select "A" from the Shift work is performed dialog box
    And user click on magnifying glass icon adjacent to Org Unit text box under EAM New Fields
    Then user select "1640101" from the Org Unit dialog box
    And user click on magnifying glass icon adjacent to GL Account text box under Asset Details
    Then user select first value from the GL Account dialog box
    And user enter valid cost center for Work Order
    And user enter valid Internal Order for Work Order
    And User select a future Schedule start date
    And User select a future Target start date
    And user navigate to Common Actions and click on Save Work Order
    And user verify "Record has been saved" message appears