@RT001 @smoketest
Feature: As a user we need to create New Route in MPO

  Scenario: Create a New Route in MPO
    Given user open web browser and navigate to Maximo login screen
    And user enter a valid username and password
    And user click the Sign in button
    Then user Navigate to Page and verify the Page Title is "Start Center"
    When user navigate to Go to icon and click on Routes from Planning
    And user click on New Route from application tool bar
    Then user Navigate to Page and verify the Page Title is "Routes"
    And user type and capture a New Route name as "RT001" into Route field
    And user enter "This Route is for test Automation" into the Route description field
    And user select Entries in the Work Orders Multi Asset Location and CI Table under Route is applied
    Then user navigate to Route Stops section and click on New Row button
    And user enter "Stop 1" in Details Description field
    And user enter "10" in Details Sequence field
    And user select "LO001" captured location for the Location field
    Then user navigate to Route Stops section and click on New Row button
    And user enter "Stop 2" in Details Description field
    And user enter "20" in Details Sequence field
    And user select "AS001" captured Asset for the Asset field
    And user left mouse click on disk icon for Save Route within Maximo tool bar
    And user verify "Record has been saved" message appears