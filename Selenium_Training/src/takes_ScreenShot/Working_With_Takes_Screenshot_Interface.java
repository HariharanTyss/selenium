package takes_ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Working_With_Takes_Screenshot_Interface {


	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		
		TakesScreenshot ss = (TakesScreenshot) driver;
		File temp = ss.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/firstscreenshot.png");
		FileHandler.copy(temp, dest);
		
		File dest2 = new File("./screenshots/2ndscreenshot.jpeg");
		FileHandler.copy(temp, dest2);
		
		File dest3 = new File("./screenshots/2ndscreenshot.pdf");
		FileHandler.copy(temp, dest3);
	}
}