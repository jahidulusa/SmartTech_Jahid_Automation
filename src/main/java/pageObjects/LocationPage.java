package pageObjects;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;
import selenium.Constants;
import selenium.CustomWait;

public class LocationPage {
	WebDriver driver;
	public Logger log = Logger.getLogger("LocationPage");

	public LocationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='m8ee1358-tb']")
	private WebElement locationField;

	@FindBy(how = How.XPATH, using = "//*[@id='m8ee1358-tb2']")
	private WebElement locationDescriptionField;

	@FindBy(how = How.XPATH, using = "//*[@id='m91e742e2-img']")
	private WebElement locationTypeSearch;

	@FindBy(how = How.XPATH, using = "//*[@id='m44662531-img']")
	private WebElement locationMaintainSearch;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tfrow_[C:0]_txt-tb']")
	private WebElement locationTypeSubSearch;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tdrow_[C:0]_ttxt-lb[R:0]']")
	private WebElement locationTypeResultOne;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tfrow_[C:0]_txt-tb']")
	private WebElement maintainLocSubSearch;

	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tdrow_[C:0]_ttxt-lb[R:0]']")
	private WebElement maintainLocResultOne;
	
	@FindBy(how = How.XPATH, using = "//*[@id='toolactions_SAVE-tbb_image']")
	private WebElement saveLocation;
	
	@FindBy(how = How.ID, using = "titlebar_error")
	private WebElement panelMsg;
	
	@FindBy(how = How.XPATH, using = "//*[@ev='glnavigator']")
	private WebElement glAccountSearch;
	
	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tdrow_[C:0]_ttxt-lb[R:0]']")
	private WebElement glAccountValue;
	
	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tdrow_[C:0]_ttxt-lb[R:1]']")
	private WebElement glComponentValue;
	
	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tdrow_[C:0]_ttxt-lb[R:1]']")
	private WebElement glComponentDescription;
	
	@FindBy(how = How.XPATH, using = "//*[@id='mc0fd1072-pb']")
	private WebElement glAccountOkBtn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='m1cc7da76-img']")
	private WebElement costCenterSearch;
	
	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tdrow_[C:0]_ttxt-lb[R:0]']")
	private WebElement costCenterOne;
	
	@FindBy(how = How.XPATH, using = "//*[@id='mfbe0298f-img']")
	private WebElement internalOrderSearch;
	
	@FindBy(how = How.XPATH, using = "//*[@id='lookup_page1_tdrow_[C:0]_ttxt-lb[R:0]']")
	private WebElement internalOrderOne;
	
	public void enterValueForInternalOrder() throws Throwable {
		CustomWait.waitForElementClickable(driver, internalOrderSearch);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		internalOrderSearch.click();
		CustomWait.waitForElementClickable(driver, internalOrderOne);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		internalOrderOne.click();
		CustomWait.waiting(Constants.VERYSHORTWAIT);

	}
	
	public void enterValueForCostCenter() throws Throwable{
		CustomWait.waitForElementClickable(driver, costCenterSearch);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		costCenterSearch.click();
		CustomWait.waitForElementClickable(driver, costCenterOne);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		costCenterOne.click();
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		
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
	
	public void clickGLAccountSearch() throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waiting(Constants.VERYSHORTWAIT);
		glAccountSearch.click();

	}

	public void enterNewLocationInLocField(String locName) throws Throwable{
		String locValue = "L-" + FileReaderManager.getInstance().getUtilitiesManager().getAlphaNumericString(7);
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waitForElement(locationField);
		CustomWait.sendChar(locationField, locValue);
		log.info("Location captured:: " + locValue);
		//System.out.println("Location captured:: " + locValue);
		FileReaderManager.getInstance().getConfigReader().setTarget(locName, locValue);

	}

	public void enterLocationDescription(String text) throws Throwable {
		CustomWait.waitForElement(locationDescriptionField);
		CustomWait.sendChar(locationDescriptionField, text);
	}

	public void clickLocationTypeSearch() throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waitForElement(locationTypeSearch);
		locationTypeSearch.click();

	}

	public void selectLocationType(String text) throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waitForElement(locationTypeSubSearch);
		locationTypeSubSearch.sendKeys(text);
		locationTypeSubSearch.sendKeys(Keys.ENTER);
		CustomWait.waiting(Constants.SHORTWAIT);
		locationTypeResultOne.click();
		CustomWait.waiting(Constants.SHORTWAIT);


	}

	public void clickLocationMaintainSearch() throws Throwable {
		CustomWait.waitForElement(locationMaintainSearch);
		locationMaintainSearch.click();

	}

	public void selectMaintainByLoc(String text) throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waitForElement(maintainLocSubSearch);
		maintainLocSubSearch.sendKeys(text);
		maintainLocSubSearch.sendKeys(Keys.ENTER);
		CustomWait.waiting(Constants.SHORTWAIT);
		maintainLocResultOne.click();
		CustomWait.waiting(Constants.SHORTWAIT);

	}
	
	public void clickSaveLocation() throws Throwable {
		CustomWait.waitForPageLoaded(driver);
		CustomWait.waitForElement(saveLocation);
		saveLocation.click();

	}
	
	public void verifyLocationSavedFeedbackMsg() throws Throwable {
		Thread.sleep(20000);
		if(driver.getPageSource().contains("Record has been saved")){
			System.out.println("Record has been saved text is present");
			}else{
			System.out.println("Record has been saved text is absent");
			}
		
	}

}
