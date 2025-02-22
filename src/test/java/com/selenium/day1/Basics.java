package com.selenium.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {
  /** Practice (any question let me know ) */
 /*code --> 
  * https://github.com/Shoaibsheikh786/AutmationTesting209101112.git 
  * */
   public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.manage().window().minimize();
	Thread.sleep(5000);
	driver.navigate().refresh();
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	driver.close();
}
}
