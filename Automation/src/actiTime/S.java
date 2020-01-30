package actiTime;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class S {
	public static void main(String[] args) throws IOException, EncryptedDocumentException, InvalidFormatException {
		FileInputStream fis=new FileInputStream("C://testdata//userdata.xlsx");
		
		Workbook w1=WorkbookFactory.create(fis);
		w1.getSheet("Sheet1").getRow(1).createCell(5).setCellValue("pass");
		FileOutputStream fos=new FileOutputStream("C:\\testdata\\userdata.xlsx");
		w1.write(fos);
	}

}
