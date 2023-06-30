package assignment_iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_By_WebElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/chand/Downloads/iframe.html");
		
		//Switching to frame by using WebElement way
		//Passing WebElement by using id attribute of that particular frame to frame() method
		driver.switchTo().frame(driver.findElement(By.id("FR1")));
		driver.findElement(By.id("small-searchterms")).sendKeys("Books");
		driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
		Thread.sleep(2000);
		
		//Revert back to Parent window
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Google")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}