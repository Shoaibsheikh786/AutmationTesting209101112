package com.selenium.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName1 {

	public static void main(String[] args) {
   
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
	   //We are searching for multiple webElements 
		
	 List<WebElement> l1=	driver.findElements(By.tagName("input"));
	 
//	  WebElement ele= l1.get(2);
//	  System.out.println(ele.getAttribute("type"));
	 for(int i=0;i<l1.size();i++)
	 {
		 WebElement ele= l1.get(i);
     	  System.out.println(ele.getAttribute("type")); 
	 }
	}

}

