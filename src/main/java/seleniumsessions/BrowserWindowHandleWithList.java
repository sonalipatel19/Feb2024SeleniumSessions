package seleniumsessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleWithList {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");// parent
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(@href, 'twitter')]")).click();// child
		
		
		//1. fetch the windows ids:
		Set<String> handles = driver.getWindowHandles();
		
		// converting set into list
		List<String> handleList = new ArrayList<String>(handles);
		String parentWindowId = handleList.get(0);
		System.out.println(parentWindowId);
		
		String childWindowId = handleList.get(1);
		System.out.println(childWindowId);
		
		//2. switching work:
		
		driver.switchTo().window(childWindowId);
		System.out.println(driver.getCurrentUrl());
				
		driver.close(); // driver is lost. // NoSuchWindowException
				
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getCurrentUrl());
				
		//driver.quit();
		
		
	}

}
