package mytests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangehrmTest extends BaseTest{

	@Test(description = "checking Login page title...")
	public void orangeHRMTitleTest() {
		String title = driver.getTitle();
		System.out.println("page title : " + title);
		Assert.assertEquals(title, "Get in Touch with OrangeHRM Sales | OrangeHRM", "====title is not matched===");
	}
	
	@Test(description = "checking Login page URL...")
	public void orangeHRMURLTest() {
		String url = driver.getCurrentUrl();
		System.out.println("page URL : " + url);
		Assert.assertTrue(url.contains("contact-sales"), "===url is not matched===");
	}
	
}
