package com.selenium.day14.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	
	@Test
	public void loginTest()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login");
		WebElement user =driver.findElement(By.id("username"));
		WebElement pass= driver.findElement(By.id("password"));
		WebElement loginBtn=driver.findElement(By.xpath("//button[text()='Login']"));
		
		user.sendKeys("practice");
		pass.sendKeys("SuperSecretPassword!");
		loginBtn.click();
	}

}
