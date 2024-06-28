package seleniumsessions;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickConcept {
	
	//right click --> also called context click

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		By rightClickMe = By.xpath("//span[text()='right click me']");
		
		Actions act = new Actions(driver);
		act.contextClick(driver.findElement(rightClickMe)).perform();
		
		List<WebElement> optionList = driver.findElements(By.cssSelector("ul.context-menu-list > li.context-menu-icon > span"));
		
		for(WebElement e: optionList) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals("Copy")) {
				e.click();
				break;
			}
		}
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
	}

}
