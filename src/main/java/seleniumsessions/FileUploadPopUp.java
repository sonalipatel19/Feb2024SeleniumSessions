package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\owner\\Desktop\\images.png");
		
		//1. AutoIT - tool:windows only -- but not recommended
		//2. Sikuli -- lib: images
		//3. Robot class : Java: windows machine only -- but not recommended
		
		
		//Types of Popup:
		//1. cookies
		//2. adv pop up
		//3. browser window pop up
	}
}
