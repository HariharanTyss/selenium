package select_Class;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_With_Multi_Select_DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/chand/Downloads/demo.html");
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='multiple_cars']"));
		
		Select sel = new Select(dropDown);
		List<WebElement> allOptions = sel.getOptions();
		
		for (WebElement webElement : allOptions) {
			if (!(webElement.getText().equalsIgnoreCase("Select car:"))) {
				String text = webElement.getText();
				sel.selectByVisibleText(text);
				Thread.sleep(1000);
				System.out.println(text);	
			}
		}
		System.out.println("==========================");
		System.out.println(sel.getFirstSelectedOption().getText());
		sel.deselectAll();
		driver.quit();
	}
}