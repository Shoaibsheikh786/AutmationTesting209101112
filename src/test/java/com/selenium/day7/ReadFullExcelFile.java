package com.selenium.day7;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadFullExcelFile {
	
	public static void test1(String u,String p)
	{
		 WebDriver driver=new ChromeDriver();
		    driver.get("https://practice.expandtesting.com/login");
		    WebElement user=driver.findElement(By.id("username"));
		    WebElement pass=driver.findElement(By.id("password"));
		    user.sendKeys(u);
		    pass.sendKeys(p);
		    driver.findElement(By.xpath("//button[text()='Login']")).click();
		    driver.close();
	}

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//1. File location 
        File file=new File("./ExcelFiles/data1.xlsx");
        
      //2. Create connection with the file 
        FileInputStream fis=new FileInputStream(file);
        
      //3.Type of File 
        Workbook wb=WorkbookFactory.create(fis);
        
      //4. get the sheet -> by name index
        Sheet sheet=    wb.getSheetAt(0);
        for(int i=0;i<sheet.getLastRowNum();i++)
        {
        	Row row=sheet.getRow(i);  //row --> admin2 pass2  
        	for(int j=0;j<row.getLastCellNum();j++)
        	{
        		Cell cell=row.getCell(j);
        		String u=cell.toString();
        		j++;
        		Cell cell2=row.getCell(j);
        		String p=cell.toString();
        		test1(u,p);	
   
        	}
        	System.out.println();
        }
        
        
        
        

		
	}

}
