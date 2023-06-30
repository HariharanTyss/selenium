package tyss_STC_DWS;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWS_Email_Recieved_After_Register {

public static void main(String[] args) throws InterruptedException {
		
		//set properties
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//launching chrome browser
		WebDriver driver=new ChromeDriver();
		//maximizing the window
		driver.manage().window().maximize();
		//launching website
		driver.get("https://demowebshop.tricentis.com/");
		Random r = new Random();
		int num = r.nextInt(10000);
		String email = "nikhil"+num+"@gmail.com";
		
		//click on register link
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		//fill all necessary details
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.xpath("(//input[contains(@class,'text-box')])[1]")).sendKeys("nikhil");
		driver.findElement(By.xpath("(//input[contains(@class,'text-box')])[2]")).sendKeys("chandelwar");
		driver.findElement(By.xpath("(//input[contains(@class,'text-box')])[3]")).sendKeys(email);
		driver.findElement(By.xpath("(//input[contains(@class,'text-box')])[4]")).sendKeys("nikhil123");
		driver.findElement(By.xpath("(//input[contains(@class,'text-box')])[5]")).sendKeys("nikhil123");
		Thread.sleep(2000);
		//click on register button
		driver.findElement(By.id("register-button")).click();
		
		//displaying result
		String result = driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]")).getText();
		System.out.println(result);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,'button-1 register')]")).click();
		Thread.sleep(2000);
		System.out.println("Email not recieved");
}
}
