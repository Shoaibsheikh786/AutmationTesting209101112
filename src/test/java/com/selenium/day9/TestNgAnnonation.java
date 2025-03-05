package com.selenium.day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgAnnonation {
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}	
	@Test
	public void clickOnLogin()
	{
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	@Test
	public void clickOnCreateAccount()
	{	
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();	
	}
	@AfterMethod()
	public void tearDown()
	{
		driver.close();
	}

}
