package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//1. id: unique attribute
//		driver.findElement(By.id("input-email")).sendKeys("sonali@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("test@123");
		
		
		//2. name: it can be duplicate
		//driver.findElement(By.name("email")).sendKeys("sonali@gmail.com");
		
		
		//3. class name: can be duplicate
		//driver.findElement(By.className("form-control")).sendKeys("sonali@gmail.com");
		
		
		//4. xpath: its not an attribute. xpath is the address of element in html DOM.
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("test@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("test@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
//		
		
		//5. cssSelector: its not an attribute.
//		driver.findElement(By.cssSelector("#input-email")).sendKeys("sonali@gmail.com");
//		driver.findElement(By.cssSelector("#input-password")).sendKeys("test@123");
//		driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input")).click();
		
		//6. linkText: only for links. htmltag = <a>
		//driver.findElement(By.linkText("Register")).click();
		
		//7. partial linkText: only for links. htmltag = <a>
		//driver.findElement(By.partialLinkText("Delivery")).click();
		
		//8. TagName: html tag
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		
	}

}
