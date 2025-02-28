package com.selenium.day7;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadConfigFiles {

	public static void main(String[] args) throws IOException {
      WebDriver driver;
		//1. location of file
		File file=new File("./config.properties");
		
		//2. create connection
		FileInputStream fis=new FileInputStream(file);
		
		//.properties--> Properties 
		Properties pr=new Properties();
		pr.load(fis);
		
		String v1=pr.getProperty("browser");
		System.out.println(v1);
		String u= pr.getProperty("url");
		
		if(v1.equals("chrome"))
		{
			driver=new ChromeDriver();
			driver.get(u);
		}
		else if(v1.equals("edge"))
		{
			driver=new EdgeDriver();
			driver.get(u);
		}
		else if(v1.equals("firefox"))
		{
			driver=new FirefoxDriver();
			driver.get(u);
		}
		else
		{
			System.out.println("Browser Not Found "+v1);
		}
		 
	}

}
