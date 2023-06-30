package java_Script_Executor;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_ScrollIntoView_In_findElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.zomato.com/india");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		List<WebElement> restList = driver.findElements(By.xpath("//h5"));
		
		for (int i = 0; i < restList.size();) {
			js.executeScript("arguments[0][56].scrollIntoView(true);", restList);
			Thread.sleep(2000);
		}
	}
}