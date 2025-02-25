package com.selenium.day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
    
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dropdown");
		
	WebElement cd=	driver.findElement(By.xpath("//select[@id='country']"));
		//dropdown --> select 
		Select sel=new Select(cd);
	//	sel.selectByIndex(10);
	//	sel.selectByVisibleText("Japan");
		
	//	sel.selectByValue("BE")
		
//	List<WebElement> li=	 sel.getOptions();
//	
//	for(int i=0;i<10;i++)
//	{
//		WebElement ele=        li.get(i);
//	    System.out.println(ele.getText());
//	}
		
	WebElement d1=	driver.findElement(By.id("elementsPerPageSelect"));
	
	Select s1=new Select(d1);
	s1.selectByIndex(2);
	
	


     
	
	        
	  
	
	}

}
