package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableElementConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		By password = By.id("pass");
		By newPwd = By.id("passnew");
		
		driver.findElement(password).click(); //nothing will happen with no exception
		
		driver.findElement(password).sendKeys("test123");//ElementNotInteractableException
		
		driver.findElement(newPwd).sendKeys("test123");//ElementNotInteractableException
	
	}
}
