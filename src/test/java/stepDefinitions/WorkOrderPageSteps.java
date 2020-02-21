package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.WorkOrderPage;

public class WorkOrderPageSteps {
	TestContext testContext;
	WorkOrderPage workOrderPage;
	
	public WorkOrderPageSteps(TestContext context) {
		testContext = context;
		workOrderPage = testContext.getPageObjectManager().getWorkOrderPage();
	}
	
	@When("^user click on New Work Order from Quick Insert menu$")
	public void user_click_on_New_Work_Order_from_Quick_Insert_menu() throws Throwable {
		workOrderPage.clickQuickInsertNewWorkOrder();
	    
	}

	@When("^user enter \"([^\"]*)\" into the Work Order description field$")
	public void user_enter_into_the_Work_Order_description_field(String text) throws Throwable {
		workOrderPage.enterWorkOrderDescription(text);
	    
	}

	@Then("^user enter a previously created Asset as \"([^\"]*)\" into the Asset field$")
	public void user_enter_a_previously_created_Asset_as_into_the_Asset_field(String text) throws Throwable {
	    workOrderPage.enterAssetForWorkOrder(text);
	    
	}
	
	@Then("^user select captured value from \"([^\"]*)\" for Assets field by clicking arrow then select value$")
	public void user_select_captured_value_from_for_Assets_field_by_clicking_arrow_then_select_value(String asName) throws Throwable {
	    workOrderPage.selectAsset(asName);
	}

	@Then("^user click on magnifying glass icon adjacent to Work Type text box$")
	public void user_click_on_magnifying_glass_icon_adjacent_to_Work_Type_text_box() throws Throwable {
	    workOrderPage.clickWorkTypeSearch();
	    
	}

	@Then("^user select \"([^\"]*)\" from the Work Type dialog box$")
	public void user_select_from_the_Work_Type_dialog_box(String text) throws Throwable {
		workOrderPage.selectValueFromWorkTypeSubTable(text);
	    
	}
	
	@Then("^user enter \"([^\"]*)\" into cost center dialog box$")
	public void user_enter_into_cost_center_dialog_box(String text) throws Throwable {
		workOrderPage.enterValueForCostCenter(text);
	}
	
	@Then("^user enter valid cost center for Work Order$")
	public void user_enter_valid_cost_center_for_Work_Order() throws Throwable {
		workOrderPage.enterValueForCostCenter();
	}
	
	@Then("^user enter valid Internal Order for Work Order$")
	public void user_enter_valid_Internal_Order_for_Work_Order() throws Throwable {
	    workOrderPage.enterValueForInternalOrder();
	}


	@Then("^User select a future Schedule start date$")
	public void user_select_a_future_Schedule_start_date() throws Throwable {
		workOrderPage.selectDateScheduleStart();
	    
	}

	@Then("^User select a future Target start date$")
	public void user_select_a_future_Target_start_date() throws Throwable {
	    workOrderPage.selectTargetStartDate();
	    
	}

	@Then("^user click on magnifying glass icon adjacent to Enhanced Priority text box$")
	public void user_click_on_magnifying_glass_icon_adjacent_to_Enhanced_Priority_text_box() throws Throwable {
	    workOrderPage.clickEnhancedPrioritySearch();
	    
	}

	@Then("^user select \"([^\"]*)\" from the Enhanced Priority dialog box$")
	public void user_select_from_the_Enhanced_Priority_dialog_box(String text) throws Throwable {
	    workOrderPage.selectEnhancedPriorityValue(text);
	    
	}

	@Then("^user click on magnifying glass icon adjacent to Maintenance Type text box under EAM New Fields$")
	public void user_click_on_magnifying_glass_icon_adjacent_to_Maintenance_Type_text_box_under_EAM_New_Fields() throws Throwable {
		workOrderPage.clickMaintenanceTypeSearch();
	    
	}

	@Then("^user select \"([^\"]*)\" from the Maintenance Type dialog box$")
	public void user_select_from_the_Maintenance_Type_dialog_box(String text) throws Throwable {
		workOrderPage.selectValueFromMaintenanceTypeSubTable(text);
	    
	}

	@Then("^user click on magnifying glass icon adjacent to Shift work is performed text box under EAM New Fields$")
	public void user_click_on_magnifying_glass_icon_adjacent_to_Shift_work_is_performed_text_box_under_EAM_New_Fields() throws Throwable {
		workOrderPage.clickShiftWorkIsPerformedSearch();
	    
	}

	@Then("^user select \"([^\"]*)\" from the Shift work is performed dialog box$")
	public void user_select_from_the_Shift_work_is_performed_dialog_box(String text) throws Throwable {
		workOrderPage.selectValueFromShiftWorkIsPerformedSubTable(text);
	    
	}

	@Then("^user click on magnifying glass icon adjacent to Org Unit text box under EAM New Fields$")
	public void user_click_on_magnifying_glass_icon_adjacent_to_Org_Unit_text_box_under_EAM_New_Fields() throws Throwable {
	    workOrderPage.clickOrgUnitSearch();
	    
	}

	@Then("^user select \"([^\"]*)\" from the Org Unit dialog box$")
	public void user_select_from_the_Org_Unit_dialog_box(String text) throws Throwable {
		workOrderPage.selectValueFromOrgUnitSubTable(text);
	    
	}

	@Then("^user click on magnifying glass icon adjacent to GL Account text box under Asset Details$")
	public void user_click_on_magnifying_glass_icon_adjacent_to_GL_Account_text_box_under_Asset_Details() throws Throwable {
	    workOrderPage.clickGLAccountSearch();
	    
	}

	@Then("^user select first value from the GL Account dialog box$")
	public void user_select_first_value_from_the_GL_Account_dialog_box() throws Throwable {
	    workOrderPage.selectGLAccountValue();
	    
	}

	@Then("^user click on magnifying glass icon adjacent to WBS Element text box under Asset Details$")
	public void user_click_on_magnifying_glass_icon_adjacent_to_WBS_Element_text_box_under_Asset_Details() throws Throwable {
		 workOrderPage.clickWBSElementSearch();
	    
	}

	@Then("^user select \"([^\"]*)\" from the WBS Element dialog box$")
	public void user_select_from_the_WBS_Element_dialog_box(String text) throws Throwable {
	    workOrderPage.selectValueFromWBSElementSubTable(text);
	    
	}
	
	@Then("^user navigate to Common Actions and click on Save Work Order$")
	public void user_navigate_to_Common_Actions_and_click_on_Save_Work_Order() throws Throwable {
		workOrderPage.clickSaveWorkOrder();
	}

}
