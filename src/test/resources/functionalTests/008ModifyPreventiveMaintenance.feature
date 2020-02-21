@PM002 @smoketest
Feature: As a user we need to modify Preventive Maintenance in MPO

  Scenario: Modify Preventive Maintenance in MPO
    Given user open web browser and navigate to Maximo login screen
    And user enter a valid username and password
    And user click the Sign in button
    Then user Navigate to Page and verify the Page Title is "Start Center"
    And user navigates to Preventive Maintenance page from go to button
    Then user Navigate to Page and verify the Page Title is "Preventive Maintenance(Tr)"
    When user type captured "PM001" in Preventive Maintenance textbox and hit Enter key
    And user click on the PM name and navigate to details page of the Preventive Maintenance
    #And user verify PM number on this page match with captured "PM001"
    And user navigate to Common Actions for PM and click on Change Status
    And user select INACTIVE as New Status from Change Status for PM
    Then user click OK button in Change Status for PM
    And user verify "status changed to INACTIVE" message appears
    And user enter revision number in the PM Revision field
    And user enter "7" Days into the Lead Time text field
    And user left mouse click on disk icon for Save PM within Maximo toolbar
    And user navigate to Common Actions for PM and click on Change Status
    And user select "Active" as New Status from Change Status for PM
    Then user click OK button in Change Status for PM
    And user verify "status changed to ACTIVE" message appears