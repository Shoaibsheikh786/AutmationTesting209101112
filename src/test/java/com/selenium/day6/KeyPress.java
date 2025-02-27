package com.selenium.day6;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyPress {

	public static void main(String[] args) {
      
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/key_presses");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.BACK_SPACE).build().perform();
	}

}
