package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.RoutesPage;

public class RoutesPageSteps {
	TestContext testContext;
	RoutesPage routesPage;
	
	public RoutesPageSteps(TestContext context) {
		testContext = context;
		routesPage = testContext.getPageObjectManager().getRoutesPage();
	}
	
	@When("^user navigate to Go to icon and click on Routes from Planning$")
	public void user_navigate_to_Go_to_icon_and_click_on_Routes_from_Planning() throws Throwable {
	    routesPage.navigateToRoutes();
	    
	}

	@When("^user click on New Route from application tool bar$")
	public void user_click_on_New_Route_from_application_tool_bar() throws Throwable {
		routesPage.clickOnNewRoutes();
	    
	}

	@When("^user type and capture a New Route name as \"([^\"]*)\" into Route field$")
	public void user_type_and_capture_a_New_Route_name_as_into_Route_field(String rtName) throws Throwable {
	    routesPage.enterNewRouteInRouteField(rtName);
	    
	}

	@When("^user enter \"([^\"]*)\" into the Route description field$")
	public void user_enter_into_the_Route_description_field(String text) throws Throwable {
	    routesPage.enterRouteDescription(text);
	    
	}

	@When("^user select Entries in the Work Orders Multi Asset Location and CI Table under Route is applied$")
	public void user_select_Entries_in_the_Work_Orders_Multi_Asset_Location_and_CI_Table_under_Route_is_applied() throws Throwable {
	    routesPage.clickMultiAsset();
	    
	}

	@Then("^user navigate to Route Stops section and click on New Row button$")
	public void user_navigate_to_Route_Stops_section_and_click_on_New_Row_button() throws Throwable {
		routesPage.clickNewRowForRoutes();
	    
	}

	@Then("^user enter \"([^\"]*)\" in Details Description field$")
	public void user_enter_in_Details_Description_field(String text) throws Throwable {
		routesPage.enterRouteDetailsDescription(text);
	    
	}

	@Then("^user enter \"([^\"]*)\" in Details Sequence field$")
	public void user_enter_in_Details_Sequence_field(String text) throws Throwable {
		routesPage.enterRouteDetailsSequence(text);
	    
	}

	@Then("^user select \"([^\"]*)\" captured location for the Location field$")
	public void user_select_captured_location_for_the_Location_field(String LocName) throws Throwable {
	    routesPage.selectLocation(LocName);
	    
	}

	@Then("^user select \"([^\"]*)\" captured Asset for the Asset field$")
	public void user_select_captured_Asset_for_the_Asset_field(String asName) throws Throwable {
	    routesPage.selectAsset(asName);
	    
	}

	@Then("^user left mouse click on disk icon for Save Route within Maximo tool bar$")
	public void user_left_mouse_click_on_disk_icon_for_Save_Route_within_Maximo_tool_bar() throws Throwable {
	    routesPage.clickSaveRoutesBtn();
	    
	}

}
