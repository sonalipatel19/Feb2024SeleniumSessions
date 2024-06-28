package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowWithMultipleTabsHandling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");// parent
		
		// window handler apis:
		//any browser: window/tab
		//advertisements
		String parentwindowId = driver.getWindowHandle();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(@href, 'linkedin')]")).click();// child
		driver.findElement(By.xpath("//a[contains(@href, 'facebook')]")).click();// child
		driver.findElement(By.xpath("//a[contains(@href, 'twitter')]")).click();// child
		driver.findElement(By.xpath("//a[contains(@href, 'youtube')]")).click();// child
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		while(it.hasNext()) {
			String windowId = it.next();
			driver.switchTo().window(windowId);
			System.out.println(driver.getTitle());
			Thread.sleep(1000);
			
			if(!parentwindowId.equals(windowId)) {
			driver.close();
			}
		}
		driver.switchTo().window(parentwindowId);
		System.out.println(driver.getTitle());
		

	}

}
