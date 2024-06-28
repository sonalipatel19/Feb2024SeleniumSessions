package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendKeysWithPause {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By search = By.name("search");
	//	String searchKey = "macbook";
		
		doActionsSendKeysWithPause(search, "samsung", 500);
		

	}
	
	public static void doActionsSendKeysWithPause(By locator , String value , long pauseTime) {
		Actions act = new Actions(driver);
		char ch[] = value.toCharArray();
		for(char c : ch) {
			act.sendKeys(driver.findElement(locator), String.valueOf(c)).pause(pauseTime).perform();
		}
	}
	
	public static void doActionsSendKeysWithPause(By locator , String value) {
		Actions act = new Actions(driver);
		char ch[] = value.toCharArray();
		for(char c : ch) {
			act.sendKeys(driver.findElement(locator), String.valueOf(c)).pause(500).perform();
		}
	}

}
