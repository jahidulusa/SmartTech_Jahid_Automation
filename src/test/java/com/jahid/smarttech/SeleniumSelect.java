package com.jahid.smarttech;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumSelect {

	public static void main(String[] args) {
		// Set the path to the chromedriver executable
		System.setProperty("webdriver.chrome.driver", "C://Driver/chromedriver.exe");
		// instantiate a Chrome session
		WebDriver driver = new ChromeDriver();
		// Open browser and go to home page
		driver.get("https://letskodeit.teachable.com/p/practice");

		// declare implicity wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement selectCar = driver.findElement(By.xpath("//*[@id='carselect']"));
		
		Select car = new Select(selectCar);
		//car.selectByVisibleText("Honda");
		//car.selectByIndex(2);
		car.selectByValue("honda");
	}

}
