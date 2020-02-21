package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

import managers.FileReaderManager;
import selenium.Constants;
import selenium.CustomWait;

public class WorkOrderPage {
	WebDriver driver;

	public WorkOrderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='QuickInsert_PLUSTWO']")
	private WebElement qukInNewWorkOrder;

	@FindBy(how = How.XPATH, using = "//*[@id='mad3161b5-tb2']")
	private WebElement workOrderDescriptionField;

	@FindBy(how = How.XPATH, using = "//*[@id='m3b6a207f-img']")
	private WebElement assetsDetailMenu;

	@FindBy(how = How.XPATH, using = "//*[@id='PLUSTASSETMAINEXT1_plustassetmainext_1_a_tnode']")
	private WebElement assetsSelectValue;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tfrow_[C:0]_txt-tb']")
	private WebElement assetsSelValSearch;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tdrow_[C:0]_ttxt-lb[R:0]']")
	private WebElement assetsSubTableResultOne;

	@FindBy(how = How.XPATH, using = "//*[@id='me2096203-img']")
	private WebElement workTypeSearch;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tfrow_[C:0]_txt-tb']")
	private WebElement workTypeSubSearch;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tdrow_[C:0]_ttxt-lb[R:0]']")
	private WebElement workTypeResultOne;

	@FindBy(how = How.XPATH, using = "//*[@id='m8b12679c-img']")
	private WebElement startDateIcon;

	@FindBy(how = How.XPATH, using = "//*[@id='m8b12679c-tb_popup_date']/thead/tr[1]/th[3]/span[1]")
	private WebElement selectNextMonth;

	@FindBy(how = How.XPATH, using = "//*[@id='m8b12679c-tb_popup_date']/tbody/tr[3]/td[4]/span")
	private WebElement selectDay;

	@FindBy(how = How.XPATH, using = "//*[@id='m8b12679c-tb_popup']/tbody/tr[2]/td/button[1]")
	private WebElement selectDateOkBtn;

	@FindBy(how = How.XPATH, using = "//*[@id='m651c06b0-tb_popup_date']/thead/tr[1]/th[3]/span[1]")
	private WebElement selectTargetNextMonth;

	@FindBy(how = How.XPATH, using = "//*[@id='m651c06b0-tb_popup_date']/tbody/tr[4]/td[7]/span")
	private WebElement selectTargetDay;

	@FindBy(how = How.XPATH, using = "//*[@id='m651c06b0-tb_popup']/tbody/tr[2]/td/button[1]")
	private WebElement selectTargetDateOkBtn;

	@FindBy(how = How.XPATH, using = "//*[@id='m651c06b0-img']")
	private WebElement targetStartDateIcon;

	@FindBy(how = How.XPATH, using = "//*[@id='m543a1167-img']")
	private WebElement enhancedPrioritySearch;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tfrow_[C:0]_txt-tb']")
	private WebElement subEnhanPriorSearch;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tdrow_[C:0]_ttxt-lb[R:0]']")
	private WebElement subEnhanPriorResultOne;

	@FindBy(how = How.XPATH, using = "//*[@id='m5439a5d0-img']")
	private WebElement maintenanceTypeSearch;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tfrow_[C:0]_txt-tb']")
	private WebElement subMaintenanceTypeSearch;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tdrow_[C:0]_ttxt-lb[R:0]']")
	private WebElement subMaintenanceResultOne;

	@FindBy(how = How.XPATH, using = "//*[@id='m186b64bd-img']")
	private WebElement shiftWorkIsPerformedSearch;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tfrow_[C:0]_txt-tb']")
	private WebElement subShiftWorkIsPerformedSearch;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tdrow_[C:0]_ttxt-lb[R:0]']")
	private WebElement subShiftWorkIsPerformedResultOne;

	@FindBy(how = How.XPATH, using = "//*[@id='m291d536f-img']")
	private WebElement orgUnitSearch;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tfrow_[C:0]_txt-tb']")
	private WebElement subOrgUnitSearch;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tdrow_[C:0]_ttxt-lb[R:0]']")
	private WebElement subOrgUnitResultOne;

	@FindBy(how = How.XPATH, using = "//*[@id='m894e2206-img']")
	private WebElement glAccountSearch;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tdrow_[C:0]_ttxt-lb[R:0]']")
	private WebElement glAccountValue;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Operating')]/../preceding-sibling::td/span")
	private WebElement glComponentValue;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tdrow_[C:0]_ttxt-lb[R:1]']")
	private WebElement glComponentDescription;

	@FindBy(how = How.XPATH, using = "//*[@id='mc0fd1072-pb']")
	private WebElement glAccountOkBtn;

	@FindBy(how = How.XPATH, using = "//*[@id='m78b98bae-img']")
	private WebElement wbsElementSearch;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tfrow_[C:0]_txt-tb']")
	private WebElement subWBSElementSearch;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tdrow_[C:0]_ttxt-lb[R:0]']")
	private WebElement subWBSElementResultOne;

	@FindBy(how = How.XPATH, using = "//*[@id='toolactions_SAVE-tbb_image']")
	private WebElement saveWorkOrder;

	@FindBy(how = How.XPATH, using = "//*[@id='m3b6a207f-img']")
	private WebElement assetDetailMenu;

	@FindBy(how = How.XPATH, using = "//*[@id='PLUSTASSETMAINEXT1_plustassetmainext_1_a_tnode']")
	private WebElement assetSelectValue;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tfrow_[C:0]_txt-tb']")
	private WebElement assetSelValSearch;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tdrow_[C:0]_ttxt-lb[R:0]']")
	private WebElement subTableAssetResultOne;
	
	@FindBy(how = How.XPATH, using = "//*[@id='lookup_pa_plustasset_recentrepair-lb']")
	private WebElement assetTable;

	@FindBy(how = How.XPATH, using = "//*[@id='m1cc7da76-tb']")
	private WebElement costCenterValue;

	@FindBy(how = How.XPATH, using = "//*[@id='mfbe0298f-img']")
	private WebElement internalOrderSearch;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tdrow_[C:0]_ttxt-lb[R:0]']")
	private WebElement internalOrderOne;
	
	@FindBy(how = How.XPATH, using = "//*[@id='m1cc7da76-img']")
	private WebElement costCenterSearch;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tdrow_[C:0]_ttxt-lb[R:0]']")
	private WebElement costCenterOne;
	
	public void enterValueForCostCenter() throws Throwable{
		CustomWait.waitForElementClickable(driver, costCenterSearch);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		costCenterSearch.click();
		CustomWait.waitForElementClickable(driver, costCenterOne);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		costCenterOne.click();
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		
	}

	public void enterValueForInternalOrder() throws Throwable {
		CustomWait.waitForElementClickable(driver, internalOrderSearch);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		internalOrderSearch.click();
		CustomWait.waitForElementClickable(driver, internalOrderOne);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		internalOrderOne.click();
		CustomWait.waiting(Constants.VERYSHORTWAIT);

	}

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
		CustomWait.waiting(Constants.LONGWAIT);	
		subTableAssetResultOne.click();
		CustomWait.waiting(Constants.MEDIUMWAIT);

	}

	public void clickQuickInsertNewWorkOrder() throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waitForElementClickable(driver,qukInNewWorkOrder);
		qukInNewWorkOrder.click();

	}

	public void enterWorkOrderDescription(String text) throws Throwable {
		CustomWait.waitForElement(workOrderDescriptionField);
		CustomWait.sendChar(workOrderDescriptionField, text);

	}

	public void enterAssetForWorkOrder(String text) throws Throwable {
		assetsDetailMenu.click();
		assetsSelectValue.click();
		assetsSelValSearch.sendKeys(text);
		assetsSelValSearch.sendKeys(Keys.ENTER);
		CustomWait.waiting(Constants.SHORTWAIT);
		assetsSubTableResultOne.click();

	}

	public void clickWorkTypeSearch() throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.SHORTWAIT);
		workTypeSearch.click();

	}

	public void selectValueFromWorkTypeSubTable(String text) throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waitForElement(workTypeSubSearch);
		workTypeSubSearch.sendKeys(text);
		workTypeSubSearch.sendKeys(Keys.ENTER);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		workTypeResultOne.click();

	}

	public void selectDateScheduleStart() throws Throwable {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,10000)");

		CustomWait.waitForElementClickable(driver, startDateIcon);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		startDateIcon.click();
		CustomWait.waitForElementClickable(driver, selectNextMonth);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		selectNextMonth.click();
		CustomWait.waitForElementClickable(driver, selectDay);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		selectDay.click();
		CustomWait.waitForElementClickable(driver, selectDateOkBtn);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		selectDateOkBtn.click();
		CustomWait.waiting(Constants.VERYSHORTWAIT);

	}

	public void selectTargetStartDate() throws Throwable {

		CustomWait.waitForElementClickable(driver, targetStartDateIcon);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		targetStartDateIcon.click();
		CustomWait.waitForElementClickable(driver, selectTargetNextMonth);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		selectTargetNextMonth.click();
		CustomWait.waitForElementClickable(driver, selectTargetDay);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		selectTargetDay.click();
		CustomWait.waitForElementClickable(driver, selectTargetDateOkBtn);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		selectTargetDateOkBtn.click();
		CustomWait.waiting(Constants.VERYSHORTWAIT);

	}

	public void clickEnhancedPrioritySearch() throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		enhancedPrioritySearch.click();

	}

	public void selectEnhancedPriorityValue(String text) throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waitForElement(subEnhanPriorSearch);
		subEnhanPriorSearch.sendKeys(text);
		subEnhanPriorSearch.sendKeys(Keys.ENTER);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		subEnhanPriorResultOne.click();
		CustomWait.waiting(Constants.VERYSHORTWAIT);

	}

	public void clickMaintenanceTypeSearch() throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		maintenanceTypeSearch.click();

	}

	public void selectValueFromMaintenanceTypeSubTable(String text) throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waitForElement(subMaintenanceTypeSearch);
		subMaintenanceTypeSearch.sendKeys(text);
		subMaintenanceTypeSearch.sendKeys(Keys.ENTER);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		subMaintenanceResultOne.click();

	}

	public void clickShiftWorkIsPerformedSearch() throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		shiftWorkIsPerformedSearch.click();

	}

	public void selectValueFromShiftWorkIsPerformedSubTable(String text) throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waitForElement(subShiftWorkIsPerformedSearch);
		subShiftWorkIsPerformedSearch.sendKeys(text);
		subShiftWorkIsPerformedSearch.sendKeys(Keys.ENTER);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		subShiftWorkIsPerformedResultOne.click();

	}

	public void clickOrgUnitSearch() throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		orgUnitSearch.click();

	}

	public void selectValueFromOrgUnitSubTable(String text) throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waitForElement(subOrgUnitSearch);
		subOrgUnitSearch.sendKeys(text);
		subOrgUnitSearch.sendKeys(Keys.ENTER);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		subOrgUnitResultOne.click();

	}

	public void clickGLAccountSearch() throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		glAccountSearch.click();

	}

	public void selectGLAccountValue() throws Throwable {
		CustomWait.waiting(Constants.SHORTWAIT);
		glAccountValue.click();
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		glComponentValue.click();
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		glComponentDescription.click();
		CustomWait.waiting(Constants.SHORTWAIT);
		glAccountOkBtn.click();
		CustomWait.waiting(Constants.SHORTWAIT);

	}

	public void clickWBSElementSearch() throws Throwable {
		CustomWait.waiting(Constants.SHORTWAIT);
		wbsElementSearch.click();

	}

	public void selectValueFromWBSElementSubTable(String text) throws Throwable {
		CustomWait.waiting(Constants.SHORTWAIT);
		subWBSElementSearch.sendKeys(text);
		subWBSElementSearch.sendKeys(Keys.ENTER);
		CustomWait.waiting(Constants.SHORTWAIT);
		subWBSElementResultOne.click();
		CustomWait.waiting(Constants.SHORTWAIT);
	}

	public void clickSaveWorkOrder() throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		saveWorkOrder.click();

	}

	public void enterValueForCostCenter(String text) throws Throwable {
		CustomWait.waiting(Constants.SHORTWAIT);
		costCenterValue.sendKeys(text);
		costCenterValue.sendKeys(Keys.ENTER);
	}

	

}
