package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Check_Box {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/chand/Downloads/demo.html");
		
		//Get all the Check Box WebElements by using findElements method
		List<WebElement> chechkBox_List = driver.findElements(By.xpath("//input[@name='download']"));
		
		//iterate using for each loop
		for(WebElement element :chechkBox_List) {
			element.click();
			Thread.sleep(1000);
		}
	}
}
