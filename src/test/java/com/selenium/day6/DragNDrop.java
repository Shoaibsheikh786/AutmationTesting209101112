package com.selenium.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {
	WebDriver driver ;
	
	public void dragRedNGreen() {
		driver= new ChromeDriver();
		Actions act = new Actions(driver);
		driver.get("https://practice.expandtesting.com/drag-and-drop-circles");
		WebElement red = driver.findElement(By.xpath("//div[@class='red']"));
		WebElement bucket = driver.findElement(By.xpath("//div[@id='target']"));
		act.dragAndDrop(red, bucket).build().perform();
		WebElement green = driver.findElement(By.xpath("//div[@class='green']"));
		act.dragAndDrop(green, bucket).build().perform();
	}

	public static void main(String[] args) {
		DragNDrop obj1=new DragNDrop();
		obj1.dragRedNGreen();
		
	}

}
