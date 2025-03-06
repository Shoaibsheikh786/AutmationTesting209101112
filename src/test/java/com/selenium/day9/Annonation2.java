package com.selenium.day9;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annonation2 {
	
	@BeforeSuite
	public void befSuite()
	{
		System.out.println("^^^^^^^^^^^^^^^^^this is Before Suite^^^^^^^^^^^^^^^^^^");
	}
	
	@BeforeClass()
	public void befClass()
	{
		System.out.println("####This is before class####");
	}
    
	//it will be executed only once 
	@BeforeTest
	public void befTest()
	{
		System.out.println("Before Test--> Open Chrome Browser");
		// driver=new ChomeDriver();
	}
	
	@BeforeMethod()
	public void befMethod()
	{
		System.out.println("Before Method--> Take Screenshot for method ");
	}
	
	@Test
	public void test1()
	{   
		
		System.out.println("This is test 1");
	}
	@Test
	public void test2()
	{ 
		
		System.out.println("This is Test 2");
	}
	@Test
	public void test3()
	{ 
		
		System.out.println("This is Test 3");
	}

	//this will be executed only once
	@AfterTest
	public void afTest()
	{
		System.out.println("close the browser");
	}
	
	@AfterClass()
	public void afterClass()
	{
		System.out.println("###After class###");
	}
	
	@AfterSuite()
	public void afterSuite()
	{
		System.out.println("^^^^^^^^^^^^After Suite ^^^^^^^^^^^^^^^^^");
	}
	
	
	
	
}
