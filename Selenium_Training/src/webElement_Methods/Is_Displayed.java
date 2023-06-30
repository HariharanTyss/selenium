package webElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Displayed {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		boolean search_Displayed = driver.findElement(By.cssSelector("input[class='button-1 search-box-button']")).isDisplayed();
		System.out.println(search_Displayed);
		
		boolean radio_Button_Displayed = driver.findElement(By.id("pollanswers-3")).isDisplayed();
		System.out.println(radio_Button_Displayed);
		
		driver.quit();
	}
}
