package actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard_Action_Demo_Web_Shop {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		WebElement searchBox = driver.findElement(By.id("small-searchterms"));
		
		//Object creation
		Actions action = new Actions(driver);
		
		//send keys in search box using actions class
		action.moveToElement(searchBox).click().sendKeys("Mobiles").perform();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(1000);
		
		//Click keyboard keys using actions class
		action.sendKeys(Keys.PAGE_DOWN).perform();//Keys is an Enum, which contains all keyboard keys as constant
		Thread.sleep(1000);
		action.sendKeys(Keys.PAGE_UP).perform();//PAGE_UP is one of the key of keyboard
	}
}
