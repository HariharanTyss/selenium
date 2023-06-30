package tyss_STC_DWS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DWS_Register_With_Registered_Email_Id {

public static void main(String[] args) throws InterruptedException {
		
		//set properties
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//launching chrome browser
		WebDriver driver=new ChromeDriver();
		//maximizing the window
		driver.manage().window().maximize();
		//launching website
		driver.get("https://demowebshop.tricentis.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("Register"))));
		
		//click on register link
		driver.findElement(By.linkText("Register")).click();
		//Thread.sleep(2000);
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='page-title']"))));
		
		//fill all necessary details
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.xpath("(//input[contains(@class,'text-box')])[1]")).sendKeys("nikhil");
		driver.findElement(By.xpath("(//input[contains(@class,'text-box')])[2]")).sendKeys("chandelwar");
		driver.findElement(By.xpath("(//input[contains(@class,'text-box')])[2]")).sendKeys("chandelwar");
		driver.findElement(By.xpath("(//input[contains(@class,'text-box')])[3]")).sendKeys("nikhil26@gmail.com");
		driver.findElement(By.xpath("(//input[contains(@class,'text-box')])[4]")).sendKeys("nikhil123");
		driver.findElement(By.xpath("(//input[contains(@class,'text-box')])[5]")).sendKeys("nikhil123");
		Thread.sleep(2000);
		//click on register button
		driver.findElement(By.id("register-button")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//li[text()='The specified email already exists']"))));
		
		String result = driver.findElement(By.xpath("//li[text()='The specified email already exists']")).getText();
		if (result.equalsIgnoreCase("The specified email already exists")) {
			System.out.println(result);
		} else {
			String result2 = driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]")).getText();
			System.out.println(result2);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[contains(@class,'button-1 register')]")).click();
		}
		driver.quit();
}
}
