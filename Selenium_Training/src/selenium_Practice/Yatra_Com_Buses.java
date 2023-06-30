package selenium_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Yatra_Com_Buses {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.yatra.com/");
		driver.findElement(By.id("booking_engine_buses")).click();
		driver.findElement(By.id("BE_bus_from_station")).click();
		driver.findElement(By.xpath("(//span[text()='B'])[1]")).click();
	}
}
