package com.selenium.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.w3schools.com/JSREF/tryit.asp?filename=tryjsref_oncontextmenu");
	 driver.switchTo().frame("iframeResult");
     WebElement ele=	 driver.findElement(By.xpath("//p[text()='Context menu will show.']"));
   Actions act=new Actions(driver);
   act.contextClick(ele).build().perform();
   
   
	
	}

}
