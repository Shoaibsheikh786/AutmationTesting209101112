package com.selenium.day8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		//For interview point of view , Important 		
		WebDriver driver= new ChromeDriver();
		driver.get("https://practice.expandtesting.com/windows");
		WebElement ele=driver.findElement(By.xpath("//a[text()='Click Here']"));
	//	System.out.println(cWind);
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		// 
		
		String cWind=driver.getWindowHandle();
		Set <String> allWindows= driver.getWindowHandles();
		
		// get the data from set 
		
		//iteraotor --> list()--
		
		List<String> li=new ArrayList<>(allWindows);
		
		for(int i=0;i<li.size();i++)
		{
			String win=li.get(i);
			driver.switchTo().window(win);
			
			Thread.sleep(3000);
			System.out.println(driver.getTitle());
		}
		
		driver.quit();
		
		driver.switchTo().window(cWind);
		
		//driver.close();
		//driver.quit();
		
		
		
		
		
		
		
		
		
		
		

	}

}
