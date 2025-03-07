package com.selenium.day11;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion1 {
	
	@Test
	public void test1HA()
	{
		System.out.println("hello");
		Assert.assertEquals(10, 12);
		Assert.assertEquals("abc","abc");
		System.out.println("hi");
	}
	
	@Test
	public void test1Sf1()
	{   
		SoftAssert sf=new SoftAssert();
		
		System.out.println("hello");
		sf.assertEquals(10, 12);
		sf.assertEquals("abc","abcY");
		System.out.println("hi");
		sf.assertAll();
	
		
	}


}
