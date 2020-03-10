package com.jahid.smarttech;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Premierleague {

	public static void main(String[] args) throws Throwable {
		
		
		// Set the path to the chromedriver executable
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		// instantiate a Chrome session
		WebDriver driver = new ChromeDriver();
		// Open browser and go to home page
		driver.get("https://www.premierleague.com/tables");
		// declare implicity wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"advertClose\"]")).click();
		driver.findElement(By.xpath("//*[contains(text(),'I accept cookies from this site')]")).click();

		List<WebElement> teams = driver.findElements(By.xpath("//table/tbody/tr/td[3]/a/span[2]"));
		
		FileInputStream fis=new FileInputStream(new File("./excelJahid/ApacheReader.xls"));
		
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet sheet=wb.getSheetAt(0);
		for (int i =0;i<teams.size();i++) {
			
			 System.out.println(teams.get(i).getText().trim());
			 sheet.getRow(i).getCell(0).setCellValue(teams.get(i).getText().trim());
			 FileOutputStream fso= new FileOutputStream("./excelJahid/ApacheReader.xls");
			 wb.write(fso);
		}
	}
}
