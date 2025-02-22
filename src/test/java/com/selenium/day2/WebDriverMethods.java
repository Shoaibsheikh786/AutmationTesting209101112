package com.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//refresh forward back close 
	
    //search a webElement 
	WebElement ele=driver.findElement(By.id("emailabc"));
	
	//Action
	ele.sendKeys("hello@gmail.com");
	Thread.sleep(2000);
	
	 WebElement p=  driver.findElement(By.id("pass"));
	 
	 p.sendKeys("mypassword");
	 
	 Thread.sleep(2000);
	  WebElement lg= driver.findElement(By.name("login"));
	  
	  lg.click();
	  
	  
		
	}

}
