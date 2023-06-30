package java_Script_Executor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Enter_Value_In_Hidden_TF_By_JSE {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement hiddenTF = driver.findElement(By.id("displayed-text"));
		js.executeScript("arguments[0].scrollIntoView(true)",hiddenTF );
		
		Thread.sleep(2000);
		driver.findElement(By.id("hide-textbox")).click();
		
		Thread.sleep(2000);
		js.executeScript("arguments[0].value='Hello'", hiddenTF);
		
		Thread.sleep(2000);
		driver.findElement(By.id("show-textbox")).click();
	}
}
