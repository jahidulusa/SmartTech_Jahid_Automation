package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import managers.FileReaderManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.Constants;
import selenium.CustomWait;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.NAME, using = "txtUsername")
	private WebElement userNameField;

	@FindBy(how = How.NAME, using = "txtPassword")
	private WebElement passwordField;

	@FindBy(how = How.XPATH, using = "//*[@id='btnLogin']")
	private WebElement loginBtn;

	@FindBy(how = How.XPATH, using = "//*[@id=\"titlebar_hyperlink_7-lbshowmenu_profile_image\"]")
	private WebElement profileIcon;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Default Information')]")
	private WebElement defaultInfo;

	@FindBy(how = How.XPATH, using = "//*[@id=\"m643105ff-img\"]")
	private WebElement defSiteSearch;

	@FindBy(how = How.XPATH, using = "//*[@id=\"lookup_page2_tfrow_[C:0]_txt-tb\"]")
	private WebElement siteLookup;

	@FindBy(how = How.XPATH, using = "//*[@id=\"lookup_page2_tdrow_[C:0]_ttxt-lb[R:0]\"]")
	private WebElement lookupResultOne;

	@FindBy(how = How.XPATH, using = "//*[@id=\"m46f11050-pb\"]")
	private WebElement okDefBtb;

	@FindBy(how = How.XPATH, using = "//*[@id='titlebar-tb_gotoButton']")
	private WebElement goToMenuBtn;

	@FindBy(how = How.XPATH, using = "//*[@id='menu0_ASSET_MODULE_a_tnode']")
	private WebElement asstesMenu;

	@FindBy(how = How.XPATH, using = "//*[@id='menu0_ASSET_MODULE_sub_changeapp_ASSET_a_tnode']")
	private WebElement asstesSubMenu;

	@FindBy(how = How.XPATH, using = "//*[@id=\"toolactions_INSERT-tbb_image\"]")
	private WebElement newAssetsBtn;

	@FindBy(how = How.XPATH, using = "//*[@id=\"m52ecce-tb\"]")
	private WebElement defSiteBox;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'System Administrator')]")
	private WebElement sysAdminTab;

	@FindBy(how = How.XPATH, using = "//*[@id='QuickInsert_PLUSTASSET']")
	private WebElement qukInNewAsset;

	@FindBy(how = How.XPATH, using = "//*[@id='QuickInsert_PLUSTLOC']")
	private WebElement qukInNewLocation;

	@FindBy(how = How.XPATH, using = "//*[@id='QuickInsert_PLUSTJP']")
	private WebElement qukInNewJobPlan;

	@FindBy(how = How.XPATH, using = "//*[@id='QuickInsert_PLUSTPM']")
	private WebElement qukInNewPM;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu0_PLANS_MODULE_a_tnode']")
	private WebElement planningMenu;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu0_PLANS_MODULE_sub_changeapp_PLUSTJP_a_tnode']")
	private WebElement jobPlanSubMenu;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu0_PM_MODULE_a_tnode']")
	private WebElement pmMenu;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu0_PM_MODULE_sub_changeapp_PLUSTPM_a_tnode']")
	private WebElement pmSubMenu;
	
	@FindBy(how = How.XPATH, using = "//*[@id='welcome']")
	private WebElement welcomeBtn;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Logout')]")
	private WebElement logOutHrm;
	
	
	
	public void LogoutOrangeHrm() {
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		//CustomWait.waitForElementClickable(driver, welcomeBtn);
		welcomeBtn.click();
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		//CustomWait.waitForElementClickable(driver, logOutHrm);
		logOutHrm.click();
		
	}
	
	public void navigateToPmPage() {
		CustomWait.waitForElementClickable(driver, goToMenuBtn);
		goToMenuBtn.click();
		CustomWait.waitForElementClickable(driver, pmMenu);
		pmMenu.click();
		CustomWait.waitForElementClickable(driver, pmSubMenu);
		pmSubMenu.click();
		
	}
	
	public void navigateToJobPlan() {
		CustomWait.waitForElementClickable(driver, goToMenuBtn);
		goToMenuBtn.click();
		CustomWait.waitForElementClickable(driver, planningMenu);
		planningMenu.click();
		CustomWait.waitForElementClickable(driver, jobPlanSubMenu);
		jobPlanSubMenu.click();
		
	}

	public void verifyDefaultSite(String expected) throws Throwable {
		Thread.sleep(4000);
		WebElement SiteValue = driver.findElement(By.xpath("//*[@value='" + expected + "']"));
		Assert.assertEquals(true, SiteValue.isDisplayed());
	}

	public void clickOnNewAssets() {
		newAssetsBtn.click();
	}

	public void clickOnAssetsSubmenu() throws Throwable {
		Actions actions = new Actions(driver);
		actions.moveToElement(asstesMenu).perform();
		asstesSubMenu.click();
		Thread.sleep(10000);
	}

	public void clickGoToButton() {
		goToMenuBtn.click();
	}

	public void clickOnOkButtonDefaultInfo() throws Throwable {
		Thread.sleep(10000);
		okDefBtb.click();
		Thread.sleep(10000);
	}

	public void selectDefaultLocation(String site) throws Throwable {
		Thread.sleep(10000);
		siteLookup.sendKeys(site);
		siteLookup.sendKeys(Keys.ENTER);
		Thread.sleep(10000);
		lookupResultOne.click();
	}

	public void clickOnDefaultSiteSearch() throws Throwable {
		Thread.sleep(10000);
		defSiteSearch.click();
		Thread.sleep(10000);
	}

	public void clickOnDefaultInformation() {
		Actions actions = new Actions(driver);
		actions.moveToElement(defaultInfo).perform();
		defaultInfo.click();
	}

	public void clickOnProfileIcon() {
		profileIcon.click();
	}

	public void enterValidCredential() throws Throwable{
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waitForElementClickable(driver, userNameField);
		userNameField.sendKeys(FileReaderManager.getInstance().getConfigReader().getUserName());
		CustomWait.waitForElementClickable(driver, passwordField);
		passwordField.sendKeys(FileReaderManager.getInstance().getConfigReader().getPassword());

	}

	public void clickSignInButton() {
		CustomWait.waitForElementClickable(driver, loginBtn);
		loginBtn.click();
	}

	public void verifyPageTitle(String expected) throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.titleContains(expected));
		String actual = driver.getTitle();
		Assert.assertTrue("Message doesn't match", actual.contains(expected));

	}

	public void perform_Search(String search) {
		driver.navigate().to(FileReaderManager.getInstance().getConfigReader().getApplicationUrl() + "/?s=" + search
				+ "&post_type=product");
	}

	public void navigateTo_HomePage() {
		CustomWait.waitForPageLoaded(driver);
		String url =System.getProperty("env");
		
		if(url==null || url.isEmpty())
			driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
		else
			driver.get(FileReaderManager.getInstance().getConfigReader().getRuntimeURL(url));
	}

	public void clickSysAdminTab() throws Throwable{
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waitForElementClickable(driver,sysAdminTab);
		sysAdminTab.click();

	}

	public void clickQuickInsertNewAsset() throws Throwable{
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waitForElementClickable(driver,qukInNewAsset);
		qukInNewAsset.click();

	}

	public void clickQuickInsertNewLocation() throws Throwable{
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waitForElementClickable(driver,qukInNewLocation);
		qukInNewLocation.click();

	}

	public void clickQuickInsertNewJobPlan() throws Throwable{
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waitForElementClickable(driver,qukInNewJobPlan);
		qukInNewJobPlan.click();

	}

	public void clickQuickInsertNewPM() throws Throwable{
		CustomWait.waitForElement(qukInNewPM);
		qukInNewPM.click();

	}

}