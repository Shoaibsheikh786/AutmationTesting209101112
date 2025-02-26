package com.selenium.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame1 {

	public static void main(String[] args) throws InterruptedException {
    
    
	WebDriver driver=new ChromeDriver();
	driver.get("https://practice.expandtesting.com/iframe");
	Thread.sleep(2000);
	driver.switchTo().frame("mce_0_ifr"); 
    WebElement ele=	driver.findElement(By.xpath("//body[@id='tinymce']/child::p"));
    ele.sendKeys("this is new text");
    driver.switchTo().parentFrame();
    driver.findElement(By.xpath("//a[text()='Automation Training']")).click();
	}

}
