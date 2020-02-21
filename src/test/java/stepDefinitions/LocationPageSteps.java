package stepDefinitions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LocationPage;

public class LocationPageSteps {
	TestContext testContext;
	LocationPage locationPage;

	public LocationPageSteps(TestContext context) {
		testContext = context;
		locationPage = testContext.getPageObjectManager().getLocationPage();
	}

	@When("^user type and capture a New location name as \"([^\"]*)\" into location field$")
	public void user_type_and_capture_a_New_location_name_as_into_location_field(String locName) throws Throwable {
		locationPage.enterNewLocationInLocField(locName);
	}

	@When("^user enter \"([^\"]*)\" into the Location description field$")
	public void user_enter_into_the_Location_description_field(String text) throws Throwable {
		locationPage.enterLocationDescription(text);
	}

	@When("^user click on magnifying glass icon adjacent to Type text box under Location Field$")
	public void user_click_on_magnifying_glass_icon_adjacent_to_Type_text_box_under_Location_Field() throws Throwable {
		locationPage.clickLocationTypeSearch();
	}

	@Then("^user select \"([^\"]*)\" from the Type dialog box for Location$")
	public void user_select_from_the_Type_dialog_box_for_Location(String text) throws Throwable {
		locationPage.selectLocationType(text);
	}

	@Then("^user click on magnifying glass icon adjacent to GL Account for this location$")
	public void user_click_on_magnifying_glass_icon_adjacent_to_GL_Account_for_this_location() throws Throwable {
		locationPage.clickGLAccountSearch();

	}

	@Then("^user select a valid GL Account for this location$")
	public void user_select_a_valid_GL_Account_for_this_location() throws Throwable {
		locationPage.selectGLAccountValue();

	}

	@Then("^user enter valid cost center for this location$")
	public void user_enter_valid_cost_center_for_this_location() throws Throwable {
		locationPage.enterValueForCostCenter();

	}

	@Then("^user enter valid Internal Order for this location$")
	public void user_enter_valid_Internal_Order_for_this_location() throws Throwable {
		locationPage.enterValueForInternalOrder();

	}

	@Then("^user click on magnifying glass icon adjacent to Maintained By text box under EAM New Fields for Location$")
	public void user_click_on_magnifying_glass_icon_adjacent_to_Maintained_By_text_box_under_EAM_New_Fields_for_Location()
			throws Throwable {
		locationPage.clickLocationMaintainSearch();
	}

	@Then("^user select \"([^\"]*)\" from the Maintained By dialog box for Location$")
	public void user_select_from_the_Maintained_By_dialog_box_for_Location(String text) throws Throwable {
		locationPage.selectMaintainByLoc(text);
	}

	@Then("^user left mouse click on disk icon for Save Location within Maximo tool bar$")
	public void user_left_mouse_click_on_disk_icon_for_Save_Location_within_Maximo_tool_bar() throws Throwable {
		locationPage.clickSaveLocation();
	}

	@Then("^user verify Record has been saved message appears for location page$")
	public void user_verify_Record_has_been_saved_message_appears_for_location_page() throws Throwable {
		locationPage.verifyLocationSavedFeedbackMsg();
	}

}
