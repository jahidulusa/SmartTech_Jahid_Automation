package pageObjects;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;
import selenium.Constants;
import selenium.CustomWait;

public class JobPlanPage {
	WebDriver driver;

	public JobPlanPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='m8ee1358-tb']")
	private WebElement jobPlanField;

	@FindBy(how = How.XPATH, using = "//*[@id='m8ee1358-tb2']")
	private WebElement jpDescriptionField;

	@FindBy(how = How.XPATH, using = "//*[@id='m91e742e2-img']")
	private WebElement organizationSearch;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tfrow_[C:0]_txt-tb']")
	private WebElement organizationSubSearch;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tdrow_[C:0]_ttxt-lb[R:0]']")
	private WebElement organizationResultOne;

	@FindBy(how = How.XPATH, using = "//*[@id=\"me6e07274-img\"]")
	private WebElement siteSearch;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tfrow_[C:0]_txt-tb']")
	private WebElement siteSubSearch;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tdrow_[C:0]_ttxt-lb[R:0]']")
	private WebElement siteResultOne;

	@FindBy(how = How.XPATH, using = "//*[@id='m28c3296f-img']")
	private WebElement maintenanceTypeSearch;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tfrow_[C:0]_txt-tb']")
	private WebElement maintenanceTypeSubSearch;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tdrow_[C:0]_ttxt-lb[R:0]']")
	private WebElement maintenanceTypeResultOne;

	@FindBy(how = How.XPATH, using = "//*[@id='md5bd66d5-ti_img']")
	private WebElement attachmentBtn;

	@FindBy(how = How.XPATH, using = "//*[@id='ATTACHMENTS_addlib_a_tnode']")
	private WebElement addFromLibrary;

	@FindBy(how = How.XPATH, using = "//*[@id='mb19aac2_tdrow_[C:0]_tbselrow-ti[R:0]_img']")
	private WebElement firstCheckbox;

	@FindBy(how = How.XPATH, using = "//*[@id='m17509ef6-pb']")
	private WebElement libraryAttachOkBtn;

	@FindBy(how = How.XPATH, using = "//*[@id='mac4ba1dd-tb']")
	private WebElement jpProcedureField;

	@FindBy(how = How.XPATH, using = "//*[@id=\"m11a9087a-img\"]")
	private WebElement templateTypeField;

	@FindBy(how = How.XPATH, using = "//*[@id=\"menu0_MAINTENANCE_OPTION_a_tnode\"]")
	private WebElement ttMaintenance;

	@FindBy(how = How.XPATH, using = "//*[@id='m551e658-tb']")
	private WebElement durationField;

	@FindBy(how = How.XPATH, using = "//*[@id=\"m93a1fcbb-img\"]")
	private WebElement jobPrioritySearch;

	@FindBy(how = How.XPATH, using = "//*[@id=\"lookup_page1_tfrow_[C:0]_txt-tb\"]")
	private WebElement jobPrioritySubSearch;

	@FindBy(how = How.XPATH, using = "//*[@id=\"lookup_page1_tdrow_[C:0]_ttxt-lb[R:0]\"]")
	private WebElement jobPriorityResultOne;

	@FindBy(how = How.XPATH, using = "//*[@id=\"toolactions_SAVE-tbb_image\"]")
	private WebElement jobPrioritySave;

	@FindBy(how = How.XPATH, using = "//*[@id='m8ee1358-tb']")
	private WebElement capJobPlan;

	@FindBy(how = How.XPATH, using = "//*[@id=\"toolactions_STATUS-tbb_image\"]")
	private WebElement jpChangeStatus;

	@FindBy(how = How.XPATH, using = "//*[@id=\"ma9cc2b8f-tb\"]")
	private WebElement jpNewStatus;

	@FindBy(how = How.XPATH, using = "//*[@id=\"menu0_ACTIVE_OPTION_a\"]")
	private WebElement jpStatusActive;

	@FindBy(how = How.XPATH, using = "//*[@id=\"m60bd6d91-pb\"]")
	private WebElement jpStatusOkBtn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='m6a7dfd2f_tfrow_[C:1]_txt-tb']")
	private WebElement jpSearchBox;
	
	@FindBy(how = How.XPATH, using = "//*[@id='m6a7dfd2f_tdrow_[C:1]_ttxt-lb[R:0]']")
	private WebElement jpSearchResult;
	
	@FindBy(how = How.XPATH, using = "//*[@id='toolbar2_tbs_1_tbcb_0_action-tb']")
	private WebElement selectAction;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu0_REVISE_OPTION_a']")
	private WebElement reviseJobPlan;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'View Revision History')]")
	private WebElement revisionHistory;
	
	@FindBy(how = How.XPATH, using = "//*[@id='m2091e720-tb']")
	private WebElement revisionDescription;
	
	@FindBy(how = How.XPATH, using = "//*[@id='m778c1f17_tdrow_[C:1]-c[R:1]']")
	private WebElement revZeroStatus;
	
	@FindBy(how = How.XPATH, using = "//*[@id='m778c1f17_tdrow_[C:1]-c[R:0]']")
	private WebElement revOneStatus;
	
	@FindBy(how = How.XPATH, using = "//*[@id='m778c1f17_tdrow_[C:4]-c[R:0]']")
	private WebElement revOneComment;
	
	@FindBy(how = How.XPATH, using = "//*[@id='m336a0618-pb']")
	private WebElement revHistoryOkBtn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='mc564eb3c_bg_button_addrow-pb']")
	private WebElement taskNewRowBtn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='me37ec155-tb']")
	private WebElement taskDuration;
	
	@FindBy(how = How.XPATH, using = "//*[@id='m79f34481-tb']")
	private WebElement taskNumber;
	
	@FindBy(how = How.XPATH, using = "//*[@id='m79f34481-tb2']")
	private WebElement taskDescription;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ma0e8b2fb_bg_button_addrow-pb']")
	private WebElement plNewRowBtn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='m9baf3199-tb']")
	private WebElement plTaskNumber;
	
	@FindBy(how = How.XPATH, using = "//*[@id='m99e98fc0-img']")
	private WebElement craftDetailBtn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='NORMAL_normal0_a_tnode']")
	private WebElement craftSelectValue;
	
	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tdrow_[C:2]_ttxt-lb[R:0]']")
	private WebElement craftFirstResult;
	
	@FindBy(how = How.XPATH, using = "//*[@id='m9baf3199-tb']")
	private WebElement plTaskHours;
	
	public void enterPlTaskHours(String text) throws Throwable {
		CustomWait.waitForElementVisible(driver, plTaskHours);
		plTaskHours.clear();
		plTaskHours.sendKeys(text);

	}
	
	public void enterValidCraft() throws Throwable {
		CustomWait.waitForElementClickable(driver, craftDetailBtn);
		craftDetailBtn.click();
		CustomWait.waitForElementClickable(driver, craftSelectValue);
		craftSelectValue.click();
		CustomWait.waitForElementClickable(driver, craftFirstResult);
		craftFirstResult.click();	

	}
	
	public void enterPlTaskNumber(String text) throws Throwable {
		CustomWait.waitForElementVisible(driver, plTaskNumber);
		plTaskNumber.clear();
		plTaskNumber.sendKeys(text);

	}
	
	public void clickPlannedLaborNewRowBtn() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		
		CustomWait.waitForElementClickable(driver, plNewRowBtn);
		plNewRowBtn.click();

	}
	
	public void enterTaskDescription(String text) throws Throwable {
		CustomWait.waitForElementVisible(driver, taskNumber);
		taskDescription.clear();
		taskDescription.sendKeys(text);

	}
	
	public void enterTaskNumber(String text) throws Throwable {
		CustomWait.waitForElementVisible(driver, taskNumber);
		taskNumber.clear();
		taskNumber.sendKeys(text);

	}
	
	public void enterTaskDuration(String text) throws Throwable {
		CustomWait.waitForElementVisible(driver, taskDuration);
		taskDuration.clear();
		taskDuration.sendKeys(text);

	}
	
	public void clickTaskNewRowBtn() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		CustomWait.waitForElementClickable(driver, taskNewRowBtn);
		taskNewRowBtn.click();

	}
	
	public void clickRevHistoryOkBtn() throws Throwable {	
		CustomWait.waitForElementClickable(driver, revHistoryOkBtn);
		revHistoryOkBtn.click();

	}
	
	public void verifyRevisionOneComments() throws Throwable {
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		String expected = "Revision 1-Test";
		String actual = revOneComment.getText().trim();
		Assert.assertTrue("Message doesn't match", actual.contains(expected));

	}
	
	public void verifyRevisionOneStatus() throws Throwable {
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		String expected = "PNDREV";
		String actual = revOneStatus.getText().trim();
		Assert.assertTrue("Message doesn't match", actual.contains(expected));

	}
	
	public void verifyRevisionZeroStatus() throws Throwable {
		CustomWait.waiting(Constants.SHORTWAIT);
		String expected = "ACTIVE";
		String actual = revZeroStatus.getText().trim();
		Assert.assertTrue("Message doesn't match", actual.contains(expected));

	}
	
	public void viewRevisionHistory() throws Throwable {
		CustomWait.waiting(Constants.SHORTWAIT);
		CustomWait.waitForElementClickable(driver, selectAction);
		selectAction.click();
		CustomWait.waitForElementClickable(driver, revisionHistory);
		revisionHistory.click();

	}
	
	public void enterRevisionDescription(String text) throws Throwable {
		CustomWait.waiting(Constants.SHORTWAIT);
		revisionDescription.sendKeys(text);
		revisionDescription.sendKeys(Keys.ENTER);
		CustomWait.waiting(Constants.SHORTWAIT);

	}
	
	public void clickReviseJobPlan() throws Throwable {
		CustomWait.waiting(Constants.SHORTWAIT);
		CustomWait.waitForElementClickable(driver, selectAction);
		selectAction.click();
		CustomWait.waitForElementClickable(driver, reviseJobPlan);
		reviseJobPlan.click();

	}
	
	public void clickJobPlanResult() throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waitForElementVisibility(driver, jpSearchResult);
		jpSearchResult.click();

	}
	
	public void searchJobPlanValue(String key) throws Throwable {
		CustomWait.waiting(Constants.SHORTWAIT);
		String jpName = FileReaderManager.getInstance().getConfigReader().getTarget(key);
		System.out.println("Captured Job Plan value entered:: " + jpName);
		jpSearchBox.sendKeys(jpName);
		jpSearchBox.sendKeys(Keys.ENTER);
		CustomWait.waiting(Constants.SHORTWAIT);
	}

	public void changeJpStatus() throws Throwable {
		CustomWait.waitForElementClickable(driver, jpChangeStatus);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		jpChangeStatus.click();
		CustomWait.waitForElementClickable(driver, jpNewStatus);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		jpNewStatus.click();
		CustomWait.waitForElementClickable(driver, jpStatusActive);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		jpStatusActive.click();
		CustomWait.waitForElementClickable(driver, jpStatusOkBtn);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		jpStatusOkBtn.click();

	}

	public void enterNewJobPlanInJobPlanField(String jpName) throws Throwable{
		String jpValue = "J-" + FileReaderManager.getInstance().getUtilitiesManager().getAlphaNumericString(7);
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.SHORTWAIT);
		CustomWait.sendChar(jobPlanField, jpValue);
		System.out.println("Job Plan captured:: " + jpValue);
		FileReaderManager.getInstance().getConfigReader().setTarget(jpName, jpValue);
	}

	public void enterJobPlanDescription(String text) throws Throwable {
		CustomWait.waitForElement(jpDescriptionField);
		CustomWait.sendChar(jpDescriptionField, text);

	}

	public void clickOrganizationSearch() throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		organizationSearch.click();

	}

	public void selectOrganization(String text) throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waitForElement(organizationSubSearch);
		organizationSubSearch.sendKeys(text);
		organizationSubSearch.sendKeys(Keys.ENTER);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		organizationResultOne.click();

	}

	public void clickSiteSearch() throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		siteSearch.click();

	}

	public void selectSite(String text) throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waitForElement(siteSubSearch);
		siteSubSearch.sendKeys(text);
		siteSubSearch.sendKeys(Keys.ENTER);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		siteResultOne.click();

	}

	public void clickMaintenancetypeSearch() throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		maintenanceTypeSearch.click();

	}

	public void selectMaintenanceType(String text) throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waitForElement(maintenanceTypeSubSearch);
		maintenanceTypeSubSearch.sendKeys(text);
		maintenanceTypeSubSearch.sendKeys(Keys.ENTER);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		maintenanceTypeResultOne.click();

	}

	public void selectAttachmentsAddFromLibrary() throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		attachmentBtn.click();
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		addFromLibrary.click();

	}

	public void clickFirstCheckboxLibraryAttachment() throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waitForElementClickable(driver, firstCheckbox);
		firstCheckbox.click();

	}

	public void clickLibraryAttachOkBtn() throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		libraryAttachOkBtn.click();
		Thread.sleep(20000);
		
	}

	public void enterJobPlanProcedure(String text) throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waitForElement(jpProcedureField);
		jpProcedureField.sendKeys(text);

	}

	public void selectTemplateType() throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		templateTypeField.click();
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		ttMaintenance.click();

	}

	public void enterDuration(String num) throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		durationField.clear();
		durationField.sendKeys(num);

	}

	public void clickJobPrioritySearch() throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		jobPrioritySearch.click();

	}

	public void selectJobPriority(String text) throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waitForElement(jobPrioritySubSearch);
		jobPrioritySubSearch.sendKeys(text);
		jobPrioritySubSearch.sendKeys(Keys.ENTER);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		jobPriorityResultOne.click();

	}

	public void clickJobPrioritySave() throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		jobPrioritySave.click();

	}

}
