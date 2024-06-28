package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// java + selenium code(4.x) 
		
		//Automation Steps:
		//Open the browser:
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new EdgeDriver();
		
		//enter the url:
		driver.get("https://www.google.com");
		
		//get the title:
		String title = driver.getTitle();
		System.out.println("page title : " + title);
		
		//validation point// checkpoint// verification point
		if(title.equals("Google")) {
			System.out.println("title is correct");
		}else {
			System.out.println("title is not correct");
		}
		
		//Automation Steps + validation points = Automation testing
		
		//get the url:
		String url = driver.getCurrentUrl();
		System.out.println("page url :" + url);
		
		if(url.contains("google.com")) {
			System.out.println("url is correct");
		}else {
			System.out.println("url is not correct");
		}
		
		//close the browser:
		//driver.quit(); // quit all the browser
	    driver.close(); // close the current browser page
		

	}

}
