package com.selenium.day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
		    driver.get("https://practice.expandtesting.com/js-dialogs");
		    Thread.sleep(2000);
		    driver.findElement(By.id("js-prompt")).click();
		    Thread.sleep(2000);
		   // driver.switchTo().alert().accept();
		    Alert alert=driver.switchTo().alert();
		    alert.sendKeys("Java Selenium");
		    System.out.println(alert.getText());;
		    alert.accept();
		    
	}

}
