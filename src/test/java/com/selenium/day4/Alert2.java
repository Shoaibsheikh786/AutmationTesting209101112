package com.selenium.day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2 {

	public static void main(String[] args) throws InterruptedException {
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://practice.expandtesting.com/js-dialogs");
	    Thread.sleep(2000);
	    driver.findElement(By.id("js-confirm")).click();
	    Thread.sleep(2000);
	   // driver.switchTo().alert().accept();
	    Alert alert=driver.switchTo().alert();
	    alert.dismiss();
	}

}
