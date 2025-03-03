package com.selenium.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js1 {

	public static void main(String[] args) throws InterruptedException {
     
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login");
		WebElement ele=driver.findElement(By.id("username"));
	//	ele.sendKeys("myUserName");
		
		//javaSctipt ele.value='shaoib'
		//1. sendKeys
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].value='shoaib'",ele );
		
		WebElement login=driver.findElement(By.xpath("//button[text()='Login']"));
		
		//highlight a weblement 
		
		  js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;');", login);
		  Thread.sleep(3000);
		
		//2. click on a button
		
		js.executeScript("arguments[0].click();",login);
		
		
	   //3. scrollawebpage
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,700);");
		
		// color highlight a webelement ;--> Css
		
	
		
		
		
	}

}
