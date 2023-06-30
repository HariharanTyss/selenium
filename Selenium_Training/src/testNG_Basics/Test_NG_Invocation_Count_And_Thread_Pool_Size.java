package testNG_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//Here threadPoolSize means , at a time how many browsers will get opened to execute the test case
//We can use maximum (invocationCount-1) Threads, otherwise some browsers will not get close
//And invocationCount means, how many times we want to execute our test case

public class Test_NG_Invocation_Count_And_Thread_Pool_Size {

	@Test(threadPoolSize = 5,invocationCount = 10)
	public void LaunchDWS() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.quit();
	}
}
