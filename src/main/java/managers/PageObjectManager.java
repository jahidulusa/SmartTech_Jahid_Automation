package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.AssetsPage;
import pageObjects.HomePage;
import pageObjects.JobPlanPage;
import pageObjects.LocationPage;
import pageObjects.PmPage;
import pageObjects.RoutesPage;
import pageObjects.WorkOrderPage;


public class PageObjectManager {
	private WebDriver driver;
	private HomePage homePage;
	private AssetsPage assetsPage;
	private LocationPage locationPage;
	private WorkOrderPage workOrderPage;
	private JobPlanPage jobPlanPage;
	private PmPage pmPage;
	private RoutesPage routesPage;
	
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public HomePage getHomePage(){
		return (homePage == null) ? homePage = new HomePage(driver) : homePage;
	}
	
	public AssetsPage getAssetsPage(){
		return (assetsPage == null) ? assetsPage = new AssetsPage(driver) : assetsPage;
	}
	
	public LocationPage getLocationPage(){
		return (locationPage == null) ? locationPage = new LocationPage(driver) : locationPage;
	}
	
	public WorkOrderPage getWorkOrderPage(){
		return (workOrderPage == null) ? workOrderPage = new WorkOrderPage(driver) : workOrderPage;
	}
	
	public JobPlanPage getJobPlanPage(){
		return (jobPlanPage == null) ? jobPlanPage = new JobPlanPage(driver) : jobPlanPage;
	}
	
	public PmPage getPmPage(){
		return (pmPage == null) ? pmPage = new PmPage(driver) : pmPage;
	}
	
	public RoutesPage getRoutesPage(){
		return (routesPage == null) ? routesPage = new RoutesPage(driver) : routesPage;
	}
	
}
