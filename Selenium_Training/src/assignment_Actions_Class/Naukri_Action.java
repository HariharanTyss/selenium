package assignment_Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Naukri_Action {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		Actions action = new Actions(driver);
		WebElement jobs = driver.findElement(By.xpath("(//a[contains(class,'')])[2]"));
		action.moveToElement(jobs).perform();
		Thread.sleep(1000);
		
		WebElement jobs_By_Skills = driver.findElement(By.xpath("//div[text()='Jobs by skill']"));
		action.moveToElement(jobs_By_Skills).click().perform();
		Thread.sleep(1000);
		
		WebElement software_Testing_Jobs = driver.findElement(By.xpath("//a[contains(text(),'Software Testing Jobs')]"));
		action.moveToElement(software_Testing_Jobs).click().perform();
	}
}
