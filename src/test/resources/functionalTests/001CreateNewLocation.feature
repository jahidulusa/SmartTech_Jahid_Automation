@LO001 @smoketest
Feature: As a user we need to create New Location in MPO

  Scenario: Create a New Location in MPO
    Given user open web browser and navigate to Maximo login screen
    And user enter a valid username and password
    And user click the Sign in button
    Then user Navigate to Page and verify the Page Title is "Start Center"
    When user click on Systems Administrator
    And user click on New Location from Quick Insert menu
    And user type and capture a New location name as "LO001" into location field
    And user enter "This Location is for test Automation" into the Location description field
    And user click on magnifying glass icon adjacent to Type text box under Location Field
    Then user select "OPERATING" from the Type dialog box for Location
    And user click on magnifying glass icon adjacent to GL Account for this location
    Then user select a valid GL Account for this location
    And user enter valid cost center for this location
    And user enter valid Internal Order for this location  
    And user click on magnifying glass icon adjacent to Maintained By text box under EAM New Fields for Location
    Then user select "TENANT" from the Maintained By dialog box for Location
    And user left mouse click on disk icon for Save Location within Maximo tool bar
    And user verify "Record has been saved" message appears