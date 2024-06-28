package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWaitConcept {
	static WebDriver driver;
	public static void main(String[] args) {

		//Wait(I) - until(): - abstract method
			//implemented by FluentWait(C) -- methods(){}
							//extended by WebDriverWait(C) --> Inherited methods + individual methods
	
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//Dont mix imp wait and exp wait.
		
		By email = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//input[@value='Login']");
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement emailEle = wait.until(ExpectedConditions.presenceOfElementLocated(email));
//		emailEle.sendKeys("test@gmail.com");
//		
//		getElement(password).sendKeys("test@123");
//		getElement(loginBtn).click();
		
//		waitForElementPresence(email, 10).sendKeys("test@gmail.com");
//		getElement(password).sendKeys("test@123");
//		waitForElementPresence(loginBtn, 5).click();
//		
	//	waitForElementVisible(loginBtn, 5).click();
		
		ElementUtil elUtil = new ElementUtil(driver);
		elUtil.doSendKeysWithWait(email, "sona@gmail.com", 5);
		elUtil.doSendKeys(password, "sona@123");
		elUtil.doClickWithWait(loginBtn, 5);
		
		
		
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	/**
	 * An expectation for checking that an element is present on the DOM of a page. 
	 * This does not necessarily mean that the element is visible.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public static WebElement waitForElementPresence(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	/**
	 * An expectation for checking that an element is present on the DOM of a page and visible.
	 * Visibility means that the element is not only displayed but also has a height and width that is greater than 0.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public static WebElement waitForElementVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

}
