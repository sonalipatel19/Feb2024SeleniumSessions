package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisabled {
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/register/");
		
		By submitButton = By.id("submitButton");
		By agree = By.name("agreeTerms");
		
		boolean b1 = driver.findElement(submitButton).isDisplayed();
		System.out.println(b1);
		
		boolean b2 = driver.findElement(submitButton).isEnabled();
		System.out.println(b2);
		
		boolean f1 = driver.findElement(agree).isSelected();
		System.out.println(f1);
		
		driver.findElement(agree).click();
		
		boolean f2 = driver.findElement(agree).isSelected();
		System.out.println(f2);
		
		boolean b3 = driver.findElement(submitButton).isDisplayed();
		System.out.println(b3);
		
		boolean b4 = driver.findElement(submitButton).isEnabled();
		System.out.println(b4);
	}

}
