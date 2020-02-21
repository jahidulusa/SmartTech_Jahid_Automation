package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.AssetsPage;

public class AssetsPageSteps {
	TestContext testContext;
	AssetsPage assetsPage;
	
	public AssetsPageSteps(TestContext context) {
		testContext = context;
		assetsPage = testContext.getPageObjectManager().getAssetsPage();
	}
	
	

	@When("^user captures the Asset name for \"([^\"]*)\" test case$")
	public void user_captures_the_Asset_name_for_test_case(String assetName) throws Throwable {
	    assetsPage.captureAssetsValue(assetName);
	    
	}

	@When("^user enter \"([^\"]*)\" into the Asset description field$")
	public void user_enter_into_the_Asset_description_field(String text) throws Throwable {
	    assetsPage.enterDescription(text);
	    
	}
	
	@When("^user select captured \"([^\"]*)\" for Location field by clicking arrow then select value$")
	public void user_select_captured_for_Location_field_by_clicking_arrow_then_select_value(String text) throws Throwable {
		assetsPage.selectLocation(text);
	}

	@When("^user click on magnifying glass icon adjacent to Sub System text box under EAM New Fields$")
	public void user_click_on_magnifying_glass_icon_adjacent_to_Sub_System_text_box_under_EAM_New_Fields() throws Throwable {
	    assetsPage.clickSubSystemSearch();
	    
	}
	
	@Then("^user click on magnifying glass icon adjacent to Asset Type text box under EAM New Fields$")
	public void user_click_on_magnifying_glass_icon_adjacent_to_Asset_Type_text_box_under_EAM_New_Fields() throws Throwable {
	    assetsPage.clickAssetTypeSearch();
	}

	@Then("^user select first choice from the Asset Type dialog box$")
	public void user_select_first_choice_from_the_Asset_Type_dialog_box() throws Throwable {
	   assetsPage.selectFirstAssetTypeFromChoice();
	}

	@Then("^user select \"([^\"]*)\" from the sub system dialog box$")
	public void user_select_from_the_sub_system_dialog_box(String text) throws Throwable {
		assetsPage.selectAutoFromSubtable(text);
	    
	}

	@Then("^user click on magnifying glass icon adjacent to System text box under EAM New Fields$")
	public void user_click_on_magnifying_glass_icon_adjacent_to_System_text_box_under_EAM_New_Fields() throws Throwable {
		assetsPage.clickSystemSearch();
	    
	}
	
	@Then("^user select first choice from the Type dialog box$")
	public void user_select_first_choice_from_the_Type_dialog_box() throws Throwable {
	    assetsPage.selectValueFromSubtableForType();
	}

	@Then("^user select \"([^\"]*)\" from the System dialog box$")
	public void user_select_from_the_System_dialog_box(String text) throws Throwable {
		assetsPage.selectValueFromSubtable(text);
	    
	}

	@Then("^user click on magnifying glass icon adjacent to Type text box under EAM New Fields$")
	public void user_click_on_magnifying_glass_icon_adjacent_to_Type_text_box_under_EAM_New_Fields() throws Throwable {
		assetsPage.clickTypeSearch();
	    
	}

	@Then("^user select \"([^\"]*)\" from the Type dialog box$")
	public void user_select_from_the_Type_dialog_box(String text) throws Throwable {
		assetsPage.selectValueFromSubtable(text);
	    
	}

	@Then("^user click on magnifying glass icon adjacent to Equipment Class text box under EAM New Fields$")
	public void user_click_on_magnifying_glass_icon_adjacent_to_Equipment_Class_text_box_under_EAM_New_Fields() throws Throwable {
		assetsPage.clickEquipmentClassSearch();
	    
	}
	
	@Then("^user select \"([^\"]*)\" from the Equipment Class dialog box$")
	public void user_select_from_the_Equipment_Class_dialog_box(String text) throws Throwable {
		assetsPage.selectValueFromSubtable(text);
	    
	}

	@Then("^user click on magnifying glass icon adjacent to Maintained By text box under EAM New Fields$")
	public void user_click_on_magnifying_glass_icon_adjacent_to_Maintained_By_text_box_under_EAM_New_Fields() throws Throwable {
		assetsPage.clickMaintainedBySearch();
	    
	}

	@Then("^user select \"([^\"]*)\" from the Maintained By dialog box$")
	public void user_select_from_the_Maintained_By_dialog_box(String text) throws Throwable {
		assetsPage.selectValueFromSubtable(text);
	    
	}

	@Then("^user click on magnifying glass icon adjacent to Criticality text box under Details$")
	public void user_click_on_magnifying_glass_icon_adjacent_to_Criticality_text_box_under_Details() throws Throwable {
		assetsPage.clickCriticalitySearch();
	    
	}

	@Then("^user select \"([^\"]*)\" from the Criticality dialog box$")
	public void user_select_from_the_Criticality_dialog_box(String num) throws Throwable {
		assetsPage.selectCriticalityValue(num);
	    
	}

	@Then("^user click on Purchase Price text box under Life Cycle$")
	public void user_click_on_Purchase_Price_text_box_under_Life_Cycle() throws Throwable {
		assetsPage.clickPurchasePriceBox();
	    
	}

	@Then("^user enter \"([^\"]*)\" into the Purchase Price dialog box$")
	public void user_enter_into_the_Purchase_Price_dialog_box(String num) throws Throwable {
		assetsPage.enterValuePurchasePriceBox(num);
	    
	}

	@Then("^user click on Replacement Cost text box under Life Cycle$")
	public void user_click_on_Replacement_Cost_text_box_under_Life_Cycle() throws Throwable {
		assetsPage.clickReplacementCostBox();
	    
	}

	@Then("^user enter \"([^\"]*)\" into the Replacement Cost dialog box$")
	public void user_enter_into_the_Replacement_Cost_dialog_box(String num) throws Throwable {
		assetsPage.enterValueReplacementCostBox(num);
	    
	}

	@Then("^user click on Budgeted Cost text box under Life Cycle$")
	public void user_click_on_Budgeted_Cost_text_box_under_Life_Cycle() throws Throwable {
		assetsPage.clickBudgetedCostBox();
	    
	}

	@Then("^user enter \"([^\"]*)\" into the Budgeted Cost dialog box$")
	public void user_enter_into_the_Budgeted_Cost_dialog_box(String num) throws Throwable {
		assetsPage.enterValueBudgetedCostBox(num);
	    
	}

	@Then("^user left mouse click on disk icon for Save Asset within Maximo tool bar$")
	public void user_left_mouse_click_on_disk_icon_for_Save_Asset_within_Maximo_tool_bar() throws Throwable {
		assetsPage.clickSaveAssetBtn();
	    
	}

	@Then("^user verify \"([^\"]*)\" message appears$")
	public void user_verify_message_appears(String msg) throws Throwable {
		assetsPage.verifyFeedbackMsgContains(msg);
	    
	}

	@Then("^user navigate to Common Actions and click on Change Status$")
	public void user_navigate_to_Common_Actions_and_click_on_Change_Status() throws Throwable {
		assetsPage.clickChangeStatusBtn();
	    
	}

	@Then("^user select \"([^\"]*)\" as New Status from Change Status$")
	public void user_select_as_New_Status_from_Change_Status(String text) throws Throwable {
		assetsPage.selectNewStatus(text);
	    
	}

	@Then("^user click OK button in Change Status$")
	public void user_click_OK_button_in_Change_Status() throws Throwable {
		assetsPage.clickChangeStatusOkBtn();
	    
	}

}
