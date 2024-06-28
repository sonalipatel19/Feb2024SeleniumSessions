package seleniumsessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcept {

static WebDriver driver;
	
	public static void main(String[] args) throws MalformedURLException {
		// go to url
		// back
		//forward
		//refresh
		
		//driver.navigate().to("https://www.amazon.com/");
		
		
		driver = new ChromeDriver();
		driver.navigate().to(new URL("https://www.google.com"));
//		driver.get("https://www.google.com");
//		
		System.out.println(driver.getTitle());
//		
//		driver.navigate().to("https://www.amazon.com/");
//		System.out.println(driver.getTitle());
//		
		//driver.navigate().back();
//		System.out.println(driver.getTitle());
//		
//		driver.navigate().forward();
//		System.out.println(driver.getTitle());
//		
//		driver.navigate().back();
//		System.out.println(driver.getTitle());
//		
//		driver.navigate().refresh(); //refresh the page
//		
		

	}

}
