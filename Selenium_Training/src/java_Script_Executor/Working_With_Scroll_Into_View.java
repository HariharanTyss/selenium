package java_Script_Executor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Scroll_Into_View {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.zomato.com/india");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement ludhianaRest = driver.findElement(By.xpath("//h5[text()='Ludhiana Restaurants']"));
		
		js.executeScript("arguments[0].scrollIntoView(true)", ludhianaRest);	//If true then webElement is in top of web page
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(false)", ludhianaRest);	//If false then webElement is in bottom of web page
		
	}
}
