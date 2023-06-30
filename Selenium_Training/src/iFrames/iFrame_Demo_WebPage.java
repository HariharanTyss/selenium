package iFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame_Demo_WebPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/chand/Downloads/iframe.html");
		
		//Switching to frame by using index
		driver.switchTo().frame(0);
		driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
		Thread.sleep(2000);
		
		//Revert back to Parent window
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Google")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}