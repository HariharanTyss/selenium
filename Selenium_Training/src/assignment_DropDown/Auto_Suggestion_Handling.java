package assignment_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*handling auto suggestion dropdown
 * for example, you search anything in google
 * and it shows multiple auto suggestions */

public class Auto_Suggestion_Handling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.id("small-searchterms")).sendKeys("comp");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Computing and Internet")).click();
		driver.findElement(By.className("button-1")).click();
		Thread.sleep(1000);
		driver.quit();
	}
}
