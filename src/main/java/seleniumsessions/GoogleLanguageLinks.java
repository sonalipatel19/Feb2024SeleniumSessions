package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguageLinks {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		By langLink = By.xpath("//div[@id='SIvCob']/a");
		By footerLink = By.xpath("//div[@class='KxwPGc SSwjIe']//a[@class='pHiOh']");
		
		List<WebElement> links = driver.findElements(footerLink);
		System.out.println(links.size());
		
		for(WebElement e : links) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals("Français")) {
				e.click();
				break;
			}
		}
		

	}

}
