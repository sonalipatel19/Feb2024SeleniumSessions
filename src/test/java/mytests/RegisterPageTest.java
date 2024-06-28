package mytests;

import java.util.UUID;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterPageTest extends BaseTest{
	
	public static String getRandomEmailId() {
		String emailId = "opencart"+ System.currentTimeMillis() +"@gmail.com";
		//String emailId = "opencart"+ UUID.randomUUID() +"@gmail.com";
		return emailId;
	}

	
	@DataProvider
	public Object[][] getRegTestData() {
		return new Object[][] {
			{"Sonali", "Patel", "1234567890", "sonali@123"},
			{"Parth", "Patel", "4569872154", "parth@123"},
			{"Hiten", "Patel", "9897548212", "hiten@123"}
		};
	}
	
	
	@Test(dataProvider = "getRegTestData")
	public void registerTest(String firstName, String lastName, String telephone, String pwd) {
		driver.findElement(By.id("input-firstname")).sendKeys(firstName);
		driver.findElement(By.id("input-lastname")).sendKeys(lastName);
		driver.findElement(By.id("input-email")).sendKeys(getRandomEmailId());
		driver.findElement(By.id("input-telephone")).sendKeys(telephone);
		driver.findElement(By.id("input-password")).sendKeys(pwd);
		driver.findElement(By.id("input-confirm")).sendKeys(pwd);
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		String text = driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
		System.out.println(text);
		Assert.assertEquals(text, "Your Account Has Been Created!");
		
		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.linkText("Register")).click();
	}
}
