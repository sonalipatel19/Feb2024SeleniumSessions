package mytests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

//AAA - Arrange Act Assert
public class OpenCartLoginTest extends BaseTest{
	
	@Test(description = "checking Login page title...")
	public void loginPageTitleTest() {
		String title = driver.getTitle();
		System.out.println("page title : " + title);
		Assert.assertEquals(title, "Account Login", "====title is not matched===");
	}
	
	@Test(description = "checking Login page URL...")
	public void loginPageURLTest() {
		String url = driver.getCurrentUrl();
		System.out.println("page URL : " + url);
		Assert.assertTrue(url.contains("route=account/login"), "===url is not matched===");
	}
	
	@Test(description = "checking Logo is present on the page...")
	public void loginPageLogoTest() {
		boolean flag = driver.findElement(By.cssSelector("img.img-responsive")).isDisplayed();
		Assert.assertEquals(flag, true, "===logo is missing===");
	}
	
	
	
	
	
	
	
	

}
