package com.flipkart.generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FlipkartExcelOperations {
	
	public static String readdata(String sheetname,int rownum,int cellnum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\Flipkart\\testdata");
		Workbook w1=WorkbookFactory.create(fis);
		Cell s1=w1.getSheet(sheetname).getRow(rownum).getCell(cellnum);
		DataFormatter rv=new DataFormatter();
		String s=rv.formatCellValue(s1);
		return s;
	}
	public static void writedata(String sheetname,int rownum,int cellnum,String data) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\Flipkart\\testdata");
		Workbook w2=WorkbookFactory.create(fis);
		w2.getSheet(sheetname).getRow(rownum).createCell(cellnum).setCellValue(data);
		FileOutputStream fos=new FileOutputStream("C:\\Users\\hp\\eclipse-workspace\\Flipkart\\testdata");
		w2.write(fos);
	}

}

