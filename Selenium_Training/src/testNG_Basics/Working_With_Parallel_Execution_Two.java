package testNG_Basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Working_With_Parallel_Execution_Two {

	@Test(dataProvider = "LoginData")
	public void loginTest(String usn, String pwd) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys(usn);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.close();
	}
	
	@DataProvider(name = "LoginData", parallel = true)
	public String[][] loginData() throws EncryptedDocumentException, IOException {
		File file = new File("./Testdata/TestData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook workBook = WorkbookFactory.create(fis);
		Sheet sheet = workBook.getSheet("Login");
		
		int row = sheet.getPhysicalNumberOfRows();
		int column = sheet.getRow(0).getPhysicalNumberOfCells();
		
		String[][] array = new String[row-1][column];
		
		for (int i = 1; i < row; i++) {				//to fetch data from excel and store in 2D array
			for (int j = 0; j < column; j++) 
			{	
				array[i-1][j] = sheet.getRow(i).getCell(j).toString();
				//[row-1] because, we are fetching from [1][0] and storing in array[0][0]
			}
		}
		return array;
	}
}