package testNG_Basics;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//Helper attribute "dependsOnMethods", Here we can pass more than 
//one methods as dependsOn by using {} braces

public class Test_NG_DependsOnMethod_Functionality {

	@Test(dependsOnMethods = {"LoginTest","RegisterTest"})
	public void SearchTest() {
		System.out.println("Executing Search");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.quit();
	}
	
	@Test(dependsOnMethods = "RegisterTest")
	public void LoginTest(){
		System.out.println("Executing Login");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys("nikhil26@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("nikhil123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		System.out.println(driver.findElement(By.xpath("(//a[@class='account'])[1]")).getText());
		driver.quit();
	}
	
	@Test
	public void RegisterTest() {
		System.out.println("Executing Register");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Random r = new Random();
		int num = r.nextInt(100);
		String email = "ramsetu"+num+"@gmail.com";
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Ram");
		driver.findElement(By.id("LastName")).sendKeys("Setu");
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys("RamSetu");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("RamSetu");
		driver.findElement(By.id("register-button")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@class='page registration-result-page']")).getText());
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		driver.quit();
	}
}
