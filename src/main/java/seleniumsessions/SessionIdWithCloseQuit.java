package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionIdWithCloseQuit {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
	
		String title = driver.getTitle();
		System.out.println("page title : " + title);

		String url = driver.getCurrentUrl();
		System.out.println("page url :" + url);
		
		//driver.quit(); // NoSuchSessionException: Session ID is null.
	    driver.close(); // NoSuchSessionException: invalid session id

	    driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
	
	    System.out.println(driver.getTitle());
	}

}
