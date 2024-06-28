package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTest {

	//static WebDriver driver;
	
	public static void main(String[] args) {
		
		BrowserUtil util = new BrowserUtil();
		WebDriver driver = util.launchBrowser("chrome");
		
		util.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		System.out.println(util.getPageTitle());
		System.out.println(util.getPageCurrentURL());

		By email = By.id("input-email");
		By pwd = By.id("input-password");
		
		ElementUtil ele = new ElementUtil(driver);
		ele.doSendKeys(email, "sonali@gmail.co");
		ele.doSendKeys(pwd, "test@123");
		
		util.closeBrowser();

	}

}
