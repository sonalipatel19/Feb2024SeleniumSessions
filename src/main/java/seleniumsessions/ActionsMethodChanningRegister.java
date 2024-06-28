package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethodChanningRegister {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		
//		WebElement firstName = driver.findElement(By.id("input-firstname"));
//		
//		Actions act = new Actions(driver);
//		
//		act.sendKeys(firstName, "Amit")
//			.sendKeys(Keys.TAB)
//			.pause(1000)
//				.sendKeys("Sharma")
//				.sendKeys(Keys.TAB)
//				.pause(1000)
//					.sendKeys("amit@gmail.com")
//					.sendKeys(Keys.TAB)
//					.pause(1000)
//						.sendKeys("1234569870")
//						.sendKeys(Keys.TAB)
//						.pause(1000)
//							.sendKeys("amit@123")
//							.sendKeys(Keys.TAB)
//							.pause(1000)
//								.sendKeys("amit@123")
//								.pause(1000)
//									.sendKeys(Keys.TAB)
//									.pause(1000)
//									.sendKeys(Keys.TAB)
//									.pause(1000)
//									.sendKeys(Keys.TAB)
//									.pause(1000)
//										.sendKeys(Keys.SPACE)
//										.sendKeys(Keys.TAB)
//										.pause(1000)
//											.sendKeys(Keys.ENTER)
//											.build().perform();
//							
// This is called Accesibility Testing.
		
		driver.get("https://www.amazon.ca/");
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys("macbook")
		.pause(1000)
		.sendKeys(Keys.ENTER)
		.build().perform();
		
	}

}
