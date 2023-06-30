package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tag_Name {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.tagName("input")).sendKeys("laptop");
		Thread.sleep(1000);
		driver.findElement(By.tagName("input")).clear();;
		Thread.sleep(1000);
		driver.findElement(By.tagName("input")).sendKeys("mobile");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
}
