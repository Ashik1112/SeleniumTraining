package com.selenium.training;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class VerifyWordPressLogin {
	@Test
	public void verifyValidLogin()
	{
		WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	 
	driver.manage().window().maximize();
	 
	driver.get("https://opensouce-demo.orangehrmlive.com");
	 
	LoginPage login=new LoginPage(driver);
	 
	 
	 
	login.clickOnLoginButton();
	 
	 
	driver.quit();
	 
	}
	 
	 
	}

