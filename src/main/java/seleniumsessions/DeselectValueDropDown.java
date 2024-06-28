package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectValueDropDown {

	static WebDriver driver;
	public static void main(String[] args) {
		// html <select> tag
		// without select tag
		
		driver = new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");
		
		Select select = new Select(driver.findElement(By.xpath("//*[@id=\"post-291\"]/div/div[2]/select")));
		System.out.println(select.isMultiple());
		
		if(select.isMultiple()) {
			select.selectByVisibleText("American flamingo");
			select.selectByVisibleText("Andean flamingo");
			select.selectByVisibleText("James's flamingo");       
		}
		
		//select.deselectAll();
		
		select.deselectByVisibleText("James's flamingo");
	}

}
