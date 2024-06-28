package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		// create a webElement + perform an action
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//1.
//		driver.findElement(By.id("input-email")).sendKeys("sonali@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("test@123");
		
		//2.
//		WebElement email = driver.findElement(By.id("input-email"));
//		WebElement pwd = driver.findElement(By.id("input-password"));
//		
//		email.sendKeys("sonali@gmail.com");
//		pwd.sendKeys("test@123");

		//3. By locator: OR (Object Repository)
//		By email = By.id("input-email");
//		By pwd = By.id("input-password");
//		
//		WebElement emailID = driver.findElement(email);
//		WebElement password = driver.findElement(pwd);
//		
//		emailID.sendKeys("sonali@gmail.com");
//		password.sendKeys("test@123");
		
		//4. By locator + generic function for webElements
//		By email = By.id("input-email");
//		By pwd = By.id("input-password");
//		
//		getElement(email).sendKeys("sonali@gmail.com");
//		getElement(pwd).sendKeys("test@123");
		
		//5. By locator + generic function for webElements and sendKeys
//		By email = By.id("input-email");
//		By pwd = By.id("input-password");
//		
//		doSendKeys(email, "sonali@gmail.com");
//		doSendKeys(pwd, "test@123");
		
		//6. By locator + generic function for webElements and sendKeys: ElementUtil
		By email = By.id("input-email");
		By pwd = By.id("input-password");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(email, "sonali@gmail.com");
		eleUtil.doSendKeys(pwd, "test@123");
		
		//7. By locator + browserUtil + ElementUtil 
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

}
