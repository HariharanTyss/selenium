package java_Script_Executor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Scrolling_Operation {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.oracle.com/in/java/");
		
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;	//downcast driver  to JavaScriptExecutor
		js.executeScript("window.scrollBy(0,700);");	//scroll down
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-700);");	//scroll up
		
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,1000)");	//scroll to that particular place or pixel
		
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,3000)");
	}
}