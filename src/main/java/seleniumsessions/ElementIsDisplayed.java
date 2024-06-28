package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisplayed {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By email = By.id("input-email");
		By logo = By.className("img-responsive");
		By forgotPwdLink = By.linkText("Forgotten Password");
		
//		boolean flag = driver.findElement(By.id("input-email")).isDisplayed();
//		System.out.println(flag);
		
//		if(doIsDisplayed(email)) {
//			System.out.println("PASS");
//		}
//		else {
//			System.out.println("FAIL");
//		}
		
//		List<WebElement> emailList = driver.findElements(email);
//		
//		if(emailList.size()==1) {
//			System.out.println("email id is present on the page");
//		}
//		else {
//			System.out.println("email id is coming more than two times");
//		}
		
		System.out.println(isElementDisplayed(logo));
		System.out.println(isElementDisplayed(forgotPwdLink, 2));
	}
	
	public static boolean isElementDisplayed(By locator) {
		int elementCount = driver.findElements(locator).size();
		if(elementCount == 1) {
			System.out.println("single element is displayed : " + locator);
			return true;
		}
		else {
			System.out.println("multiple or zero elements are displayed : " + locator);
			return false;
		}
	}
	
	public static boolean isElementDisplayed(By locator , int expectedElementCount) {
		int elementCount = driver.findElements(locator).size();
		if(elementCount == expectedElementCount) {
			System.out.println("element is displayed : " + locator + " with the occurrence of " + elementCount);
			return true;
		}
		else {
			System.out.println("multiple or zero elements are displayed : " + locator);
			return false;
		}
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static boolean doIsDisplayed(By locator) {
		try {
		boolean flag = getElement(locator).isDisplayed();
		System.out.println("element is displayed : " + locator);
		return flag;
		}
		catch(NoSuchElementException e) {
			System.out.println("element with locator : " + locator + " is not displayed");
			return false;
		}
	}
		
}
