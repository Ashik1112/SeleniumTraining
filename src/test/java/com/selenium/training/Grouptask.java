package com.selenium.training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
public class Grouptask {

	
		// TODO Auto-generated method stub
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
			
			  driver.get("https://www.saucedemo.com/");
			  driver.findElement(By.id("user-name")).sendKeys("standard_user");
			  driver.findElement(By.id("password")).sendKeys("secret_sauce");
			  driver.findElement(By.id("login-button")).click();
			  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			  
			  String Title = "Swag Labs";
				String GetTitle = driver.getTitle();
				
				Assert.assertEquals(Title, GetTitle);
				System.out.println("Expected page is launched");
			  driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
			  driver.findElement(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]")).click();
			  driver.findElement(By.xpath("//button[@id='checkout']")).click();
			  driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Ashik");
			  driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Rahaman");
			  driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("12345");
			  driver.findElement(By.xpath("//input[@id='continue']")).click();
			  JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,250)", "");
				driver.findElement(By.xpath("//button[@id='finish']")).click();
				js.executeScript("window.scrollBy(0,250)", "");
				driver.findElement(By.xpath("//button[@id='back-to-products']")).click();
					driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
					driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
					
					
		}
		@AfterTest
		public void tearDown()
		{
			
			  driver.quit();
		}
}