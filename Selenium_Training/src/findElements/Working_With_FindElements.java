package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_FindElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> book_List = driver.findElements(By.xpath("//a[contains(text(),'Books')]"));
		
		for(int i = 0;i<book_List.size();i++) {
			String value = book_List.get(i).getText();
			System.out.println(value);
		}
		driver.quit();
	}
}
