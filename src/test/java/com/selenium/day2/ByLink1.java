package com.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLink1 {

	public static void main(String[] args) {
    
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		//for anchor tags
		WebElement link1=driver.findElement(By.linkText("Create new account"));
		link1.click();
	}

}
