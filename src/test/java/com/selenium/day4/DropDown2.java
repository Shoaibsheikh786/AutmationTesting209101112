package com.selenium.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver driver=new ChromeDriver();
    driver.get("https://practice.expandtesting.com/dropdown");
    driver.findElement(By.xpath("//a[@id='examples-dropdown']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//a[text()='APIs']")).click();
    
	}

}
