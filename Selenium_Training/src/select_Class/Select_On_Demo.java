package select_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_On_Demo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/chand/Downloads/demo.html");
		
		//find the dropdown
		WebElement cars =  driver.findElement(By.id("standard_cars"));
		
		//Create object of select class
		Select sel = new Select(cars);
		
		//Select options from dropdown
		sel.selectByValue("toy");
		Thread.sleep(1000);
		sel.selectByVisibleText("Jaguar");
		Thread.sleep(1000);
		sel.selectByIndex(6);
		
		System.out.println(sel.isMultiple());
		
		List<WebElement> options = sel.getOptions();
//		for (int i = 0; i < options.size(); i++) {
//			System.out.println(options.get(i).getText());
//		}
		
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
		}
		driver.quit();
	}
}
