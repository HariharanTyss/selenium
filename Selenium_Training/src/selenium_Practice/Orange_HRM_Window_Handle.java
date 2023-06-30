package selenium_Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange_HRM_Window_Handle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("OrangeHRM, Inc")).click();
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent window ID = "+parentWindow);
		
		Set<String> windows = driver.getWindowHandles();
		for(String window : windows) {
			driver.switchTo().window(window);
			if (!(driver.getTitle().equals("OrangeHRM"))) {
				Thread.sleep(2000);
				driver.findElement(By.xpath("//section[@class='footer-top-main']/div[2]/div/div/div[1]/div/ul/li/a")).click();
				break;
			}
			else {
				driver.close();
			}
		}
	}
}
