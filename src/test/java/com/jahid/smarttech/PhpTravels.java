package com.jahid.smarttech;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PhpTravels {

	
	  public static void main(String[] args) throws Throwable{
		  WebDriver driver = null;
	  
	  try {
		//Set the path to the chromedriver executable
		  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		  //instantiate a Chrome session
		  driver = new ChromeDriver();
		  //Open browser and go to home page
		  driver.get("https://www.phptravels.net/login");
		  //declare implicity wait
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  //print page title
		  System.out.println(driver.getTitle());
		  //Maximize window
		  //driver.manage().window().maximize();
		  //enter username and password
		  driver.findElement(By.name("username")).sendKeys("user@phptravels.com");
		  
		  driver.findElement(By.name("password")).sendKeys("demouser");
		  //driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[3]/div[1]/following-sibling::div[1]")).sendKeys("demouser");
		  driver.findElement(By.xpath("(//*[contains(text(),'Login')])[4]")).click();
		  //java time out
		  Thread.sleep(3000);
		  System.out.println(driver.getTitle());
		  //log out
		  driver.findElement(By.xpath("(//*[@id='dropdownCurrency'])[2]")).click();
		  driver.findElement(By.xpath("//*[contains(text(),'Logout')]")).click();
		System.out.println(driver.getTitle());
	} finally {
		driver.close();
	}
	  Thread.sleep(3000);
	  //close window
	  driver.close();
	  //example of explicit wait
	  //WebElement firstResult = new WebDriverWait(driver, 10)
		      //  .until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));
	  
	  
	  }
	 

}
