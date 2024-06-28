package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorsConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.linkText("Red Deer, Canada"));
		
		String leftRank = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(leftRank);
		
		String agiScore = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(agiScore);
		
		String cityName = driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(cityName);
		
		String abovecity = driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(abovecity);
		
		String nearcity = driver.findElement(with(By.tagName("p")).near(ele)).getText();
		System.out.println(nearcity);
		
		
		
		
		
		
	}

}
