package pageObjects;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import managers.FileReaderManager;
import selenium.Constants;
import selenium.CustomWait;

public class AssetsPage {
	WebDriver driver;
	public Logger log = Logger.getLogger("AssetsPage");

	public AssetsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='m73f28d7-tb2']")
	private WebElement descriptionField;

	@FindBy(how = How.XPATH, using = "//*[@id='m7b0033b9-img']")
	private WebElement detailMenu;

	@FindBy(how = How.XPATH, using = "//*[@id='PLUSTLOCATIONS_plustlocations0_a_tnode']")
	private WebElement locationSelectValue;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tfrow_[C:0]_txt-tb']")
	private WebElement locationSelValSearch;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tdrow_[C:0]_ttxt-lb[R:0]']")
	private WebElement subTableResultOne;

	@FindBy(how = How.XPATH, using = "//*[@id='mf3caf826-img']")
	private WebElement subSystemSearch;
	
	@FindBy(how = How.XPATH, using = "//*[@id='m84991dd0-img']")
	private WebElement assetTypeSearch;
	
	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tdrow_[C:1]_ttxt-lb[R:0]']")
	private WebElement firstAssetType;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tfrow_[C:0]_txt-tb']")
	private WebElement subSysValSearch;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tdrow_[C:0]_ttxt-lb[R:0]']")
	private WebElement subSysResultOne;

	@FindBy(how = How.XPATH, using = "//*[@id='md4f4808f-img']")
	private WebElement systemSearch;

	@FindBy(how = How.XPATH, using = "//*[@id='m87f89dd0-img']")
	private WebElement typeSearch;

	@FindBy(how = How.XPATH, using = "//*[@id='m7180a6c4-img']")
	private WebElement equipmentClassSearch;

	@FindBy(how = How.XPATH, using = "//*[@id='m161d6267-img']")
	private WebElement maintainedBySearch;

	@FindBy(how = How.XPATH, using = "//*[@id='m4b00d4f0-img']")
	private WebElement criticalitySearch;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tfrow_[C:0]_txt-tb']")
	private WebElement criticalitySubSearch;

	@FindBy(how = How.XPATH, using = "//*[@id='mef9ee7d5-tb']")
	private WebElement purchasePriceBox;

	@FindBy(how = How.XPATH, using = "//*[@id='m7f21fa44-tb']")
	private WebElement replacementCostBox;

	@FindBy(how = How.XPATH, using = "//*[@id='mc78b78c0-tb']")
	private WebElement budgetedCostBox;

	@FindBy(how = How.XPATH, using = "//*[@id='toolactions_SAVE-tbb_image']")
	private WebElement saveAssetBtn;

	@FindBy(how = How.XPATH, using = "//*[@id='toolactions_STATUS-tbb_image']")
	private WebElement changeStatusBtn;

	@FindBy(how = How.XPATH, using = "//*[@id='mc927149a-img']")
	private WebElement selectNewStatusBox;

	@FindBy(how = How.XPATH, using = "//*[@id='m60bd6d91-pb']")
	private WebElement changeStatusOkBtn;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Record has been saved')]")
	private WebElement titleBarMsg;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Operating')]")
	private WebElement statusOperating;

	@FindBy(how = How.XPATH, using = "//*[@id=\"m73f28d7-tb\"]")
	private WebElement capAsset;

	@FindBy(how = How.XPATH, using = "//*[@id='titlebar_error']")
	private WebElement msgPanel;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'AUTOMOTIVE MOTOR VEHICLES')]")
	private WebElement subSysAuto;

	public void clickChangeStatusOkBtn() throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		changeStatusOkBtn.click();

	}

	public void selectNewStatus(String status) throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waitForElementClickable(driver, selectNewStatusBox);
		selectNewStatusBox.click();
		CustomWait.waitForElementClickable(driver, statusOperating);
		statusOperating.click();

	}

	public void verifyFeedbackMsgContains(String message) throws Throwable {
		CustomWait.waiting(Constants.NORMALWAIT);
		if (driver.getPageSource().contains(message)) {
			log.info(message + " text is present");
		} else {
			log.info(message + " text is absent");
		}

	}

	public void clickChangeStatusBtn() throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waitForElement(changeStatusBtn);
		changeStatusBtn.click();
		CustomWait.waiting(Constants.MEDIUMWAIT);

	}

	public void clickSaveAssetBtn() throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waitForElementClickable(driver, saveAssetBtn);
		saveAssetBtn.click();

	}

	public void clickBudgetedCostBox() throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		budgetedCostBox.click();

	}

	public void enterValueBudgetedCostBox(String num) throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		budgetedCostBox.sendKeys(num);

	}

	public void clickReplacementCostBox() throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		replacementCostBox.click();

	}

	public void enterValueReplacementCostBox(String num) throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		replacementCostBox.sendKeys(num);

	}

	public void clickPurchasePriceBox() throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		purchasePriceBox.click();

	}

	public void enterValuePurchasePriceBox(String num) throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		purchasePriceBox.sendKeys(num);

	}

	public void clickCriticalitySearch() throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		criticalitySearch.click();

	}

	public void clickMaintainedBySearch() throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		maintainedBySearch.click();

	}

	public void clickEquipmentClassSearch() throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		equipmentClassSearch.click();

	}

	public void clickTypeSearch() throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		typeSearch.click();

	}

	public void clickSystemSearch() throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		systemSearch.click();

	}

	public void selectValueFromSubtableForType() throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.MEDIUMWAIT);
		CustomWait.waitForElement(criticalitySubSearch);
		subTableResultOne.click();

	}
	
	public void selectValueFromSubtable(String text) throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.MEDIUMWAIT);
		CustomWait.waitForElement(criticalitySubSearch);
		CustomWait.sendChar(criticalitySubSearch, text);
		criticalitySubSearch.sendKeys(Keys.ENTER);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		subTableResultOne.click();

	}

	public void selectAutoFromSubtable(String text) throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.MEDIUMWAIT);
		subSysAuto.click();

	}

	public void selectCriticalityValue(String text) throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waitForElement(subSysValSearch);
		subSysValSearch.sendKeys(text);
		subSysValSearch.sendKeys(Keys.ENTER);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		subTableResultOne.click();

	}

	public void clickSubSystemSearch() throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		subSystemSearch.click();

	}
	
	public void clickAssetTypeSearch() throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		assetTypeSearch.click();

	}
	
	public void selectFirstAssetTypeFromChoice() throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		firstAssetType.click();

	}

	public void selectLocation(String LocName) throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		String locValue = FileReaderManager.getInstance().getConfigReader().getTarget(LocName);
		CustomWait.waitForElementVisible(driver, detailMenu);
		detailMenu.click();
		CustomWait.waitForElementVisible(driver, locationSelectValue);
		locationSelectValue.click();
		CustomWait.waitForElementVisible(driver, locationSelValSearch);
		locationSelValSearch.sendKeys(locValue);
		locationSelValSearch.sendKeys(Keys.ENTER);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		subTableResultOne.click();

	}

	public void enterDescription(String text) throws Throwable {
		CustomWait.waitForElement(descriptionField);
		CustomWait.sendChar(descriptionField, text);

	}

	public void captureAssetsValue(String assetName) throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		String assetValue = capAsset.getAttribute("originalvalue").trim();
		System.out.println("Assets captured:: " + assetValue);
		FileReaderManager.getInstance().getConfigReader().setTarget(assetName, assetValue);
	}

}
