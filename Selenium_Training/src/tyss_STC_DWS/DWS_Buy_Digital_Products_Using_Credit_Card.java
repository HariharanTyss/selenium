package tyss_STC_DWS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWS_Buy_Digital_Products_Using_Credit_Card {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//For Login
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("chandelwar7@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Hello@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		driver.findElement(By.xpath("(//a[@href='/digital-downloads'])[1]")).click();
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Shopping cart")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='termsofservice']")).click();
		driver.findElement(By.xpath("//button[@name='checkout']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@onclick='Billing.save()']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@name='paymentmethod'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='CardholderName']")).sendKeys("nikhil chandelwar");
		driver.findElement(By.xpath("//input[@name='CardNumber']")).sendKeys("123456789012");
		driver.findElement(By.xpath("//input[@name='CardCode']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']")).click();
		Thread.sleep(2000);
		String result = driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getText();
		System.out.println(result);
		driver.quit();
	}
}
