package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		//driver.get("https://www.google.com/");
		
		//By search = By.name("q");
		//By suggestionList = By.xpath("//ul[@class='G43f7e']//div[@class='wM6W7d']/span");
		
		driver.get("https://www.flipkart.com/");
		By search = By.name("q");
		By suggList = By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']//div[@class='YGcVZO _2VHNef']");
		
		doSearch(search , "Macbook" , suggList , "macbook pro");
	}
	
	public static void doSearch(By locator , String searchKey , By suggestion , String value) throws InterruptedException {
		driver.findElement(locator).sendKeys(searchKey);
		
		Thread.sleep(2000);
		
		List<WebElement> list = driver.findElements(suggestion);
		System.out.println(list.size());
		
		for(WebElement e : list) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals(value)) {
				e.click();
				break;
			}
		}
	}

}
