package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.PmPage;


public class PmPageSteps {
	TestContext testContext;
	PmPage pmPage;
	
	public PmPageSteps(TestContext context) {
		testContext = context;
		pmPage = testContext.getPageObjectManager().getPmPage();
	}
	
	@When("^user enter \"([^\"]*)\" into the PM description field$")
	public void user_enter_into_the_PM_description_field(String text) throws Throwable {
	    pmPage.enterPmDescription(text);
	    
	}

	@When("^user click on magnifying glass icon adjacent to Maintenance Type for PM$")
	public void user_click_on_magnifying_glass_icon_adjacent_to_Maintenance_Type_for_PM() throws Throwable {
	    pmPage.clickPmMaintenanceTypeSearch();
	    
	}

	@Then("^user select \"([^\"]*)\" from the Maintenance Type dialog box for PM$")
	public void user_select_from_the_Maintenance_Type_dialog_box_for_PM(String text) throws Throwable {
	    pmPage.selectMaintenanceType(text);
	    
	}

	@Then("^user click on magnifying glass icon adjacent to Shift work is performed for PM$")
	public void user_click_on_magnifying_glass_icon_adjacent_to_Shift_work_is_performed_for_PM() throws Throwable {
	    pmPage.clickShiftWorkPerformedSearch();
	    
	}

	@Then("^user select \"([^\"]*)\" from the Shift work is performed dialog box for PM$")
	public void user_select_from_the_Shift_work_is_performed_dialog_box_for_PM(String text) throws Throwable {
	    pmPage.selectShiftWorkPerformed(text);
	    
	}

	@Then("^user enter \"([^\"]*)\" into the Start Year dialog box$")
	public void user_enter_into_the_Start_Year_dialog_box(String text) throws Throwable {
	    pmPage.enterStartYear(text);
	    
	}

	@Then("^user click on magnifying glass icon adjacent to Section Sub Section for PM$")
	public void user_click_on_magnifying_glass_icon_adjacent_to_Section_Sub_Section_for_PM() throws Throwable {
	    pmPage.clickSectionSubSectionSearch();
	    
	}

	@Then("^user select \"([^\"]*)\" from the Section Sub Section dialog box for PM$")
	public void user_select_from_the_Section_Sub_Section_dialog_box_for_PM(String text) throws Throwable {
	    pmPage.selectSectionSubSection(text);
	    
	}

	@Then("^user enter \"([^\"]*)\" hours into the PM Duration text field$")
	public void user_enter_hours_into_the_PM_Duration_text_field(String num) throws Throwable {
	    pmPage.enterPmDuration(num);
	    
	}

	@Then("^user navigate to details section and enter captured \"([^\"]*)\" as Asset$")
	public void user_navigate_to_details_section_and_enter_captured_as_Asset(String key) throws Throwable {
	    pmPage.enterAssetValue(key);
	    
	}

	@Then("^user enter \"([^\"]*)\" Days into the Lead Time text field$")
	public void user_enter_Days_into_the_Lead_Time_text_field(String num) throws Throwable {
	    pmPage.enterLeadTimeDays(num);
	    
	}

	@Then("^user navigate to Work Order section and select captured \"([^\"]*)\" as Job Plan$")
	public void user_navigate_to_Work_Order_section_and_select_captured_as_Job_Plan(String key) throws Throwable {
	    pmPage.enterJobPlanValue(key);
	    
	}

	@Then("^user click on magnifying glass icon adjacent to Job Priority for PM$")
	public void user_click_on_magnifying_glass_icon_adjacent_to_Job_Priority_for_PM() throws Throwable {
	    pmPage.clickJobPrioritySearch();
	    
	}

	@Then("^user select \"([^\"]*)\" from the Job Priority dialog box for PM$")
	public void user_select_from_the_Job_Priority_dialog_box_for_PM(String text) throws Throwable {
	    pmPage.selectJobPriority(text);
	    
	}

	@Then("^user enter \"([^\"]*)\" into the Extra Value for Work Order Priority text field$")
	public void user_enter_into_the_Extra_Value_for_Work_Order_Priority_text_field(String num) throws Throwable {
	    pmPage.enterExtraValueWorkOrder(num);
	    
	}

	@Then("^user navigate to Resource Information and enter valid GL Account for PM$")
	public void user_navigate_to_Resource_Information_and_enter_valid_GL_Account_for_PM() throws Throwable {
	    pmPage.enterValidGlAccount();
	    
	}

	@Then("^user enter valid Cost Center for PM$")
	public void user_enter_valid_Cost_Center_for_PM() throws Throwable {
	    pmPage.enterValidCostCenter();
	    
	}

	@Then("^user enter valid Internal Order for PM$")
	public void user_enter_valid_Internal_Order_for_PM() throws Throwable {
		pmPage.enterValidInternalOrder();
	    
	}

	@When("^user navigate to frequency tab for PM$")
	public void user_navigate_to_frequency_tab_for_PM() throws Throwable {
	    pmPage.navigateToFrequencyTab();
	    
	}

	@When("^user enter tomorrows date into the Start Date text field for PM$")
	public void user_enter_tomorrows_date_into_the_Start_Date_text_field_for_PM() throws Throwable {
	    pmPage.enterTomorrowsDateAsStartDate();
	    
	}

	@When("^user enter \"([^\"]*)\" into Frequency text field for PM$")
	public void user_enter_into_Frequency_text_field_for_PM(String num) throws Throwable {
	    pmPage.enterGivenFrequency(num);
	    
	}

	@Then("^user enter tomorrows date into the Estimated Next Due Date field for PM$")
	public void user_enter_tomorrows_date_into_the_Estimated_Next_Due_Date_field_for_PM() throws Throwable {
	    pmPage.enterEstimatedNextDueDate();
	    
	}

	@Then("^user navigate to Seasonal Dates tab for PM$")
	public void user_navigate_to_Seasonal_Dates_tab_for_PM() throws Throwable {
	    pmPage.navigateToSeasonalDates();
	    
	}

	@Then("^user click checkbox for Sunday Wednesday and Friday$")
	public void user_click_checkbox_for_Sunday_Wednesday_and_Friday() throws Throwable {
	    pmPage.checkBoxActiveDays();
	    
	}

	@Then("^user left mouse click on disk icon for Save PM within Maximo toolbar$")
	public void user_left_mouse_click_on_disk_icon_for_Save_PM_within_Maximo_toolbar() throws Throwable {
	    pmPage.clickSavePmBtn();
	    
	}

	@Then("^user navigate to Common Actions for PM and click on Change Status$")
	public void user_navigate_to_Common_Actions_for_PM_and_click_on_Change_Status() throws Throwable {
	    pmPage.clickChangeStatusPmBtn();
	    
	}

	@Then("^user select \"([^\"]*)\" as New Status from Change Status for PM$")
	public void user_select_as_New_Status_from_Change_Status_for_PM(String arg1) throws Throwable {
	    pmPage.changePmStatus();
	    
	}

	@Then("^user click OK button in Change Status for PM$")
	public void user_click_OK_button_in_Change_Status_for_PM() throws Throwable {
	    pmPage.statusChangePmOk();
	    
	}
	
	@Then("^user click ok to delete forcast$")
	public void user_click_ok_to_delete_forcast() throws Throwable {
	    pmPage.clickOkDeleteforecast();
	}
	
	@Then("^user captures the PM number for \"([^\"]*)\" test case$")
	public void user_captures_the_PM_number_for_test_case(String pmName) throws Throwable {
	    pmPage.capturePmNumber(pmName);
	}

	@When("^user type captured \"([^\"]*)\" in Preventive Maintenance textbox and hit Enter key$")
	public void user_type_captured_in_Preventive_Maintenance_textbox_and_hit_Enter_key(String arg1) throws Throwable {
	    pmPage.searchPmValue(arg1);
	    
	}

	@When("^user click on the PM name and navigate to details page of the Preventive Maintenance$")
	public void user_click_on_the_PM_name_and_navigate_to_details_page_of_the_Preventive_Maintenance() throws Throwable {
	    pmPage.clickPmResult();
	    
	}

	@When("^user verify PM number on this page match with captured \"([^\"]*)\"$")
	public void user_verify_PM_number_on_this_page_match_with_captured(String arg1) throws Throwable {
	    pmPage.verifyPmNumberMatches(arg1);
	    
	}

	@When("^user select INACTIVE as New Status from Change Status for PM$")
	public void user_select_INACTIVE_as_New_Status_from_Change_Status_for_PM() throws Throwable {
	    pmPage.changePmStatusInactive();
	    
	}

	@Then("^user enter revision number in the PM Revision field$")
	public void user_enter_revision_number_in_the_PM_Revision_field() throws Throwable {
	    pmPage.enterRevisionNumber();
	    
	}

}
