package com.selenium.day12;

import org.testng.annotations.DataProvider;

public class MyDataProviders {
	
	@DataProvider
	public String[][] loginData()
	{
		String data[][]= {
				{"Admin1","password1"},
				{"Admin2","password2"},
				{"Admin3","password3"}
		};
		
		return data;
     }
	@DataProvider(name="mydata")
	public String[][] loginData2()
	{
		String data[][]= {
				{"Hello","World"},
				{"Hi","java"},
				{"selenium","TestNG"}
		};
		
		return data;
     }

}
