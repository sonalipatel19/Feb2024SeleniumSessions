package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowTabConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");// parent
		
		Thread.sleep(2000);
		String parentwindowId = driver.getWindowHandle();
		//selenium 4.x:
		
		//driver.switchTo().newWindow(WindowType.TAB); // create a new blank tab and switch to it also
		driver.switchTo().newWindow(WindowType.WINDOW); // create a new blank window and switch to it also
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentwindowId);
		System.out.println(driver.getTitle());
		
	}

}
