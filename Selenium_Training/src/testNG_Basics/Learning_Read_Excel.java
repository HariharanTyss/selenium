package testNG_Basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Learning_Read_Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		singleReadExcel();
		System.out.println("==========================");
		multipleReadExcel("Login");
		System.out.println("==========================");
		readExcel_StoreArray("Login");
	}
	
	public static void singleReadExcel() throws EncryptedDocumentException, IOException {
		
		//Create object of File class and pass the path of excel file
		File file = new File("./TestData/TestData.xlsx");
		
		//Create object of FileInputStream class and pass the reference variable of file
		FileInputStream fis = new FileInputStream(file);
		
		//Call create method of WorkBookFactory class by passing fis reference variable and store
		//in WorkBook interface
		Workbook workBook = WorkbookFactory.create(fis);
		
		//Call the getSheet method of WorkBook interface by passing sheet name and store
		//it in Sheet interface
		Sheet sheet = workBook.getSheet("Login");
		
		//call getRow(index) method of Sheet interface and store it in Row interface
		Row row = sheet.getRow(0);
		
		Cell cell = row.getCell(0);
		
		System.out.println(cell.toString());
	}
	
	public static void multipleReadExcel(String sheetName) throws EncryptedDocumentException, IOException {
		
		File file = new File("./Testdata/TestData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook workBook = WorkbookFactory.create(fis);
		Sheet sheet = workBook.getSheet(sheetName);
		
		int row = sheet.getPhysicalNumberOfRows();
		int column = sheet.getRow(0).getPhysicalNumberOfCells();
		
		for (int i = 1; i < row; i++) {
			for (int j = 0; j < column; j++) {

				System.out.println(sheet.getRow(i).getCell(j).toString());
			}
		}
	}
	
	public static void readExcel_StoreArray(String sheetName) throws EncryptedDocumentException, IOException {
		
		File file = new File("./Testdata/TestData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook workBook = WorkbookFactory.create(fis);
		Sheet sheet = workBook.getSheet(sheetName);
		
		int row = sheet.getPhysicalNumberOfRows();
		int column = sheet.getRow(0).getPhysicalNumberOfCells();
		
		Object[][] array = new Object[row][column];
		
		for (int i = 1; i < row; i++) {				//to fetch data from excel and store in 2D array
			for (int j = 0; j < column; j++) 
			{	
				array[i-1][j] = sheet.getRow(i).getCell(j).toString();
				//[row-1] because, we are fetching from [1][0] and storing in array[0][0]
			}
		}
		for (int i = 0; i < row-1; i++) {			//to print the 2D array
			for (int j = 0; j < column; j++) 
			{	
				System.out.println(array[i][j]);
			}
		}
	}
}