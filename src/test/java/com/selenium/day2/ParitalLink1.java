package com.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParitalLink1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

		WebElement link = driver.findElement(By.linkText("Create new account"));

	//	link.click();
	//  String str=	link.getDomAttribute(null)
	  
	//  System.out.println(str);

	}

}
