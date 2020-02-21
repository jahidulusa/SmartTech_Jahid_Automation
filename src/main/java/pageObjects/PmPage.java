package pageObjects;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import managers.FileReaderManager;
import selenium.Constants;
import selenium.CustomWait;

public class PmPage {
	WebDriver driver;

	public PmPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='maa8ad01-tb2']")
	private WebElement pmDescriptionField;

	@FindBy(how = How.XPATH, using = "//*[@id='m5439a5d0-img']")
	private WebElement pmMaintenanceTypeSearch;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tfrow_[C:0]_txt-tb']")
	private WebElement maintenanceTypeSubSearch;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tdrow_[C:0]_ttxt-lb[R:0]']")
	private WebElement maintenanceTypeResultOne;

	@FindBy(how = How.XPATH, using = "//*[@id='m59b2652c-img']")
	private WebElement shiftWorkSearch;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tfrow_[C:0]_txt-tb']")
	private WebElement shiftWorkSubSearch;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tdrow_[C:0]_ttxt-lb[R:0]']")
	private WebElement shiftWorkResultOne;

	@FindBy(how = How.XPATH, using = "//*[@id='m93a8b8d-tb']")
	private WebElement startYearBox;

	@FindBy(how = How.XPATH, using = "//*[@id='mcfafafff-img']")
	private WebElement secSubSecSearch;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tfrow_[C:0]_txt-tb']")
	private WebElement secSubSecSubSearch;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tdrow_[C:0]_ttxt-lb[R:0]']")
	private WebElement secSubSecResultOne;

	@FindBy(how = How.XPATH, using = "//*[@id='m2d3bd153-tb']")
	private WebElement pmDurationBox;

	@FindBy(how = How.XPATH, using = "//*[@id='m6f3f99b7-tb']")
	private WebElement assetBox;

	@FindBy(how = How.XPATH, using = "//*[@id='m97f7d5e0-tb']")
	private WebElement leadTimeDays;

	@FindBy(how = How.XPATH, using = "//*[@id='m25f1729f-img']")
	private WebElement jobPrioritySearch;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tfrow_[C:0]_txt-tb']")
	private WebElement jobPrioritySubSearch;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tdrow_[C:0]_ttxt-lb[R:0]']")
	private WebElement jobPriorityResultOne;

	@FindBy(how = How.XPATH, using = "//*[@id='mfdf7abab-tb']")
	private WebElement extraValueWorkOrder;

	@FindBy(how = How.XPATH, using = "//*[@id='m7dcbf152-img']")
	private WebElement glAccountSearch;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tdrow_[C:0]_ttxt-lb[R:0]']")
	private WebElement glComponent;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tdrow_[C:0]_ttxt-lb[R:1]']")
	private WebElement glComponentValue;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tdrow_[C:0]_ttxt-lb[R:1]']")
	private WebElement regularLabor;

	@FindBy(how = How.XPATH, using = "//*[@id='mc0fd1072-pb']")
	private WebElement glAccountOkBtn;

	@FindBy(how = How.XPATH, using = "//*[@id='m1cc7da76-tb']")
	private WebElement validCostCenter;

	@FindBy(how = How.XPATH, using = "//*[@id='m267fb813-tab_anchor']")
	private WebElement frequencytab;

	@FindBy(how = How.XPATH, using = "//*[@id='mde32dd1d-tb']")
	private WebElement startDate;

	@FindBy(how = How.XPATH, using = "//*[@id='m4b4a1d0e-tb']")
	private WebElement frequencyField;

	@FindBy(how = How.XPATH, using = "//*[@id='m4c27d917-tb']")
	private WebElement nextDueDate;

	@FindBy(how = How.XPATH, using = "//*[@id='m74dc8d73-tab_anchor']")
	private WebElement seasonalDatesTab;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ma9cf7b0b-cb_img']")
	private WebElement sunday;
	
	@FindBy(how = How.XPATH, using = "//*[@id='m30c62ab1-cb_img']")
	private WebElement monday;
	
	@FindBy(how = How.XPATH, using = "//*[@id='m47c11a27-cb_img']")
	private WebElement tuesday;
	
	@FindBy(how = How.XPATH, using = "//*[@id='md9a58f84-cb_img']")
	private WebElement wednessday;
	
	@FindBy(how = How.XPATH, using = "//*[@id='maea2bf12-cb_img']")
	private WebElement thrusday;
	
	@FindBy(how = How.XPATH, using = "//*[@id='m37abeea8-cb_img']")
	private WebElement friday;
	
	@FindBy(how = How.XPATH, using = "//*[@id='m40acde3e-cb_img']")
	private WebElement saturday;
	
	@FindBy(how = How.XPATH, using = "//*[@id='toolactions_SAVE-tbb_image']")
	private WebElement savePmBtn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='toolactions_STATUS-tbb_image']")
	private WebElement changeStatusPmBtn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='mc927149a-tb']")
	private WebElement pmNewStatus;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu0_ACTIVE_OPTION_a_tnode']")
	private WebElement pmStatusActive;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu0_INACTIVE_OPTION_a_tnode']")
	private WebElement pmStatusInactive;
	
	@FindBy(how = How.XPATH, using = "//*[@id='m60bd6d91-pb']")
	private WebElement changeStatusPmOkBtn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='m1cc7da76-img']")
	private WebElement costCenterSearch;
	
	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tfrow_[C:0]_txt-tb']")
	private WebElement costCenterSubSearch;
	
	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tdrow_[C:0]_ttxt-lb[R:0]']")
	private WebElement costCenterResultOne;
	
	@FindBy(how = How.XPATH, using = "//*[@id='m63933e08-tb']")
	private WebElement jpBox;
	
	@FindBy(how = How.XPATH, using = "//*[@ev='PA_INTORD']")
	private WebElement internalOrderSearch;
	
	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tdrow_[C:0]_ttxt-lb[R:0]']")
	private WebElement internalOrderOne;
	
	@FindBy(how = How.XPATH, using = "//*[@id='maa8ad01-tb']")
	private WebElement capPmNum;
	
	@FindBy(how = How.XPATH, using = "//*[@id='m6a7dfd2f_tfrow_[C:1]_txt-tb']")
	private WebElement pmSearchBox;
	
	@FindBy(how = How.XPATH, using = "//*[@id='m6a7dfd2f_tdrow_[C:1]_ttxt-lb[R:0]']")
	private WebElement pmResultOne;
	
	@FindBy(how = How.XPATH, using = "//*[@id='m88dbf6ce-pb']")
	private WebElement deleteForecast;
	
	@FindBy(how = How.XPATH, using = "//*[@id='mceb45565-tb']")
	private WebElement revisionNum;
	
	public void enterRevisionNumber() throws Throwable{
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waitForElementVisibility(driver, revisionNum);
		revisionNum.clear();
		revisionNum.sendKeys("2");
	
	}
	
	public void clickOkDeleteforecast() throws Throwable{
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waitForElementVisibility(driver, deleteForecast);
		deleteForecast.click();
		CustomWait.waitForElementInvisible(driver, deleteForecast);
		
	}
	
	public void changePmStatusInactive() throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.SHORTWAIT);
		pmNewStatus.click();
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.SHORTWAIT);
		pmStatusInactive.click();
		CustomWait.waiting(Constants.SHORTWAIT);

	}
	
	public void verifyPmNumberMatches(String key) throws Throwable {
		CustomWait.waiting(Constants.SHORTWAIT);
		String expected = FileReaderManager.getInstance().getConfigReader().getTarget("PM001");
		String actual = capPmNum.getAttribute("originalvalue").trim();
		System.out.println(expected+" "+actual);
		Assert.assertTrue("PM number doesn't match", actual.contains(expected));

	}
	
	public void clickPmResult() throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waitForElementVisibility(driver, pmResultOne);
		pmResultOne.click();

	}
	
	public void searchPmValue(String key) throws Throwable {
		CustomWait.waiting(Constants.SHORTWAIT);
		String pmName = FileReaderManager.getInstance().getConfigReader().getTarget(key);
		System.out.println("Captured PM value entered:: " + pmName);
		pmSearchBox.sendKeys(pmName);
		pmSearchBox.sendKeys(Keys.ENTER);
		CustomWait.waiting(Constants.SHORTWAIT);
	}
	
	public void capturePmNumber(String pmName) throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		String pmValue = capPmNum.getAttribute("originalvalue").trim();
		System.out.println("PM captured:: " + pmValue);
		FileReaderManager.getInstance().getConfigReader().setTarget(pmName, pmValue);
	}
	
	public void enterValidInternalOrder()throws Throwable {
		CustomWait.waitForElementClickable(driver, internalOrderSearch);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		internalOrderSearch.click();
		CustomWait.waitForElementClickable(driver, internalOrderOne);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		internalOrderOne.click();
		CustomWait.waiting(Constants.VERYSHORTWAIT);
	}
	
	public void enterValidCostCenter() throws Throwable {
		CustomWait.waitForElementClickable(driver, costCenterSearch);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		costCenterSearch.click();
		CustomWait.waitForElementClickable(driver, costCenterResultOne);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		costCenterResultOne.click();
		CustomWait.waiting(Constants.SHORTWAIT);

	}
	
	public void changePmStatus() throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.SHORTWAIT);
		pmNewStatus.click();
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.SHORTWAIT);
		pmStatusActive.click();
		CustomWait.waiting(Constants.SHORTWAIT);

	}
	
	public void clickChangeStatusPmBtn() throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.SHORTWAIT);
		changeStatusPmBtn.click();
		CustomWait.waiting(Constants.MEDIUMWAIT);

	}
	
	public void clickSavePmBtn() throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		savePmBtn.click();
		CustomWait.waiting(Constants.SHORTWAIT);

	}
	
	public void checkBoxActiveDays() throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		monday.click();
		tuesday.click();
		thrusday.click();
		saturday.click();
		CustomWait.waiting(Constants.SHORTWAIT);

	}

	public void navigateToSeasonalDates() throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		seasonalDatesTab.click();
		CustomWait.waiting(Constants.SHORTWAIT);

	}

	public void enterGivenFrequency(String num) throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		frequencyField.clear();
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		frequencyField.sendKeys(num);
		CustomWait.waiting(Constants.SHORTWAIT);

	}

	public void enterEstimatedNextDueDate() throws Throwable {
		DateFormat dateFormat = new SimpleDateFormat("M/d/yy");
		Date date = new Date();
		String untildate = dateFormat.format(date);
		Calendar cal = Calendar.getInstance();
		cal.setTime(dateFormat.parse(untildate));
		cal.add(Calendar.DATE, 1);
		String convertedDate = dateFormat.format(cal.getTime());
		System.out.println("Tomorrow's date:: " + convertedDate);
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		nextDueDate.clear();
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		nextDueDate.sendKeys(convertedDate);
		CustomWait.waiting(Constants.SHORTWAIT);

	}

	public void enterTomorrowsDateAsStartDate() throws Throwable {
		DateFormat dateFormat = new SimpleDateFormat("M/d/yy");
		Date date = new Date();
		String untildate = dateFormat.format(date);
		Calendar cal = Calendar.getInstance();
		cal.setTime(dateFormat.parse(untildate));
		cal.add(Calendar.DATE, 1);
		String convertedDate = dateFormat.format(cal.getTime());
		System.out.println("Tomorrow's date:: " + convertedDate);
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		startDate.clear();
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		startDate.sendKeys(convertedDate);
		CustomWait.waiting(Constants.VERYSHORTWAIT);

	}

	public void navigateToFrequencyTab() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,0)");

		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		frequencytab.click();
		CustomWait.waiting(Constants.VERYSHORTWAIT);

	}

	public void enterValidGlAccount() throws Throwable {
		CustomWait.waiting(Constants.SHORTWAIT);
		glAccountSearch.click();
		CustomWait.waiting(Constants.SHORTWAIT);
		glComponent.click();
		CustomWait.waiting(Constants.SHORTWAIT);
		glComponentValue.click();
		CustomWait.waiting(Constants.SHORTWAIT);
		regularLabor.click();
		CustomWait.waiting(Constants.SHORTWAIT);
		glAccountOkBtn.click();
	}

	public void enterPmDescription(String text) throws Throwable {
		CustomWait.waiting(Constants.SHORTWAIT);
		CustomWait.waitForElement(pmDescriptionField);
		pmDescriptionField.sendKeys(text);
		CustomWait.waiting(Constants.VERYSHORTWAIT);

	}

	public void clickPmMaintenanceTypeSearch() throws Throwable {
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		CustomWait.waitForElement(pmMaintenanceTypeSearch);
		pmMaintenanceTypeSearch.click();

	}

	public void clickShiftWorkPerformedSearch() throws Throwable {
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		CustomWait.waitForElement(shiftWorkSearch);
		shiftWorkSearch.click();

	}

	public void selectMaintenanceType(String text) throws Throwable {
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		CustomWait.waitForElement(maintenanceTypeSubSearch);
		maintenanceTypeSubSearch.sendKeys(text);
		maintenanceTypeSubSearch.sendKeys(Keys.ENTER);
		CustomWait.waitForElement(maintenanceTypeResultOne);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		maintenanceTypeResultOne.click();
		CustomWait.waiting(Constants.VERYSHORTWAIT);

	}

	public void selectShiftWorkPerformed(String text) throws Throwable {
		CustomWait.waiting(Constants.SHORTWAIT);
		shiftWorkSubSearch.sendKeys(text);
		shiftWorkSubSearch.sendKeys(Keys.ENTER);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		CustomWait.waitForElement(shiftWorkResultOne);
		shiftWorkResultOne.click();

	}

	public void enterStartYear(String text) throws Throwable {
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		CustomWait.waitForElement(startYearBox);
		startYearBox.sendKeys(text);

	}

	public void clickSectionSubSectionSearch() throws Throwable {
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		CustomWait.waitForElement(secSubSecSearch);
		secSubSecSearch.click();

	}

	public void selectSectionSubSection(String text) throws Throwable {
		CustomWait.waiting(Constants.SHORTWAIT);
		secSubSecSubSearch.sendKeys(text);
		secSubSecSubSearch.sendKeys(Keys.ENTER);
		CustomWait.waiting(Constants.SHORTWAIT);
		secSubSecResultOne.click();

	}

	public void enterPmDuration(String num) throws Throwable {
		CustomWait.waiting(Constants.SHORTWAIT);
		pmDurationBox.sendKeys(num);

	}

	public void enterAssetValue(String key) throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		String assetName = FileReaderManager.getInstance().getConfigReader().getTarget(key);
		System.out.println("Captured Asset value entered:: " + assetName);
		assetBox.sendKeys(assetName);
		CustomWait.waiting(Constants.SHORTWAIT);
	}
	
	public void enterJobPlanValue(String key) throws Throwable {
		CustomWait.waiting(Constants.SHORTWAIT);
		String jpName = FileReaderManager.getInstance().getConfigReader().getTarget(key);
		System.out.println("Captured Job Plan value entered:: " + jpName);
		jpBox.sendKeys(jpName);
		CustomWait.waiting(Constants.SHORTWAIT);
	}

	public void enterLeadTimeDays(String num) throws Throwable {
		CustomWait.waiting(Constants.SHORTWAIT);
		leadTimeDays.clear();
		leadTimeDays.sendKeys(num);

	}

	public void clickJobPrioritySearch() throws Throwable {
		CustomWait.waiting(Constants.SHORTWAIT);
		jobPrioritySearch.click();

	}

	public void selectJobPriority(String text) throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");

		CustomWait.waiting(Constants.SHORTWAIT);
		jobPrioritySubSearch.sendKeys(text);
		jobPrioritySubSearch.sendKeys(Keys.ENTER);
		CustomWait.waiting(Constants.SHORTWAIT);
		jobPriorityResultOne.click();

	}

	public void enterExtraValueWorkOrder(String num) throws Throwable {
		CustomWait.waiting(Constants.SHORTWAIT);
		extraValueWorkOrder.sendKeys(num);

	}

	public void statusChangePmOk() throws Throwable{
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.MEDIUMWAIT);
		changeStatusPmOkBtn.click();
		CustomWait.waiting(Constants.LONGWAIT);
		
	}

}
