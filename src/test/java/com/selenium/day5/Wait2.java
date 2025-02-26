package com.selenium.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait2 {

	public static void main(String[] args) {
      
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		//Explicit Wait -> Conditions
		//object --> WebDriveWait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.
				presenceOfElementLocated(By.xpath("//input[@name='email']")))
		        .sendKeys("e@.com");
		
    WebElement pa=   wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='passA']")));
    pa.sendKeys("some password");
	}

}
