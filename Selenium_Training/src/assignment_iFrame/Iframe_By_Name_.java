package assignment_iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_By_Name_ {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/chand/Downloads/iframe.html");
		
		//Switching to frame by using name attribute of that particular frame
		driver.switchTo().frame("frame1");
		driver.findElement(By.partialLinkText("Log in")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
