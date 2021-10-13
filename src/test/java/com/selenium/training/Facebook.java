package com.selenium.training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	@Test
	public void Itest() 
		{ 
				//System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
			    String baseURL = "http://demo.guru99.com/test/newtours/register.php";
			    
			    
				driver.get(baseURL);

				Select drpCountry = new Select(driver.findElement(By.name("country")));
				drpCountry.selectByVisibleText("ANTARCTICA");

				//Selecting Items in a Multiple SELECT elements
				driver.get("http://jsbin.com/osebed/2");
				Select fruits = new Select(driver.findElement(By.id("fruits")));
				fruits.selectByVisibleText("Banana");
				fruits.selectByIndex(1);
		 }
		
	}


