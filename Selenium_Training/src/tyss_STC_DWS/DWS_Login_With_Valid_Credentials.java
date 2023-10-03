package tyss_STC_DWS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DWS_Login_With_Valid_Credentials {

public static void main(String[] args) throws InterruptedException {
		
		//set the property
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//launch chrome browser
		WebDriver driver = new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//open the website
		driver.get("https://demowebshop.tricentis.com/");
		//Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("ico-login"))));
		
		//fill all necessary details
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys("nikhil26@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("nikhil123");
		
		//click on login button
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		//Thread.sleep(2000);
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//a[@class='account'])[1]"))));
		
		//Verify user is logged in
		String result = driver.findElement(By.xpath("(//a[@class='account'])[1]")).getText();
		//Thread.sleep(2000);
		if (result.equalsIgnoreCase("nikhil26@gmail.com")) {
			System.out.println(result);
			System.out.println("User is logged in....");
		}
		else {
			System.out.println("User is logged out");
		}
		driver.quit();
	}
}
