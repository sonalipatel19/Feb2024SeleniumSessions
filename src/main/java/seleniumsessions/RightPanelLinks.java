package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RightPanelLinks {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By headerLinks = By.xpath("//a[@class='list-group-item']");
		By footerLinks = By.xpath("//footer//ul[@class='list-unstyled']/li");
		
		List<WebElement> links = driver.findElements(footerLinks);
		System.out.println(links.size());
		
		for(WebElement e : links) {
			String text = e.getText();
			System.out.println(text);
		}
		
		

	}

}
