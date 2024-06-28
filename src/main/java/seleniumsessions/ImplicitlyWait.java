package seleniumsessions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait {

	public static void main(String[] args) throws InterruptedException {

		//sync concept:
		
		//Thread.sleep(10000); // static wait/hard wait -- coming from Java
		
		//dynamic wait: 
		//1. Implicitly wait:
				// global wait: it will be applied for all the web elements by default
		//2. Explicitly wait
			//2.a: WebDriverWait
			//2.b: FluentWait
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // sel 3.x
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		//drawback:
		//implicitly wait can not be used for non webElements: url, title, alerts
		// we have to change the wait time for every web page
		// it will applied to all the web elements where we not have to used.
		
		
		
		
		
		
		
		

	}

}
