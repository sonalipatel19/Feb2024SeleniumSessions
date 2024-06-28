package seleniumsessions;

import java.util.Properties;

public class OpenCartTest {

	public static void main(String[] args) {
		
		//String browser = "opera";
		
		ReadProperty read = new ReadProperty();
		Properties prop = read.initProp();
		
		BrowserUtil util = new BrowserUtil();
		util.launchBrowser(prop.getProperty("browser"));
		
		util.launchURL(prop.getProperty("url"));
		String actTitle = util.getPageTitle();
		System.out.println("Page Title :" + actTitle);
		
		if(actTitle.equals("Your Store")) {
			System.out.println("title is correct");
		}else {
			System.out.println("title is not correct");
		}
		
		String appUrl = util.getPageCurrentURL();
		System.out.println("Page URL : " + appUrl);
		
		if(appUrl.contains("opencart")) {
			System.out.println("URL is correct");
		}else {
			System.out.println("URL is not correct");
		}
		
		util.quitBrowser();
		

	}

}
