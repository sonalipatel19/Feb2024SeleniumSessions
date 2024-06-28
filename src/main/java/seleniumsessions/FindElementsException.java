package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsException {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		driver.findElement(By.id("input-email111")).sendKeys("test@gmail.com");//NSE
		
		List<WebElement> links = driver.findElements(By.xpath("//a[@class='list-group-item']"));
		
		System.out.println(links.size());//0
		
		//findElements - return List<WebElement>, findElement - return WebElement
		//findElements - doesnot show exception and size will be zero, findElement - if locator is wrong we get NSE
	}

}
