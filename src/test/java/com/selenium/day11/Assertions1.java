package com.selenium.day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions1 {
	
	@Test
	public void test1()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String act=driver.getTitle();
		
		System.out.println(act);
		String exp="Facebook – log in or sign up";
		
//	   if(act.equals(exp))
//	   {
//		   System.out.println("Test is passed");
//	   }
//	   else
//	   {
//		   System.out.println("Test is failed");
//	   }
	   
	   //Assertions 
	   Assert.assertEquals(act, exp);
			
	}
	
	@Test
	public void test2()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login");
		driver.findElement(By.id("username")).sendKeys("practiceX");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		//Assetions 
		WebElement ele=driver.findElement(By.xpath("//div[@id='flash']/b"));
		String str=ele.getText();
		
	//	System.out.println(str);
		Assert.assertEquals(str,"You logged into a secure area!");
		
		
	}
	
	@Test
	public void test3()
	{
		System.out.println("hello");
		Assert.assertEquals(5, 3);
		System.out.println("hi");
	}
	
	@Test
	public void test4()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login");
		driver.findElement(By.id("username")).sendKeys("practiceX");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		//Assetions 
		WebElement ele=driver.findElement(By.xpath("//div[@id='flash']/b"));
		String str=ele.getText();
		
	   boolean b= str.contains("secure area!");
	   
	   Assert.assertEquals(b, true);
	   Assert.assertTrue(b);
	   
	
	  
	
	}

}
