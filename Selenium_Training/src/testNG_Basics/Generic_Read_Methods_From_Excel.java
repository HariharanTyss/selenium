package testNG_Basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_Read_Methods_From_Excel {
	
	public String readString(String sheetName, int row, int col) throws EncryptedDocumentException, IOException {
		
		File file = new File("./TestData/TestData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(sheetName);
		return sheet.getRow(row).getCell(col).toString();
	}
	
	public double readNumeric(String sheetName, int row, int col) throws EncryptedDocumentException, IOException {
		File file = new File("./TestData/TestData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(sheetName);
		return sheet.getRow(row).getCell(col).getNumericCellValue();
	}
	
	public boolean readBoolean(String sheetName, int row, int col) throws EncryptedDocumentException, IOException {
		File file = new File("./TestData/TestData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(sheetName);
		return sheet.getRow(row).getCell(col).getBooleanCellValue();
	}
}
