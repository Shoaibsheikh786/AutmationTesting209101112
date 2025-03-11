package com.selenium.day14.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	
	//1. WebElements
	//2. Methods which deals with above WebElements
	//3. Constructor : which will get the driver info.
	
	//username 
	 @FindBy(xpath="//input[@id='username']")
     private	 WebElement user;
	 
	public  void enterUsername(String str)
	 {   
		 user.sendKeys(str);
	 }
	 
	 @FindBy(xpath="//input[@id='password']")
	 WebElement pass;
	
	 void enterPassword(String str)
	 {
		 pass.sendKeys(str);
	 }
	 
	 @FindBy(xpath="//button[text()='Login']")
	 WebElement loginBtn;
	 
	 void clickOnLoginBtn()
	 {
		 loginBtn.click();
		 
	 }
	 
	 
	 //constructor
	 LoginPage(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }

}
