package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;
import selenium.CustomWait;

public class HomePageSteps {

	TestContext testContext;
	HomePage homePage;

	public HomePageSteps(TestContext context) {
		testContext = context;
		homePage = testContext.getPageObjectManager().getHomePage();
	}

	@Given("^user is on Home Page$")
	public void user_is_on_Home_Page() {
		homePage.navigateTo_HomePage();
	}

	@When("^he search for \"([^\"]*)\"$")
	public void he_search_for(String product) {
		homePage.perform_Search(product);
	}

	@Given("^user open web browser and navigate to Maximo login screen$")
	public void user_open_web_browser_and_navigate_to_Maximo_login_screen() throws Throwable {
		homePage.navigateTo_HomePage();
	}

	@Then("^user Navigate to Page and verify the Page Title is \"([^\"]*)\"$")
	public void user_Navigate_to_Page_and_verify_the_Page_Title_is(String title) throws Throwable {
		homePage.verifyPageTitle(title);
	}

	@Then("^user enter a valid username and password$")
	public void user_enter_a_valid_username_and_password() throws Throwable {
		homePage.enterValidCredential();
		
	}

	@Then("^user click the Sign in button$")
	public void user_click_the_Sign_in_button() throws Throwable {
		homePage.clickSignInButton();
	}

	@When("^user click on the profile icon$")
	public void user_click_on_the_profile_icon() throws Throwable {
		homePage.clickOnProfileIcon();
	}

	@When("^user mouse hover and click on Default Information$")
	public void user_mouse_hover_and_click_on_Default_Information() throws Throwable {
		homePage.clickOnDefaultInformation();

	}

	@When("^user click on magnifying glass icon adjacent to Default Insert Site under Default Information$")
	public void user_click_on_magnifying_glass_icon_adjacent_to_Default_Insert_Site_under_Default_Information()
			throws Throwable {
		homePage.clickOnDefaultSiteSearch();
	}

	@Then("^user click OK button in Default Information$")
	public void user_click_OK_button_in_Default_Information() throws Throwable {
		homePage.clickOnOkButtonDefaultInfo();

	}

	@When("^user click on the Go To menu button$")
	public void user_click_on_the_Go_To_menu_button() throws Throwable {
		homePage.clickGoToButton();

	}

	@When("^user mouse hover on Assets then click on Assets from submenu$")
	public void user_mouse_hover_on_Assets_then_click_on_Assets_from_submenu() throws Throwable {
		homePage.clickOnAssetsSubmenu();

	}

	@Then("^user navigate to Common Actions and click on New Asset$")
	public void user_navigate_to_Common_Actions_and_click_on_New_Asset() throws Throwable {
		homePage.clickOnNewAssets();

	}

	@Then("^user verify the default site as \"([^\"]*)\"$")
	public void user_verify_the_default_site_as(String site) throws Throwable {
		homePage.verifyDefaultSite(site);

	}

	@When("^user click on Systems Administrator$")
	public void user_click_on_Systems_Administrator() throws Throwable {
		homePage.clickSysAdminTab();

	}

	@When("^user click on New Asset from Quick Insert menu$")
	public void user_click_on_New_Asset_from_Quick_Insert_menu() throws Throwable {
		homePage.clickQuickInsertNewAsset();

	}

	@When("^user click on New Location from Quick Insert menu$")
	public void user_click_on_New_Location_from_Quick_Insert_menu() throws Throwable {
		homePage.clickQuickInsertNewLocation();
	}

	@When("^user click on New Job Plan from Quick Insert menu$")
	public void user_click_on_New_Job_Plan_from_Quick_Insert_menu() throws Throwable {
		homePage.clickQuickInsertNewJobPlan();
	}

	@When("^user click on New PM from Quick Insert menu$")
	public void user_click_on_New_PM_from_Quick_Insert_menu() throws Throwable {
		homePage.clickQuickInsertNewPM();
	}
	
	@Then("^user navigates to Job Plan page from go to button$")
	public void user_navigates_to_Job_Plan_page_from_go_to_button() throws Throwable {
	    homePage.navigateToJobPlan();
	}
	
	@Then("^user navigates to Preventive Maintenance page from go to button$")
	public void user_navigates_to_Preventive_Maintenance_page_from_go_to_button() throws Throwable {
	    homePage.navigateToPmPage();
	    
	}
	
	@Given("^user open web browser and navigate to HRM login screen$")
	public void user_open_web_browser_and_navigate_to_HRM_login_screen() throws Throwable {
		homePage.navigateTo_HomePage();
	}

	@When("^user click on log out button for Orange Hrm$")
	public void user_click_on_log_out_button_for_Orange_Hrm() throws Throwable {
	    homePage.LogoutOrangeHrm();
	}

}
