package assignment_Select_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Index_Of_Available_Item {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		WebElement dropDown = driver.findElement(By.id("products-orderby"));
		Select sel = new Select(dropDown);
		List<WebElement> list = sel.getOptions();
		String value = "Name: Z to A";
		for (int i = 0; i < list.size(); i++) {
			
			WebElement dropDown2 = driver.findElement(By.id("products-orderby"));
			Select sel2 = new Select(dropDown2);
			if (list.get(i).getText().equalsIgnoreCase(value)) {
				sel2.selectByIndex(i);
				System.out.println(i);
				break;
			}
			Thread.sleep(1000);
		}
		driver.quit();
	}
}
