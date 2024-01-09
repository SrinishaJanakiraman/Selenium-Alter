package Ddt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Singlefetchdata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		 FileInputStream fis = new FileInputStream("./exce/selenium.xlsx");
		Workbook book=WorkbookFactory.create(fis);
	Sheet sh = book.getSheet("Sheet1");
	Row ro=sh.getRow(0);
	Cell cel=ro.getCell(0);
	String value=cel.getStringCellValue();
	
	System.out.println(value);
		
	}

}
