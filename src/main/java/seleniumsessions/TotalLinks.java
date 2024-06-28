package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {
//total links
	//fetch the text of each link (if text is present)
	//check link is valid/not broken
	
	static WebDriver driver;
	static int visibleTextCount = 0;
	static int enableTextCount = 0;
	
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");

		//htmltag = <a>
		
//		List<WebElement> linkList = driver.findElements(By.tagName("a"));
//		System.out.println("Total Links : " + linkList.size());
//		
//		for(int i=0; i<linkList.size(); i++) {
//			String list = linkList.get(i).getText();
//			if(list.length()!=0) {
//				System.out.println(list);
//			}
//		}
//		
//		System.out.println("-------------");
//		
//		for(WebElement e: linkList) {
//			String text = e.getText();
//			if(text.length()!=0) {
//				System.out.println(text);
//			}
//		}
		
		By links = By.tagName("a");
		By images = By.tagName("img");
		
		System.out.println("Total links : " + getElementsCount(links));
		System.out.println("Total Images : " + getElementsCount(images));
		
		List<String> linkText = getElementsTextList(links);
		System.out.println(linkText);
		
		System.out.println("Links visible with Text Count are : " + visibleTextCount);
		System.out.println("Links are not visible with Text Count are : " + enableTextCount);
		
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}
	
	
	//WAF: to fetch text of each link, store it in some list and return
	//name: getElementTextList
	//param: By locator
	//return: List<String>
	
	public static List<String> getElementsTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();
		
		
		for(WebElement e : eleList) {
			String text = e.getText();
			if(!text.isBlank() && text.length()!=0) {
				eleTextList.add(text);
				visibleTextCount++;
			}
			else {
				enableTextCount++;
			}
		}
		return eleTextList;
	}
}
