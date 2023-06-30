package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Subscribe_News_Letter {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement newsLetter = driver.findElement(By.id("newsletter-email"));
		newsLetter.sendKeys("chandelwar8@gmail.com");
		String value = newsLetter.getAttribute("value");
		System.out.println("Value = "+value);
		Thread.sleep(1000);
		WebElement subscribe = driver.findElement(By.id("newsletter-subscribe-button"));
		if (subscribe.isEnabled()) {
			subscribe.click();
		}
		else {
			System.out.println("disabled");
		}
		Thread.sleep(500);
		System.out.println(driver.findElement(By.id("newsletter-result-block")).getText());
		driver.quit();
	}
}
