package com.jahid.smarttech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
	
	public static void main(String[] args) throws Exception {
		
		//Set the path to the chromedriver executable
		  System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		  //instantiate a Chrome session
		  WebDriver driver = new FirefoxDriver();
		  //Open browser and go to home page
		  driver.get("https://www.phptravels.net/login");
		  //declare implicity wait
		  
		  ScreenShot.captureScreenShot(driver, "firefoxTest");
	}

}
