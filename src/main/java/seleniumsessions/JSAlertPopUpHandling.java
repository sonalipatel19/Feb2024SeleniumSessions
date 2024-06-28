package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAlertPopUpHandling {
	static WebDriver driver;
	public static void main(String[] args) {
		
		//JS alerts:
		//1. alert()
		//2. prompt()
		//3. confirm()
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		By alertButton = By.xpath("//button[text()='Click for JS Alert']");
		By confirmButton = By.xpath("//button[text()='Click for JS Confirm']");
		By promptButton = By.xpath("//button[text()='Click for JS Prompt']");
		
		//1. JS Alert:
//		driver.findElement(alertButton).click();
//		
//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println(text);
//		
//		alert.accept();//ok button
		//alert.dismiss(); //remove the alert
		
		//2. confirm alert:
		
		driver.findElement(confirmButton).click();
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		
		alert.accept();//ok button  after closing alert we try to get alert text then it will give exception
		//System.out.println(alert.getText());//NoAlertPresentException
		//alert.dismiss(); //remove the al
		
		//3. prompt alert:
		
//		driver.findElement(promptButton).click();
//				
//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println(text);
//		
//		alert.sendKeys("test automation");
//		
//		alert.accept();//ok button
//		//alert.dismiss(); //remove the al

	}

}
