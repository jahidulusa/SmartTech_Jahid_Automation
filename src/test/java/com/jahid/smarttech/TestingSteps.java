package com.jahid.smarttech;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestingSteps {
	
	@Given("^user go to login pagea$")
	public void user_go_to_login_pagea() throws Throwable {
		//Set the path to the chromedriver executable
		  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		  //instantiate a Chrome session
		  WebDriver driver = new ChromeDriver();
		  //Open browser and go to home page
		  driver.get("https://www.phptravels.net/login");
		  //declare implicity wait
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  //print page title
	    
	}

	@Given("^user print the page titlea$")
	public void user_print_the_page_titlea() throws Throwable {
	    
	    
	}

	@When("^user enters a valid user namea$")
	public void user_enters_a_valid_user_namea() throws Throwable {
	    
	    
	}

	@When("^user enters a valid passworda$")
	public void user_enters_a_valid_passworda() throws Throwable {
	    
	    
	}

	@Then("^user click on the login button a$")
	public void user_click_on_the_login_button_a() throws Throwable {
	    
	    
	}

	@When("^user click on log out button a$")
	public void user_click_on_log_out_button_a() throws Throwable {
	    
	    
	}

	

	@When("^user close the browser a$")
	public void user_close_the_browser_a() throws Throwable {
	    
	    
	}

}
