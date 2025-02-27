package com.selenium.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HorizontalBar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver driver=new ChromeDriver();
       driver.get("https://practice.expandtesting.com/horizontal-slider");
       Actions act=new Actions(driver);
       WebElement ele=       driver.findElement(By.xpath("//div[@class='sliderContainer']/input"));
	   act.dragAndDropBy(ele, 5, 0).build().perform();
	
	
	}

}
