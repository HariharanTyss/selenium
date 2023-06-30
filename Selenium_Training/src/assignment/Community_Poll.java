package assignment;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Community_Poll {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = null;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number from 1 to 4");
		int num = s.nextInt();
		switch (num) {
		case 1:{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			Thread.sleep(1000);
			WebElement radioButton1 = driver.findElement(By.id("pollanswers-1"));
			if (radioButton1.isDisplayed()) {
				radioButton1.click();
				System.out.println(radioButton1.isSelected());
			}
			break;
		}
		case 2:{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			Thread.sleep(1000);
			WebElement radioButton2 = driver.findElement(By.id("pollanswers-2"));
			radioButton2.click();
			System.out.println(radioButton2.isSelected());
			break;
		}
		case 3:{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			Thread.sleep(1000);
			WebElement radioButton3 = driver.findElement(By.id("pollanswers-3"));
			radioButton3.click();
			System.out.println(radioButton3.isSelected());
			break;
		}
		case 4:{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			Thread.sleep(1000);
			WebElement radioButton4 = driver.findElement(By.id("pollanswers-4"));
			radioButton4.click();
			System.out.println(radioButton4.isSelected());
			break;
		}
		default :
			System.out.println("Enter a valid input");
}
		driver.quit();
	}
}
