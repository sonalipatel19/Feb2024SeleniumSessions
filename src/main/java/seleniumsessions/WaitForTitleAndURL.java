package seleniumsessions;

import java.time.Duration;
import org.openqa.selenium.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleAndURL {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/");
		
		By pricing = By.linkText("Pricing");
		
		ElementUtil elUtil = new ElementUtil(driver);
		elUtil.clickWhenReady(pricing, 10);
		
		String title = waitForTitleToBe("PRICING", 5);
		System.out.println(title);
		System.out.println(title.contains("PRICING"));
		
		
	}

	public static String waitForURLContains(String urlFraction, int timeOut) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		
		try {
			if(wait.until(ExpectedConditions.urlContains(urlFraction))) {
				return driver.getCurrentUrl();
			}
		} catch(TimeoutException e) {
			System.out.println("URL not Found");
		}
		return driver.getCurrentUrl();
	}
	
	public static String waitForURLToBe(String urlValue, int timeOut) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		
		try {
			if(wait.until(ExpectedConditions.urlToBe(urlValue))) {
				return driver.getCurrentUrl();
			}
		} catch(TimeoutException e) {
			System.out.println("URL not Found");
		}
		return driver.getCurrentUrl();
	}

	public static String waitForTitleContains(String titleFraction, int timeOut) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		
		try {
			if(wait.until(ExpectedConditions.titleContains(titleFraction))) {
				return driver.getTitle();
			}
		} catch(TimeoutException e) {
			System.out.println("title not Found");
		}
		return driver.getTitle();
	}

	public static String waitForTitleToBe(String titleValue, int timeOut) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		
		try {
			if(wait.until(ExpectedConditions.titleIs(titleValue))) {
				return driver.getTitle();
			}
		} catch(TimeoutException e) {
			System.out.println("title not Found");
		}
		return driver.getTitle();
	}
}
