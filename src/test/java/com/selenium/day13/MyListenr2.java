package com.selenium.day13;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyListenr2 implements IRetryAnalyzer {
  
	int maxTry=3;
	int count=0;  //1,2,3
	@Override
	public boolean retry(ITestResult result) {
		if(count<maxTry)
		{
			count++;
			return true;
		}
		return false;
	}

}
