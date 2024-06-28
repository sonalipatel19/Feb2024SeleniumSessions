package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMElementInsideIframeHandle {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/shadow-dom-in-iframe/");
		
		Thread.sleep(2000);
		
		driver.switchTo().frame("pact");
		
		String jsScript = "return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")";
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement tea = (WebElement)js.executeScript(jsScript);
		tea.sendKeys("Masala Tea");

		
		String lunchJs = "return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
		
		WebElement lunchTime = (WebElement)js.executeScript(lunchJs);
		lunchTime.sendKeys("pizza");
	}

}
