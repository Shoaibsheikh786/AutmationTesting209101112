package com.selenium.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
    
		WebDriver driver=new ChromeDriver();
	    driver.get("https://practice.expandtesting.com/radio-buttons");
	    driver.findElement(By.xpath("//input[@id='yellow']")).click();
	}

}
