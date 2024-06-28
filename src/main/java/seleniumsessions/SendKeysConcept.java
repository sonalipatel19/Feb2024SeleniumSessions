package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		//driver.findElement(By.id("input-email")).sendKeys("sonali@gmail.com");
		//driver.findElement(By.id("input-email")).sendKeys(null);// IllegalArgumentException
		
		
		String name = "tom";
		String desg = "SDET";
		StringBuilder sb = new StringBuilder("Automation");
		StringBuffer sf = new StringBuffer("Selenium");
		
		driver.findElement(By.id("input-email")).sendKeys(name , " " , desg, "Google", sb , sf);
		
		//use case for sendKeys:
		
		//address field: arpt name, block, flat name
	}
}
