package com.selenium.training;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JsExecutor {
	public static void main(String[] args) throws InterruptedException
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
    driver.get("http://www.google.com");
    driver.manage().window().maximize();
	JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("alert('Hello,Close Pannatha!')");
				Thread.sleep(5000);
			
}}
