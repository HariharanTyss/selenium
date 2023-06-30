package assignment_Window_Handle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo_Web_FB_Window_handle_Get_Back_Parent {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//Perform page down operation to reach to Facebook link
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		
		//Get ID of parent window
		String parent_Window = driver.getWindowHandle();
		System.out.println(parent_Window);
		
		//Get ID of all the Windows
		Set<String> all_Windows = driver.getWindowHandles();
		Thread.sleep(1000);
		System.out.println(all_Windows);
		
		for (String string : all_Windows) {
			driver.switchTo().window(string);
			Thread.sleep(2000);
			if (!(string.equals(parent_Window))) {
				driver.close();
			}
		}
		driver.switchTo().window(parent_Window);
		driver.findElement(By.id("small-searchterms")).sendKeys("Mobiles");
		driver.findElement(By.cssSelector("input[value='Search']")).click();
		
}

}
