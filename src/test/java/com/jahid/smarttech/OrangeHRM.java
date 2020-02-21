package com.jahid.smarttech;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHRM {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 30);

		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getTitle());

		driver.manage().window().maximize();

		// driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		// driver.findElement(By.id("//*[contains(text(),'LOGIN
		// Panel')]//following-sibling::div[@id='divUsername']")).sendKeys("Admin");
		// driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//*[@id='logInPanelHeading']//following-sibling::div[1]")).sendKeys("Admin");
				
		
//		driver.findElement(By.xpath("//*[@value='LOGIN']")).click();
//		
//		WebElement abc = driver.findElement(By.xpath("//*[@id='menu_leave_viewLeaveModule']"));
//		wait.until(ExpectedConditions.elementToBeClickable(abc)).click();
//		
//		String actual = driver.findElement(By.xpath("//*[contains(text(),'Linda Anderson')]")).getText();
//		System.out.println("this is actual message" + actual);
//		String expected = "Pankaj Ghosh";
//		Assert.assertEquals(expected, actual);
//		
//		driver.close();

	}

}
