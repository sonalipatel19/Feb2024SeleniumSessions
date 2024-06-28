package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PseudoElementHandle {

	public static void main(String[] args) {

		//Pseudo classes: are classes in DOM 
		//::Before
		//::After
		//::Has
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		String firstNameJS = "return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"), '::before').getPropertyValue('content')";
		String firstNameColor = "return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"), '::before').getPropertyValue('color')";
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String mand_field = js.executeScript(firstNameJS).toString();
		System.out.println(mand_field);
		if(mand_field.contains("*")) {
			System.out.println("first name is mandatory field");
		}

		String color = js.executeScript(firstNameColor).toString();
		System.out.println(color);
		if(color.contains("rgb(255, 0, 0)")) {
			System.out.println("first name field is with red color");
		}
	}

}
