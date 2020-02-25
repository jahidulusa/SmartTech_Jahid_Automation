package com.jahid.smarttech;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumSpecial {

	public static void main(String[] args) throws Throwable {
		// Set the path to the chromedriver executable
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		// instantiate a Chrome session
		WebDriver driver = new ChromeDriver();
		// Open browser and go to home page
		driver.get("https://learn.letskodeit.com/p/practice");
		// declare implicity wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		// Radio Button Example
		WebElement BMW = driver.findElement(By.id("hondaradio"));
		BMW.click();

		// Select Class Example
		WebElement dropDown = driver.findElement(By.id("carselect"));
		Select selectDrop = new Select(dropDown);
		selectDrop.selectByVisibleText("Benz");
		// selectDrop.selectByIndex(2);

		// Select Multiple Class Example
		WebElement multiSelect = driver.findElement(By.id("multiple-select-example"));
		Select dropMulti = new Select(multiSelect);
		dropMulti.selectByVisibleText("Apple");
		dropMulti.selectByVisibleText("Peach");

		// CheckBox Example
		WebElement checkHonda = driver.findElement(By.id("hondacheck"));
		checkHonda.click();

		// Switch Window Example
		// Store and Print the name of the First window on the console
		String swHandle = driver.getWindowHandle();
		System.out.println("This is first window: " + swHandle);
		// Click on the Button "New Message Window"
		driver.findElement(By.id("openwindow")).click();
		// Store and Print the name of all the windows open
		Set<String> swHandles = driver.getWindowHandles();
		System.out.println("Old window plus new window names: " + swHandles);
		System.out.println("Window title before change: " + driver.getTitle());
		// Pass a window handle to the other window
		for (String handle1 : driver.getWindowHandles()) {
			System.out.println("Changing window: " + handle1);
			driver.switchTo().window(handle1);
		}
		System.out.println("Window title after change: " + driver.getTitle());
		// Close new window
		driver.close();
		// Go back to old window
		driver.switchTo().window(swHandle);

		// Switch Tab Example
		WebElement exTab = driver.findElement(By.xpath("//*[contains(text(),'Open Tab')]"));
		exTab.click();
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println("Number of open tab: " + tabs.size());
		// Switch to new tab
		driver.switchTo().window(tabs.get(tabs.size() - 1));
		System.out.println("Window title after change: " + driver.getTitle());
		driver.close();
		driver.switchTo().window(tabs.get(0));

		// javascriptexecutor scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");

		// Element Displayed example
		WebElement disEx = driver.findElement(By.xpath("//*[@id='displayed-text']"));
		WebElement hidEx = driver.findElement(By.xpath("//*[@id='hide-textbox']"));
		WebElement shoEx = driver.findElement(By.xpath("//*[@id='show-textbox']"));
		hidEx.click();
		Thread.sleep(3000);
		if (!disEx.isDisplayed()) {
			shoEx.click();
		} else {
			System.out.println("The element is displayed");
		}
		
		// Web Table example
		WebElement tableEx = driver.findElement(By.xpath("//table/tbody/tr[4]/td[2]"));
		System.out.println("Getting text from web table: " + tableEx.getText());
		
		Assert.assertTrue("verify table xpath", tableEx.isDisplayed());
		
	    
	    //javascriptexecutor scroll down again
	    js.executeScript("window.scrollBy(0,2000)");
	    
	    //iFrame Example
	    driver.switchTo().frame("courses-iframe");
	    WebElement searchBox = driver.findElement(By.xpath("//*[@id='search-courses']"));
	    searchBox.sendKeys("python");
	    searchBox.sendKeys(Keys.ENTER);
	    Thread.sleep(6000);
	    driver.switchTo().defaultContent();
	    
	    //Mouse Hover Example
	    Actions abc = new Actions(driver);
	    WebElement actEx = driver.findElement(By.xpath("//*[@id='mousehover']"));
	    WebElement reEx = driver.findElement(By.xpath("//*[contains(text(),'Reload')]"));
	    abc.moveToElement(actEx).perform();
	    Thread.sleep(3000);
	    reEx.click();
	    
	    

	}

}
