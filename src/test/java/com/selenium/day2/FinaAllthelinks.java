package com.selenium.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FinaAllthelinks {

	public static void main(String[] args) {
    
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		//you have to check how many links are there on this page 
		// if there are 48 --> test pass else test fail
		List<WebElement> l1=driver.findElements(By.tagName("a"));
		int tLinks=l1.size();
		if(tLinks==48)
		{
			System.out.println("Test Passed");
		}
		else 
		{
			System.out.println("Test Failed");
		}
		
		
	}

}
