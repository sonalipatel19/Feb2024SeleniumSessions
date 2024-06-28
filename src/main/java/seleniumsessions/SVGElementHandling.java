package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElementHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.flipkart.com/");
		driver.get("https://petdiseasealerts.org/forecast-map#/");
		
		//SVG: Scalar Vector Graphs
		// normal xpath wil not work for svg
		//syntax: //*[local-name()='svg']
		
	//	driver.findElement(By.xpath("(//*[local-name()='svg'])[1]")).click();
		Thread.sleep(2000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframes[contains(@id,'map-instance')]")));
		
		String xpathVal = "//*[local-name()='svg' and @id='map-svg']/*[name()='g' and @id='features']/*[name()='g' and @id='regions']//*[name()='path']";
		
		
		List<WebElement> stateList = driver.findElements(By.xpath("xpathVal"));
		System.out.println(stateList.size());
		
		for(WebElement e : stateList) {
			String stateName = e.getAttribute("name");
			System.out.println(stateName);
			
		}
		

	}

}
