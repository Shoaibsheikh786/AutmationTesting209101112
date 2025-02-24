package com.selenium.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.fb.com");
		WebElement ele = driver.findElement(By.xpath("//input[@name='email']"));
		ele.sendKeys("hello@gmail.com");
	   driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("admin");
	}

}
