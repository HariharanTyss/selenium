package assignment_Select_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Print_All_Options_SortBy {

	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
	WebElement dropDown = driver.findElement(By.id("products-orderby"));
	Select sel = new Select(dropDown);
	List<WebElement> options =  sel.getOptions();
	for (int i = 0; i < options.size(); i++) {
		System.out.println(options.get(i).getText());
	}
	driver.quit();
	}
}
