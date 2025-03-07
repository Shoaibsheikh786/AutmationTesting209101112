package com.selenium.day9_10;

import org.testng.annotations.Test;

public class Class2 {
	
	//smoke
	@Test(groups="smoke")
	public void test1()
	{
		System.out.println("Smoke this is test 1 in Class 2");
	}
	
	//reg
	@Test(groups="reg" ,invocationTimeOut=1000)
	public void test2()
	{
		System.out.println("Regression this is test 2 in Class 2");
	
	}
	
	//wip
	@Test(groups="wip")
	public void test3()
	{
		System.out.println("Wip this is test 1 in Class 2");
	}
	
	//reg
	@Test(groups="reg", invocationCount=4)
	public void test4()
	{
		System.out.println("Regression this is test 2 in Class 2");
	}

}
