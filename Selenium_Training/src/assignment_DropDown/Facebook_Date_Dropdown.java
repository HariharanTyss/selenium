package assignment_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Date_Dropdown {
	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://en-gb.facebook.com/");
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	Thread.sleep(1000);
	
	WebElement dropDown_Day = driver.findElement(By.xpath("//select[@id='day']"));
	Select sel = new Select(dropDown_Day);
	System.out.println(sel.isMultiple());
	sel.selectByValue("31");
	Thread.sleep(1000);
	
	WebElement dropDown_Month = driver.findElement(By.xpath("//select[@id='month']"));
	Select sel2 = new Select(dropDown_Month);
	sel.selectByIndex(5);
	Thread.sleep(1000);
	
	WebElement dropDown_Year = driver.findElement(By.xpath("//select[@id='year']"));
	Select sel3 = new Select(dropDown_Year);
	sel.selectByVisibleText("1996");
	Thread.sleep(1000);
	}
}
