package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownHandling {
	static WebDriver driver;
	public static void main(String[] args) {
		// html <select> tag
		// without select tag
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales/");
		
		By country = By.id("Form_getForm_Country");
		By employee = By.id("Form_getForm_NoOfEmployees");
		
		Select select_country = new Select(driver.findElement(country));
//		select_country.selectByIndex(5);
//		select_country.selectByIndex(15);
		
		//select_country.selectByVisibleText("Belgium");
		
//		select_country.selectByValue("Belgium");// if value is not present then we get NoSuchElementException
//		
//		Select select_employee = new Select(driver.findElement(employee));
//		
//		select_employee.selectByVisibleText("76 - 100");

		doSelectByIndex(country, 4);
		doSelectByVisibleText(employee, "76 - 100");
		

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static void doSelectByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	public static void doSelectByVisibleText(By locator, String visibleText) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibleText);
	}

}
