package actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo_Drag_And_Drop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(1000);
		
		//Object creation of Actions class
		Actions action = new Actions(driver);
		
		//Performing drag and drop operation 
		action.dragAndDrop(driver.findElement(By.xpath("(//div[text()='Rome'])[2]")), driver.findElement(By.xpath("//div[text()='Italy']"))).perform();
		action.dragAndDrop(driver.findElement(By.xpath("(//div[text()='Washington'])[2]")), driver.findElement(By.xpath("//div[text()='United States']"))).perform();
		action.dragAndDrop(driver.findElement(By.xpath("(//div[text()='Seoul'])[2]")), driver.findElement(By.xpath("//div[text()='South Korea']"))).perform();
		action.dragAndDrop(driver.findElement(By.xpath("(//div[text()='Madrid'])[2]")), driver.findElement(By.xpath("//div[text()='Spain']"))).perform();
		action.dragAndDrop(driver.findElement(By.xpath("(//div[text()='Oslo'])[2]")), driver.findElement(By.xpath("//div[text()='Norway']"))).perform();
		action.dragAndDrop(driver.findElement(By.xpath("(//div[text()='Copenhagen'])[2]")), driver.findElement(By.xpath("//div[text()='Denmark']"))).perform();
		action.dragAndDrop(driver.findElement(By.xpath("(//div[text()='Stockholm'])[2]")), driver.findElement(By.xpath("//div[text()='Sweden']"))).perform();
		Thread.sleep(1000);
		
		//Performing reverse option
		action.dragAndDrop(driver.findElement(By.id("box6")), driver.findElement(By.id("capitals"))).perform();
		action.dragAndDrop(driver.findElement(By.id("box5")), driver.findElement(By.id("capitals"))).perform();
		action.dragAndDrop(driver.findElement(By.id("box7")), driver.findElement(By.id("capitals"))).perform();
		action.dragAndDrop(driver.findElement(By.id("box4")), driver.findElement(By.id("capitals"))).perform();
		action.dragAndDrop(driver.findElement(By.id("box1")), driver.findElement(By.id("capitals"))).perform();
		action.dragAndDrop(driver.findElement(By.id("box2")), driver.findElement(By.id("capitals"))).perform();
		action.dragAndDrop(driver.findElement(By.id("box3")), driver.findElement(By.id("capitals"))).perform();
		
	}
}
