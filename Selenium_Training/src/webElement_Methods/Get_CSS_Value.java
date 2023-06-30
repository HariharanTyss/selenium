package webElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_CSS_Value {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		String register_Color = driver.findElement(By.className("ico-register")).getCssValue("color");
		System.out.println(register_Color);
		
		String subscrive_Position = driver.findElement(By.id("newsletter-subscribe-button")).getCssValue("position");
		System.out.println(subscrive_Position);
		
		String digital_Downloads_Height = driver.findElement(By.partialLinkText("Digital downloads")).getCssValue("line-height");
		System.out.println(digital_Downloads_Height);
		
		String digital_Downloads_Font = driver.findElement(By.partialLinkText("Digital downloads")).getCssValue("font-size");
		System.out.println(digital_Downloads_Font);
		driver.quit();
	}
}
