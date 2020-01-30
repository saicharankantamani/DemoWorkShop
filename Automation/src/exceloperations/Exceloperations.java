package exceloperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exceloperations {
	public static int getRowcount(String sheetname) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis =new FileInputStream(System.getProperty("user.dir")+"//testdata//userdata.xlsx");
		Workbook w1=WorkbookFactory.create(fis);
		return w1.getSheet(sheetname).getPhysicalNumberOfRows();
	}
	public static int getcellcount(String sheetname,int rownum) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis =new FileInputStream(System.getProperty("user.dir")+"//testdata//userdata.xlsx");
		Workbook w1=WorkbookFactory.create(fis);
		return w1.getSheet(sheetname).getRow(rownum).getPhysicalNumberOfCells();
	}
public static String readData(String sheetname,int rownumber,int cellnumber) throws EncryptedDocumentException, InvalidFormatException, IOException
{
	FileInputStream fis =new FileInputStream(System.getProperty("user.dir")+"//testdata//userdata.xlsx");
	Workbook w1=WorkbookFactory.create(fis);
	Cell c=w1.getSheet(sheetname).getRow(rownumber).getCell(cellnumber);
	DataFormatter rv=new DataFormatter();
	String s=rv.formatCellValue(c);
	System.out.print(s+" ");
	System.out.println();
	return s;
}
public static void writedata(String sheetname,int rownumber,int cellnumber,String  data) throws EncryptedDocumentException, InvalidFormatException, IOException
{
	FileInputStream fis =new FileInputStream(System.getProperty("user.dir")+"//testdata//userdata.xlsx");
	Workbook w1=WorkbookFactory.create(fis);
	w1.getSheet(sheetname).getRow(rownumber).createCell(cellnumber).setCellValue(data);
	FileOutputStream fos=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\userdata.xlsx");
	w1.write(fos);
}
}
