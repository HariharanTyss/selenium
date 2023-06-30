package assignment_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_Web_Shop_Dropdown {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		WebElement dropDown = driver.findElement(By.id("products-orderby"));
		Select sel = new Select(dropDown);
		sel.selectByValue("https://demowebshop.tricentis.com/books?orderby=10");
		Thread.sleep(2000);
		
		WebElement dropDown2 = driver.findElement(By.id("products-pagesize"));
		Select sel2 = new Select(dropDown2);
		sel2.selectByIndex(2);
		Thread.sleep(2000);
		
		WebElement dropDown3 = driver.findElement(By.id("products-viewmode"));
		Select sel3 = new Select(dropDown3);
		sel3.selectByVisibleText("List");
		Thread.sleep(2000);
		driver.quit();
}
}
