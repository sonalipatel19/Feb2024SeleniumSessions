package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeValue {

static WebDriver driver;
	
	public static void main(String[] args) {
		// create a webElement + perform an action
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By forgotpwd = By.linkText("Forgotten Password");
		By emailId = By.id("input-email");
		
//		String hrefvalue = driver.findElement(forgotpwd).getAttribute("href");
//		System.out.println(hrefvalue);
//		
//		String placeholdervalue = driver.findElement(emailId).getAttribute("placeholder");
//		System.out.println(placeholdervalue);
//		
//		driver.findElement(emailId).sendKeys("test@gmail.com");
//		String email = driver.findElement(emailId).getAttribute("value");
//		System.out.println(email);
		
		ElementUtil elUtil = new ElementUtil(driver);
		String p = elUtil.doGetAttribute(emailId, "placeholder");
		System.out.println(p);
		
		elUtil.doSendKeys(emailId, "test@gmail.com");
		String e = elUtil.doGetAttribute(emailId, "value");
		System.out.println(e);
		
	}
	
	
}
