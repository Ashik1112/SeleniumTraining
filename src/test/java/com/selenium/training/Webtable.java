package com.selenium.training;

	import java.text.ParseException;
	import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;


	public class Webtable {
	    
		@Test
		public void webTable() throws ParseException, IOException
		{
	    	WebDriver wd;
			//System.setProperty("webdriver.chrome.driver","G://chromedriver.exe");
	    	WebDriverManager.chromedriver().setup();
			 wd= new ChromeDriver();
			 wd.get("http://demo.guru99.com/test/web-table-element.php"); 
			 String max;
		     double m=0,r=0;
			 
		       //No. of Columns
		        List  col = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
		        System.out.println("Total No of columns are : " +col.size());
		        //No.of rows
		        List  rows = wd.findElements(By.xpath (".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		        System.out.println("Total No of rows are : " + rows.size());
		        for (int i =1;i<rows.size();i++)
		        {    
		            max= wd.findElement(By.xpath("//tbody/tr[\" + (i+1)+\"]/td[4]")).getText();
		            NumberFormat f =NumberFormat.getNumberInstance(); 
		            Number num = f.parse(max);
		            max = num.toString();
		            m = Double.parseDouble(max);
		            if(m>r)
		             {    
		                r=m;
		             }
		        }

		        
				File src =((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		        FileUtils.copyFile(src, new File("C:\\Users\\YASIM\\Pictures\\Saved Pictures\\OrangeHrm.png"));
		        
		        System.out.println("Maximum current price is : "+ r);
		}}
	
	