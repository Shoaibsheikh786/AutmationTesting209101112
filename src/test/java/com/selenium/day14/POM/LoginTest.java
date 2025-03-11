package com.selenium.day14.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	public void loginTest()
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://practice.expandtesting.com/login");
	LoginPage lp=new LoginPage(driver);
	lp.enterUsername("paractice");
	lp.enterPassword("SuperSecretPassword!");
	lp.clickOnLoginBtn();
	Assert.assertEquals("...", "");
	}

}
