package com.selenium.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dwait1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practice.expandtesting.com/login");
		driver.findElement(By.xpath("//input[@id='usernameAbc']")).sendKeys("user1");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("p1");
		 
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		driver.findElement(By.xpath("//a[text()='hereAbc']")).click();
		//find  a webElement which is not present on the webpage -> Error
		
		//waits max 10
	
	}

}
