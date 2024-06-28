package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) {
		// JavaScriptExecutor -- Interface -- executeScript()
		//to execute the JavaScript on the browser -- JS
		//toString() -- convert Javascript text to the Java String
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
	//	driver.get("https://classic.freecrm.com/");
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		String title = js.executeScript("return document title").toString(); 
//		System.out.println(title);
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
//		String title = jsUtil.getTitleByJS();
//		System.out.println(title);
//		
//		String URL = jsUtil.getURLByJS();
//		System.out.println(URL);
//		
//		jsUtil.generateJSAlert("Landed on Login Page");
		
//		String pageText = jsUtil.getPageInnerText();   // use cases: used for content testing
//		System.out.println(pageText);
//		
//		System.out.println(pageText.contains("Calls & Voice"));
		
	//	jsUtil.scrollPageDown();
	//	jsUtil.scrollPageDown("300");
		
		WebElement about = driver.findElement(By.linkText("About Us"));
	//	jsUtil.scrollIntoView(about);
//		about.click();
		
//		jsUtil.drawBorder(about);
		
//		jsUtil.flash(about);
//		about.click();
		
		jsUtil.clickElementByJS(about);
		
		//shadowDOM
		// Psuedo element
	}
	
	

}
