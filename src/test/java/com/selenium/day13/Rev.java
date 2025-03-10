package com.selenium.day13;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Rev {
	
	
	
	@Test(dataProvider="loginData")
	public void test1(String user,String pass)
	{
		System.out.println("Open chrome");
		System.out.println("go to the url fb.com");
		System.out.println("Enter username as "+user);
		System.out.println("Enter password as "+pass);
		System.out.println("Click on Login");
		System.out.println("-----------------------");
	}
	@DataProvider
	public String[][] loginData()
	{
		// 1. admin1    password1
		// 2. demo2     pdemo2
		// 3. username3 password3
		
		String arr[][]= {
				{"admin1","password"},
				{"demo2","pdemo2"},
				{"username3","password3"}
				};
		
		return arr;
		
		
	}
	

}
