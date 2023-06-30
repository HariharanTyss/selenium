package Handling_Multiple_Window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Multiple_Windows {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/chand/Downloads/MultipleWindow.html");
		
		//Identify the parent window
		String parent_Window = driver.getWindowHandle();
		System.out.println(parent_Window);//42A2648E4B34C23A6E691793B44BEA2D//ID of parent window
		
		// click on food sites button which will open the child windows
		driver.findElement(By.cssSelector("input[type='button']")).click();
		Thread.sleep(2000);
		
		//Get the child windows along with parent window
		Set<String> child_Windows = driver.getWindowHandles();
		System.out.println(child_Windows);
		
		//Close all the windows one by one
		for (String string : child_Windows) {
			driver.switchTo().window(string);
			driver.close();
			Thread.sleep(1000);
		}
	}
}