package com.selenium.day14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PTests {
  // 1 test 1 minute --> 10 test 10 minute 
	
	@Test
	public void test1()
	{
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.facebook.com");
//		driver.close();
		System.out.println("This is Test 1 in Class 1");
		
	}
	@Test
	public void test2()
	{
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.facebook.com");
//		driver.close();
		System.out.println("This is Test 2 in Class 1");
		
	}
	@Test(enabled=false)
	public void test3()
	{
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.facebook.com");
//		driver.close();
//		
	}
	@Test(enabled=false)
	public void test4()
	{
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.facebook.com");
//		driver.close();
		
	}
}
