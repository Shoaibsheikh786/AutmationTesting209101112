package com.selenium.day12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataFromXml {
	
	
	@Test
	@Parameters(value="browser")
	public void test1(String browser)
	{ 
		WebDriver driver=null;
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equals("edge"))
		{
			driver= new EdgeDriver();
		}
	   
	   driver.get("https://www.fb.com");	   
	}

}
