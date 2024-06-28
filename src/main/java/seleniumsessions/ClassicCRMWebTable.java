package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassicCRMWebTable {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {


		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("apiautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();
		
		//driver.findElement(By.xpath("//a[text()='Mustafa Hanif']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
		
		selectUserName("Mustafa Hanif");
		//selectLastUserName("Pooja Khatiyan", 2);
		selectMultiUserName("Pooja Khatiyan");
		
	//	(//a[text()='Rakesh King']/parent::td/following-sibling::td)[last()-1]/a
		//a[text()='Rakesh King']/parent::td/following-sibling::td/a[contains(@href,'mailto:')]

	}
	public static void selectUserName(String userName) {
		driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
	}
	
	// (//a[text()='Pooja Khatiyan']/parent::td/preceding-sibling::td/input[@type='checkbox'])[2]
	public static void selectLastUserName(String userName, int index) {
		if(index>0) {
		driver.findElement
		(By.xpath("(//a[text()='"+userName+"']/parent::td/preceding-sibling::td/input[@type='checkbox'])["+index+"]"))
		.click();
		}
	}
	
	public static String getCompanyName(String userName) {
		return driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td/following-sibling::td/a[@context='company']")).getText();
	}
	
	public static void selectMultiUserName(String userName) {
		List<WebElement> usersCheckList = driver.findElements
			(By.xpath("//a[text()='"+userName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']"));
		for(WebElement e : usersCheckList) {
			e.click();
		}
	}
}
