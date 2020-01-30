package actiTime;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelOp {
	public static String readdata(String sheetname,int rownum,int cellnum) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream("C:\\testdata\\userdata.xlsx");
		Workbook w1=WorkbookFactory.create(fis);
		String s1=w1.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
		return s1;
	}
	public static void writedata(String sheetname,int rownum,int cellnum,String data) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis =new FileInputStream("C:\\testdata\\userdata.xlsx");
		Workbook w1=WorkbookFactory.create(fis);
		w1.getSheet(sheetname).getRow(rownum).createCell(cellnum).setCellValue(data);
		FileOutputStream fos=new FileOutputStream("C:\\testdata\\userdata.xlsx");
		w1.write(fos);
	}

}
