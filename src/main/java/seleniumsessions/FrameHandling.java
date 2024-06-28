package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.londonfreelance.org/courses/frames/index.html");
		driver.get("https://classic.freecrm.com/");

		//driver.switchTo().frame(2);
		//driver.switchTo().frame("main");
//		driver.switchTo().frame(driver.findElement(By.name("main")));
//		
//		String header = driver.findElement(By.tagName("h2")).getText();
//		System.out.println(header);
		
		driver.findElement(By.name("username")).sendKeys("apiautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		List<WebElement> list = driver.findElements(By.xpath("//frame[@name]"));
		System.out.println(list.size());
	}

}
