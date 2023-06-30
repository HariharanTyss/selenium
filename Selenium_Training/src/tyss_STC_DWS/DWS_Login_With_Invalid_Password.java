package tyss_STC_DWS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWS_Login_With_Invalid_Password {

public static void main(String[] args) throws InterruptedException {
		
		//set the property
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//launch chrome browser
		WebDriver driver = new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//open the website
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		//fill all necessary details
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys("nikhil26@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("nikhil");
		
		//click on login button
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(2000);
		
		String result = driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getText();
		System.out.println(result);
		driver.quit();
		
		
	}
}
