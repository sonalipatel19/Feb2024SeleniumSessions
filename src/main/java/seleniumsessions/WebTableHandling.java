package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {


		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(2000);
		
		//driver.findElement
		//(By.xpath("//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
		
//		selectUserName("Kevin.Mathews");
//		selectUserName("Joe.Root");
		
		getUserDataList("Kevin.Mathews");
		//getUserDataList("Joe.Root");
		
	}

	public static void selectUserName(String userName) {
		driver.findElement(By.xpath("//a[text()='"+userName+"']/ancestor::tr//input[@type='checkbox']")).click();
	}
	
	public static void getUserDataList(String userName) {
		List<WebElement> list = driver.findElements(By.xpath("//a[text()='"+userName+"']/parent::td/following-sibling::td"));
		//List<String> dataList = new ArrayList<String>();
		
		for(WebElement e : list) {
			String text = e.getText();
			//dataList.add(text);
		}
		//return dataList;
	}
}
