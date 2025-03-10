package com.selenium.day13;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class MySecondClass extends Base{
	
	@Test
	public void mytest1()
	{  
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Assert.assertTrue(true);
	}

}
