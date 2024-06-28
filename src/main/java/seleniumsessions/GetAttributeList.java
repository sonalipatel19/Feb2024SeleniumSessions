package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeList {
	static WebDriver driver;
	
	public static void main(String[] args) {
		

		driver = new ChromeDriver();
		driver.get("https://flipkart.com");
		
		By images = By.tagName("img");
		By links = By.tagName("a");
		
//		getElementAttributeList(images , "src");
//		System.out.println("------------");
//		getElementAttributeList(images , "alt");
//		System.out.println("------------");
//		getElementAttributeList(images , "style");
		
		getElementAttributeList(links , "href");
		getElementAttributeList(links , "title");

	}
	
	public static List<String> getElementAttributeList(By locator , String attrName) {
		
		List<WebElement> imgList = getElements(locator);
		List<String> attrList = new ArrayList<String>();
		
		for(WebElement e : imgList) {
			String attrValue = e.getAttribute(attrName);
			if(attrValue!=null && attrValue.length()!=0) {
				attrList.add(attrValue);
				System.out.println(attrValue);
			}
		}
		return attrList;
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
}
