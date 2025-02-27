package com.selenium.day6;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshotInSelenium {

	public static void main(String[] args) throws IOException {
    
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	//	driver.getScreenShot
		//1. convert our driver to TakesScreenShot interface
		TakesScreenshot tk=(TakesScreenshot) driver;
		
		//2. call getScreenshotMethod
		File scrnShot= tk.getScreenshotAs(OutputType.FILE);
		
		//3. Copy the screenshot from ram to HD..
		FileUtils.copyFile(scrnShot, new File("./myScnShot.png"));
		
	
	}

}
