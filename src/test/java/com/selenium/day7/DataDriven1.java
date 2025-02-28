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

public class DataDriven1 {
	
	

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		// login functions --> username passowrd, invlalid credentials 
		// admin1 pass1
		//adminabc3 passsab32
		//admin3 pass3
		//... .... 
		//print the data
		//1. File location 
         File file=new File("./ExcelFiles/data1.xlsx"); 
         
       //2. Create connection with the file 
         FileInputStream fis=new FileInputStream(file);
         
       //3.Type of File 
         Workbook wb=WorkbookFactory.create(fis);
         
       //4. get the sheet -> by name index
         Sheet sheet=    wb.getSheetAt(0);
         
       //5. get the row from sheet
         Row row=sheet.getRow(5);
         
      //6. get the cell from the row 
         Cell cell= row.getCell(1);
         
      //7. print the cell 
         String user=cell.toString();
         
         System.out.println(user);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
    
	}

}
