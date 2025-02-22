package com.selenium.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classname1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver=new ChromeDriver();
    driver.get("https://practice.expandtesting.com/");
    
   List<WebElement> l1= driver.findElements(By.className("card-text"));
    
   System.out.println(l1.size());
   
   for(int i=0;i<l1.size();i++)
   {
	  WebElement ele= l1.get(i);
	 System.out.println(i+" "+ ele.getTagName()+"  "+ele.getText());
	 System.out.println("-----------------------------------");
   }
    
	}

}
