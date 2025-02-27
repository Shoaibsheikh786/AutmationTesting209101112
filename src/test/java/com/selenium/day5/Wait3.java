package com.selenium.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Wait3 {

	public static void main(String[] args) {
      
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		FluentWait<WebDriver> wait=new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.
				presenceOfElementLocated(By.xpath("//input[@name='email']")))
		.sendKeys("abc@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("pass");
	}

}
