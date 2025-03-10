package com.selenium.day13;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyLitstener extends Base implements ITestListener {

	@Override
	public void onTestSuccess(ITestResult result) {
		//if the test is getting passed 
		System.out.println("##############Test got passed###########");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		//if test is getting failed
		System.out.println("##############Test got Failed###########");
		tkScrnShot();
	}

	@Override
	public void onStart(ITestContext context) {
		//When Test Starts
		System.out.println("##############Test Started###########");
	}
	
	public void tkScrnShot()
	{
		TakesScreenshot tk=(TakesScreenshot)driver;
		File file=tk.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("./myScrnShot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}


