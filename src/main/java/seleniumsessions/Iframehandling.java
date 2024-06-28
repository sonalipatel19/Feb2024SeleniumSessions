package seleniumsessions;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframehandling {
	static WebDriver driver;
	
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		
		driver.findElement(By.cssSelector("img[title='Vehicle-Registration-Forms-and-Examples']")).click();
		
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
		
		List<WebElement> list = driver.findElements(By.xpath("//iframe[@src]"));
		System.out.println(list.size());
		
		for(WebElement e: list) {
			System.out.println(e.getText());
		}
		
//		By proposalTitle = By.id("RESULT_TextField-1");
//		By location = By.cssSelector("#RESULT_TextField-3");
//		By proposedDate = By.cssSelector("#RESULT_TextField-4");
//		By description = By.cssSelector("#RESULT_TextArea-5");
//		By upLoadFile = By.cssSelector("#RESULT_FileUpload-6");
//		By firstName = By.xpath("//input[@name='RESULT_TextField-8']");
//		By lastName = By.name("RESULT_TextField-9");
//		By address = By.name("RESULT_TextField-10");
//		By city = By.name("RESULT_TextField-12");
//		By state = By.id("RESULT_RadioButton-13");
//		By zipCode = By.id("RESULT_TextField-14");
//		By phoneNumber = By.id("RESULT_TextField-15");
//		By email = By.id("RESULT_TextField-16");
//		By submitBtn = By.xpath("//input[@class='submit_button']");
//		
//		
//		doSendKeys(proposalTitle, "Vehicle Issue");
//		doSendKeys(location, "Canada");
//		doSendKeys(proposedDate, "01/01/2000");
//		doSendKeys(description, "Car breaks fails");
//		doSendKeys(upLoadFile, "C:\\Users\\owner\\Desktop\\images.png");
//		doSendKeys(firstName, "Sonali");
//		doSendKeys(lastName, "Patel");
//		doSendKeys(address, "Durango Drive");
//		doSendKeys(city, "Ottawa");
//		getListOfDropDownCount(state , "Florida");
//		doSendKeys(zipCode, "369852");
//		doSendKeys(phoneNumber, "1234569874");
//		doSendKeys(email, "sonali@gmail.com");
//		doClick(submitBtn);
		
		
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator , String value) {
		driver.findElement(locator).sendKeys(value);
	}
	
	public static void doClick(By locator) {
		driver.findElement(locator).click();
	}
	
	public static void doSelectByVisibleText(By locator , String visibleText) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibleText);
	}
	
	public static void getListOfDropDownCount(By locator , String value) {
		Select select = new Select(getElement(locator));
		List<WebElement> listCount = select.getOptions();
		
		for(WebElement e : listCount) {
			String text = e.getText();
			if(text.equals(value)) {
				e.click();
				break;
			}
		}
	}
}
