package webElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Text_Method {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement element = driver.findElement(By.linkText("Register"));
		String register_text  = element.getText();
		System.out.println(register_text);
		System.out.println(driver.findElement(By.partialLinkText("opp")).getText());
		
		String wishlist_Text = driver.findElement(By.partialLinkText("Wishlist")).getText();
		System.out.println(wishlist_Text);
		
		driver.quit();
	}
}
