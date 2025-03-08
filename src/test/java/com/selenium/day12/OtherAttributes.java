package com.selenium.day12;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OtherAttributes {
	
	@Test
	public void login()
	{
		System.out.println("This is login test");
		Assert.assertTrue(true);
	}
	
	@Test(dependsOnMethods="login")
	public void logout()
	{
		System.out.println("This is logout test");
		
	}

}
