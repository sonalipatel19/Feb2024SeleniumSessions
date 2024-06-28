package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextConcept {

	static WebDriver driver;
	
	public static void main(String[] args) {
		// create a webElement + perform an action
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//		WebElement header = driver.findElement(By.tagName("h2"));	
//		System.out.println(header.getText());
//		
//		String forgotpwd = driver.findElement(By.linkText("Forgotten Password")).getText();
//		System.out.println(forgotpwd);
//		
//		String para = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/p[2]")).getText();
//		System.out.println(para);
		
		By header = By.tagName("h2");
		By forgotpwd = By.linkText("Forgotten Password");
		By para = By.xpath("//*[@id=\"content\"]/div/div[1]/div/p[2]");
		
		ElementUtil elUtil = new ElementUtil(driver);
		String h = elUtil.doGetText(header);
		System.out.println(h);
		
		String f = elUtil.doGetText(forgotpwd);
		System.out.println(f);
		
		String p = elUtil.doGetText(para);
		System.out.println(p);
		
		

	}

}
