package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import pageObjects.JobPlanPage;

public class JobPlanPageSteps {
	TestContext testContext;
	JobPlanPage jobPlanPage;
	
	public JobPlanPageSteps(TestContext context) {
		testContext = context;
		jobPlanPage = testContext.getPageObjectManager().getJobPlanPage();
		
	}

	@When("^user enter \"([^\"]*)\" into the Job Plan description field$")
	public void user_enter_into_the_Job_Plan_description_field(String text) throws Throwable {
	    jobPlanPage.enterJobPlanDescription(text);
	    
	}

	@When("^user click on magnifying glass icon adjacent to Organization under Job Plan$")
	public void user_click_on_magnifying_glass_icon_adjacent_to_Organization_under_Job_Plan() throws Throwable {
	    jobPlanPage.clickOrganizationSearch();
	    
	}

	@Then("^user select \"([^\"]*)\" from the organization dialog box for Job Plan$")
	public void user_select_from_the_organization_dialog_box_for_Job_Plan(String text) throws Throwable {
	    jobPlanPage.selectOrganization(text);
	    
	}

	@Then("^user click on magnifying glass icon adjacent to Site under Job Plan$")
	public void user_click_on_magnifying_glass_icon_adjacent_to_Site_under_Job_Plan() throws Throwable {
	    jobPlanPage.clickSiteSearch();
	    
	}

	@Then("^user select \"([^\"]*)\" from the Site dialog box for Job Plan$")
	public void user_select_from_the_Site_dialog_box_for_Job_Plan(String text) throws Throwable {
	    jobPlanPage.selectSite(text);
	    
	}

	@Then("^user click on magnifying glass icon adjacent to Maintenance Type under Job Plan$")
	public void user_click_on_magnifying_glass_icon_adjacent_to_Maintenance_Type_under_Job_Plan() throws Throwable {
	    jobPlanPage.clickMaintenancetypeSearch();
	    
	}

	@Then("^user select \"([^\"]*)\" from the Maintenance Type dialog box for Job Plan$")
	public void user_select_from_the_Maintenance_Type_dialog_box_for_Job_Plan(String text) throws Throwable {
	    jobPlanPage.selectMaintenanceType(text);
	    
	}

	@Then("^user click on the paperclipped paper icon labeled Attachments and select Add from Library$")
	public void user_click_on_the_paperclipped_paper_icon_labeled_Attachments_and_select_Add_from_Library() throws Throwable {
	    jobPlanPage.selectAttachmentsAddFromLibrary();
	    
	}

	@Then("^user clicks on a checkbox next to attachments from documents in the library$")
	public void user_clicks_on_a_checkbox_next_to_attachments_from_documents_in_the_library() throws Throwable {
		jobPlanPage.clickFirstCheckboxLibraryAttachment();
	    
	}

	@Then("^user click OK button in Create Attachments$")
	public void user_click_OK_button_in_Create_Attachments() throws Throwable {
		jobPlanPage.clickLibraryAttachOkBtn();
	    
	}

	@Then("^user enter \"([^\"]*)\" into the Job plan procedure field$")
	public void user_enter_into_the_Job_plan_procedure_field(String text) throws Throwable {
	    jobPlanPage.enterJobPlanProcedure(text);
	    
	}

	@Then("^user select \"([^\"]*)\" for the Template Type field$")
	public void user_select_for_the_Template_Type_field(String arg1) throws Throwable {
	    jobPlanPage.selectTemplateType();
	    
	}

	@Then("^user enter \"([^\"]*)\" into the Duration Type field$")
	public void user_enter_into_the_Duration_Type_field(String num) throws Throwable {
	    jobPlanPage.enterDuration(num);
	    
	}

	@Then("^user click on magnifying glass icon adjacent to Job Priority under Job Plan$")
	public void user_click_on_magnifying_glass_icon_adjacent_to_Job_Priority_under_Job_Plan() throws Throwable {
	    jobPlanPage.clickJobPrioritySearch();
	    
	}

	@Then("^user select \"([^\"]*)\" from the Job Priority dialog box for Job Plan$")
	public void user_select_from_the_Job_Priority_dialog_box_for_Job_Plan(String text) throws Throwable {
	    jobPlanPage.selectJobPriority(text);
	    
	}

	@Then("^user left mouse click on disk icon for Save Job Plan within Maximo toolbar$")
	public void user_left_mouse_click_on_disk_icon_for_Save_Job_Plan_within_Maximo_toolbar() throws Throwable {
	    jobPlanPage.clickJobPrioritySave();
		
	}
	
	@Then("^user select Active as New Status from Change Status for Job Plan$")
	public void user_select_Active_as_New_Status_from_Change_Status_for_Job_Plan() throws Throwable {
	    jobPlanPage.changeJpStatus();
	}
	
	@When("^user type and capture a Job Plan name as \"([^\"]*)\" into Job Plan field$")
	public void user_type_and_capture_a_Job_Plan_name_as_into_Job_Plan_field(String jpName) throws Throwable {
	    jobPlanPage.enterNewJobPlanInJobPlanField(jpName);
	}
	
	@When("^user type captured \"([^\"]*)\" in Job Plan textbox and hit Enter key$")
	public void user_type_captured_in_Job_Plan_textbox_and_hit_Enter_key(String key) throws Throwable {
	    jobPlanPage.searchJobPlanValue(key);
	    
	}

	@When("^user click on the Job Plan name and navigate to details page of the Job Plan$")
	public void user_click_on_the_Job_Plan_name_and_navigate_to_details_page_of_the_Job_Plan() throws Throwable {
	    jobPlanPage.clickJobPlanResult();
	    
	}

	@When("^user navigate to Select Action drop down and click on Revise Job Plan$")
	public void user_navigate_to_Select_Action_drop_down_and_click_on_Revise_Job_Plan() throws Throwable {
	    jobPlanPage.clickReviseJobPlan();
	    
	}

	@When("^user enter \"([^\"]*)\" into the revision description field and hit Enter key$")
	public void user_enter_into_the_revision_description_field_and_hit_Enter_key(String text) throws Throwable {
	    jobPlanPage.enterRevisionDescription(text);
	    
	}

	@When("^user navigate to Select Action drop down and click on View Revision History$")
	public void user_navigate_to_Select_Action_drop_down_and_click_on_View_Revision_History() throws Throwable {
	    jobPlanPage.viewRevisionHistory();
	    
	}

	@When("^user verify revision number zero as ACTIVE$")
	public void user_verify_revision_number_zero_as_ACTIVE() throws Throwable {
	    jobPlanPage.verifyRevisionZeroStatus();
	    
	}

	@When("^user verify revision number one as PNDREV$")
	public void user_verify_revision_number_one_as_PNDREV() throws Throwable {
		jobPlanPage.verifyRevisionOneStatus();
	    
	}

	@When("^user verify revision number one display comments as \"([^\"]*)\"$")
	public void user_verify_revision_number_one_display_comments_as(String arg1) throws Throwable {
	    jobPlanPage.verifyRevisionOneComments();
	    
	}
	
	@And("^user click on OK button in View Revision History$")
	public void user_click_on_OK_button_in_View_Revision_History() throws Throwable {
	    jobPlanPage.clickRevHistoryOkBtn();
	}

	@Then("^user navigate to Job Plan Tasks section and click on New Row button$")
	public void user_navigate_to_Job_Plan_Tasks_section_and_click_on_New_Row_button() throws Throwable {
	    jobPlanPage.clickTaskNewRowBtn();
	    
	}

	@Then("^user type \"([^\"]*)\" as hour for Duration of Job$")
	public void user_type_as_hour_for_Duration_of_Job(String text) throws Throwable {
	    jobPlanPage.enterTaskDuration(text);
	    
	}

	@Then("^user type \"([^\"]*)\" as task number for Task field$")
	public void user_type_as_task_number_for_Task_field(String text) throws Throwable {
	    jobPlanPage.enterTaskNumber(text);
	    
	}

	@Then("^user enter \"([^\"]*)\" into the task description field$")
	public void user_enter_into_the_task_description_field(String text) throws Throwable {
	    jobPlanPage.enterTaskDescription(text);
	    
	}

	@Then("^user navigate to Job Plan Labor section and click on New Row button$")
	public void user_navigate_to_Job_Plan_Labor_section_and_click_on_New_Row_button() throws Throwable {
	    jobPlanPage.clickPlannedLaborNewRowBtn();
	    
	}

	@Then("^user type \"([^\"]*)\" as task number for Task field  under Planned Labor$")
	public void user_type_as_task_number_for_Task_field_under_Planned_Labor(String text) throws Throwable {
	    jobPlanPage.enterPlTaskNumber(text);
	    
	}

	@Then("^user select a valid craft type for the Craft field$")
	public void user_select_a_valid_craft_type_for_the_Craft_field() throws Throwable {
	    jobPlanPage.enterValidCraft();
	    
	}

	@Then("^user type \"([^\"]*)\" as hour for Hours of Planned Labor$")
	public void user_type_as_hour_for_Hours_of_Planned_Labor(String text) throws Throwable {
	    jobPlanPage.enterPlTaskHours(text);
	    
	}

}
