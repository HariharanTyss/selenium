package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Enter_Value_FindElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/chand/Downloads/demo.html");
		List<WebElement> list_Box = driver.findElements(By.xpath("//input[@name='fname']"));
		
		for (int i = 0; i < list_Box.size(); i++) {
			Thread.sleep(500);
			list_Box.get(i).sendKeys("Nikhil Chandelwar");
		}
	}
}