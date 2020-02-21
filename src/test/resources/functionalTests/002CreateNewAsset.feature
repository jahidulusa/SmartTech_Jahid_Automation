@AS001 @smoketest
Feature: As a user we need to create New Asset in MPO

  Scenario: Create a New Asset on given location
    Given user open web browser and navigate to Maximo login screen
    And user enter a valid username and password
    And user click the Sign in button
    Then user Navigate to Page and verify the Page Title is "Start Center"
    When user click on Systems Administrator
    And user click on New Asset from Quick Insert menu
    And user captures the Asset name for "AS001" test case
    And user enter "This Asset is for test Automation" into the Asset description field
    And user select captured "LO001" for Location field by clicking arrow then select value
    And user click on magnifying glass icon adjacent to Type text box under EAM New Fields
    Then user select first choice from the Type dialog box   
    And user click on magnifying glass icon adjacent to System text box under EAM New Fields
    Then user select "RLG" from the System dialog box
    And user click on magnifying glass icon adjacent to Sub System text box under EAM New Fields
    Then user select "AUTO" from the sub system dialog box
    And user click on magnifying glass icon adjacent to Equipment Class text box under EAM New Fields
    Then user select "AUTO" from the Equipment Class dialog box
    And user click on magnifying glass icon adjacent to Asset Type text box under EAM New Fields
    Then user select first choice from the Asset Type dialog box
    And user click on magnifying glass icon adjacent to Maintained By text box under EAM New Fields
    Then user select "CONT" from the Maintained By dialog box
    And user click on magnifying glass icon adjacent to Criticality text box under Details
    Then user select "3" from the Criticality dialog box
    And user click on Purchase Price text box under Life Cycle
    Then user enter "1000" into the Purchase Price dialog box
    And user click on Replacement Cost text box under Life Cycle
    Then user enter "2000" into the Replacement Cost dialog box
    And user click on Budgeted Cost text box under Life Cycle
    Then user enter "3000" into the Budgeted Cost dialog box
    And user left mouse click on disk icon for Save Asset within Maximo tool bar
    And user verify "Record has been saved" message appears
    And user navigate to Common Actions and click on Change Status
    And user select "Operating" as New Status from Change Status
    Then user click OK button in Change Status
    And user verify "Record has been saved" message appears