package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import managers.FileReaderManager;
import selenium.Constants;
import selenium.CustomWait;

public class RoutesPage {
	WebDriver driver;

	public RoutesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='titlebar-tb_gotoButton']")
	private WebElement goToBtn;

	@FindBy(how = How.XPATH, using = "//*[@id='menu0_PLANS_MODULE_a_tnode']")
	private WebElement planningBtn;

	@FindBy(how = How.XPATH, using = "//*[@id='menu0_PLANS_MODULE_sub_changeapp_ROUTES_a_tnode']")
	private WebElement routesBtn;

	@FindBy(how = How.XPATH, using = "//*[@id='toolactions_INSERT-tbb_image']")
	private WebElement newRoutes;

	@FindBy(how = How.XPATH, using = "//*[@id='mf1565c60-tb2']")
	private WebElement routeDescriptionField;

	@FindBy(how = How.XPATH, using = "//*[@id='mf1565c60-tb']")
	private WebElement routeField;

	@FindBy(how = How.XPATH, using = "//*[@id='m90a2263b-rb']")
	private WebElement multiAsset;

	@FindBy(how = How.XPATH, using = "//*[@id='mc92b4a1_bg_button_addrow-pb']")
	private WebElement newRowRoutes;

	@FindBy(how = How.XPATH, using = "//*[@id='m80cc0eea-tb']")
	private WebElement routesDetailsDes;

	@FindBy(how = How.XPATH, using = "//*[@id='md60e1ca4-tb']")
	private WebElement routesDetailsSeq;

	@FindBy(how = How.XPATH, using = "//*[@id='m6ec26fc6-img']")
	private WebElement detailMenu;

	@FindBy(how = How.XPATH, using = "//*[@id='LOCATIONS_locations0_a_tnode']")
	private WebElement locationSelectValue;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tfrow_[C:0]_txt-tb']")
	private WebElement locationSelValSearch;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tdrow_[C:0]_ttxt-lb[R:0]']")
	private WebElement subTableResultOne;

	@FindBy(how = How.XPATH, using = "//*[@id='m87a1caf3-img']")
	private WebElement assetDetailMenu;

	@FindBy(how = How.XPATH, using = "//*[@id='ASSETMAIN_assetmain0_a_tnode']")
	private WebElement assetSelectValue;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tfrow_[C:0]_txt-tb']")
	private WebElement assetSelValSearch;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tdrow_[C:0]_ttxt-lb[R:0]']")
	private WebElement subTableAssetResultOne;

	@FindBy(how = How.XPATH, using = "//*[@id='toolactions_SAVE-tbb_image']")
	private WebElement saveRoutes;

	public void selectAsset(String asName) throws Throwable {
		
		String asValue = FileReaderManager.getInstance().getConfigReader().getTarget(asName);
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		assetDetailMenu.click();
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waitForElementVisible(driver, assetSelectValue);
		assetSelectValue.click();
		CustomWait.waitForElementVisible(driver, assetSelValSearch);
		CustomWait.sendChar(assetSelValSearch, asValue);
		assetSelValSearch.sendKeys(Keys.ENTER);
		CustomWait.waiting(Constants.MEDIUMWAIT);
		CustomWait.waitForElement(subTableAssetResultOne);
		subTableAssetResultOne.click();
		CustomWait.waiting(Constants.MEDIUMWAIT);

	}

	public void selectLocation(String LocName) throws Throwable {
		
		String locValue = FileReaderManager.getInstance().getConfigReader().getTarget(LocName);
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		detailMenu.click();
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waitForElementVisible(driver, locationSelectValue);
		locationSelectValue.click();
		CustomWait.waitForElementVisible(driver, locationSelValSearch);
		CustomWait.sendChar(locationSelValSearch, locValue);
		locationSelValSearch.sendKeys(Keys.ENTER);
		CustomWait.waiting(Constants.SHORTWAIT);
		CustomWait.waitForElement(subTableResultOne);
		subTableResultOne.click();
		CustomWait.waiting(Constants.SHORTWAIT);

	}

	public void clickMultiAsset() throws Throwable {
		CustomWait.waiting(Constants.SHORTWAIT);
		multiAsset.click();

	}

	public void enterRouteDescription(String text) throws Throwable {
		CustomWait.waiting(Constants.SHORTWAIT);
		routeDescriptionField.sendKeys(text);
		CustomWait.waiting(Constants.VERYSHORTWAIT);

	}

	public void enterNewRouteInRouteField(String rtName)throws Throwable {
		String rtValue = "R-" + FileReaderManager.getInstance().getUtilitiesManager().getAlphaNumericString(7);
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		CustomWait.sendChar(routeField, rtValue);
		System.out.println("Route captured:: " + rtValue);
		FileReaderManager.getInstance().getConfigReader().setTarget(rtName, rtValue);

	}

	public void clickOnNewRoutes() throws Throwable {
		CustomWait.waiting(Constants.SHORTWAIT);
		newRoutes.click();

	}

	public void navigateToRoutes() throws Throwable {
		CustomWait.waiting(Constants.SHORTWAIT);
		goToBtn.click();
		CustomWait.waiting(Constants.SHORTWAIT);
		planningBtn.click();
		CustomWait.waiting(Constants.SHORTWAIT);
		routesBtn.click();

	}

	public void clickNewRowForRoutes() throws Throwable {
		CustomWait.waiting(Constants.SHORTWAIT);
		newRowRoutes.click();

	}

	public void enterRouteDetailsDescription(String text) throws Throwable {
		CustomWait.waiting(Constants.SHORTWAIT);
		routesDetailsDes.sendKeys(text);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
	}

	public void enterRouteDetailsSequence(String text) throws Throwable {
		CustomWait.waiting(Constants.SHORTWAIT);
		routesDetailsSeq.sendKeys(text);
		CustomWait.waiting(Constants.VERYSHORTWAIT);

	}

	public void clickSaveRoutesBtn() throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.MEDIUMWAIT);
		saveRoutes.click();

	}

}
