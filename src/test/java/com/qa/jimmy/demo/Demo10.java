package com.qa.jimmy.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo10 {
public static Workbook book;
 public static Sheet sheet;
	public static void main(String[] args) throws Exception, IOException {
		FileInputStream ip=new FileInputStream("/Users/gyaneshkamal/Automation/com.qa.jimmy/test-data/Book1.xlsx");
		 book=WorkbookFactory.create(ip);
		 sheet = book.getSheet("Sheet1");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(1);
		String adress = cell.getStringCellValue();
		System.out.println(adress);
		getTestData();
		
	}
	public static Object[][] getTestData() {
		FileInputStream ip = null;
		try {
			ip = new FileInputStream("/Users/gyaneshkamal/Automation/com.qa.jimmy/test-data/Book1.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 try {
			book=WorkbookFactory.create(ip);
		} catch (EncryptedDocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 sheet = book.getSheet("Sheet1");
		 Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		 for(int i=0;i<sheet.getLastRowNum();i++) {
			 for(int j=0;j<sheet.getRow(0).getLastCellNum();j++) {
				 data[i][j]=sheet.getRow(i).getCell(j).toString();
				 System.out.println(data[i][j]);
			 }
		 }
		 return data;
	}
}
