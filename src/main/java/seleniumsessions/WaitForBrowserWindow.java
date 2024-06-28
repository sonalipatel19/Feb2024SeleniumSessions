package seleniumsessions;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForBrowserWindow {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");// parent
		
		By twitter = By.xpath("//a[contains(@href, 'twitter')]");
		
		ElementUtil el = new ElementUtil(driver);
		el.clickWhenReady(twitter, 10);
		
		if(waitForWindowsToBe(2, 5)) {
			Set<String> handles = driver.getWindowHandles();
			
			Iterator<String> it = handles.iterator();
			String parentWindowId = it.next();
			System.out.println("parent window id is : " + parentWindowId);
			
			String childWindowId = it.next();
			System.out.println("child window id is : " + childWindowId);
			
			driver.switchTo().window(childWindowId);
			System.out.println(driver.getCurrentUrl());
			
			driver.close(); // driver is lost. // NoSuchWindowException
			
			driver.switchTo().window(parentWindowId);
			System.out.println(driver.getCurrentUrl());
			
			driver.quit();
		}

	}
	
	public static boolean waitForWindowsToBe(int totalWindows, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.numberOfWindowsToBe(totalWindows));	
	}

}
