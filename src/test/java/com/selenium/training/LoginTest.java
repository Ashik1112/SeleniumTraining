package com.selenium.training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	static WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
	}
	@Test
	
	public void Itest() 
	{
		
		// TODO Auto-generated method stub
		 //System.setProperty("webdriver.chrome.driver", "C:\\Users\\YASIM\\eclipse\\chromedriver_win32\\chromedriver 94\\chromedriver.exe");
		
		  driver.get("https://opensource-demo.orangehrmlive.com/");
		  driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		  driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		  driver.findElement(By.name("Submit")).click();
		  driver.findElement(By.id("welcome")).click();
		  driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		  driver.quit();
	
		}
	@AfterTest() 

	public void Closewindow() 

	{ 

	driver.quit(); 

	}} 
	


