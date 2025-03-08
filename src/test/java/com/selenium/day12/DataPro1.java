package com.selenium.day12;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPro1 {
	
	// 1. Admin1 password1
	// 2. Admin2 password2
	// 3. Admin3 password3
	
	@Test(dataProvider="mydata",dataProviderClass=MyDataProviders.class)
	public void test1(String user,String pass)
	{
		System.out.println("open chrome");
	    System.out.println("go to login page");
	    System.out.println("Enter usrername as "+user);
	    System.out.println("Enter password as "+pass);
	    System.out.println("Click on Login ");
	    System.out.println("--------------------------------------");
	}
	
	
}
	

