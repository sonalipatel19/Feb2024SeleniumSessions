package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframeHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");
		
		driver.switchTo().frame("pact1");
		driver.findElement(By.id("inp_val")).sendKeys("testing");
		
		driver.switchTo().frame("pact2");
		driver.findElement(By.id("jex")).sendKeys("automation");
		
		driver.switchTo().frame("pact3");
		driver.findElement(By.id("glaf")).sendKeys("1M subs");
		
		driver.switchTo().parentFrame();//f2
		driver.findElement(By.id("jex")).sendKeys(" Selenium");
		
		driver.switchTo().parentFrame();//f1
		driver.findElement(By.id("inp_val")).sendKeys(" is love");
		
		driver.switchTo().parentFrame();// main Page
//		String text = driver.findElement(By.tagName("h3")).getText();
//		System.out.println(text);
		
		driver.switchTo().defaultContent();
		//driver.findElement(By.id("inp_val")).sendKeys("CI");//NoSuchElementException
		String text = driver.findElement(By.tagName("h3")).getText();
		System.out.println(text);
	}

}
