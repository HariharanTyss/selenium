package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_ID {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//driver.findElement(By.id("small-searchterms")).sendKeys("Mobile");
		driver.findElement(By.name("q")).sendKeys("laptop");
		Thread.sleep(2000);
		//driver.findElement(By.className("button-1 search-box-button")).click();
		//Thread.sleep(2000);
		driver.quit();
	}
}
