package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Community_Poll_FindElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> list_Radio_Button = driver.findElements(By.xpath("//input[@type='radio']"));
		
		for (int i = 0; i < list_Radio_Button.size(); i++) {
			Thread.sleep(500);
			list_Radio_Button.get(i).click();
		}
	}
}
