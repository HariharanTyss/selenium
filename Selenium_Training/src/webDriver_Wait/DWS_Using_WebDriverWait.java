package webDriver_Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DWS_Using_WebDriverWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//Thread.sleep(3000);
		//WebDriverWait
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("Register"))));
		
		driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//Thread.sleep(2000);
		//WebDriverWait
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//strong[@class='result']"))));
		
		String result = driver.findElement(By.xpath("//strong[@class='result']")).getText();
		System.out.println(result);
		driver.quit();
	}
}