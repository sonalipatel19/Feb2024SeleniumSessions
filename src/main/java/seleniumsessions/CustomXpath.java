
package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		//xpath: address of the element in the html dom
		//1. Absolute xpath: 
		//2. Relative xpath:
		//xpath axes: relationship: parent, child, siblings
		//function
		
		//simple formula of xpath: 
		//htmltag[@attributeName='attributeValue']
		//input[@id='input-email']
		//input[@name='email']
		//input[@placeholder='E-Mail Address']
		
		//input --6 --FEs
		//input[@id]
		
		//htmltag[@attr1='value1' and @attr2='value2']
		//htmltag[@id='input-email' and @placeholder='E-Mail Address' and @name='email']
		//htmltag[@id='input-email' and @placeholder='E-Mail Address' and @name]
		//htmltag[@id and @placeholder and @name]
		
		//htmltag[@attr1='value1' or @attr2='value2']
		//htmltag[@type='text' or @type='email' or @name='search']
		
		//*[@attr1='value1']
		//*[@type='text']
		
		//text in xpath:
		//htmltag[text()='value']
		//h1[text()='Register Account']
		//legend[text()='Your Personal Details']
		//a[text()='My Account']
		
		//contains() in xpath:
		//htmltag[contains(@attr,'value')]
		//input[contains(@id,'input')]
		//input[contains(@placeholder,'E-Mail')]
		
		//htmltag[contains(@attr,'value') and @attr2='value']
		//input[contains(@placeholder,'E-Mail') and @name='email']
		
		//htmltag[contains(@attr,'value') and contains(@attr2='value')]
		//input[contains(@placeholder,'E-Mail') and contains(@name='email')]
		
		//dynamic elements with dynamic attributes
		// <input id=firstname_1234/>
		// <input id=firstname_2344/>
		// <input id=firstname_44455/>
		//By.id("firstname_1234");
		
		//input[contains(@id,'firstname_')]
		
		//contains() with text();
		//htmltag[contains(text(),'value')]
		//h2[contains(text(),'customer')]
		//p[contains(text(),'By creating an account')]
		//a[contains(text(),'Address') and @class='list-group-item']
		
		//starts-with() in xpath:
		//htmltag[starts-with(@attr,'value')]
		//a[starts-with(@id,'firstname_')]
		//input[starts-with(@placeholder,'E-Mail')]
		//input[starts-with(@placeholder,'E-Mail') and contains(@name,'email')]
		
		//starts-with() with text():
		//htmltag[starts-with(text(),'value')]
		//p[starts-with(text(),'By creating')]
		
		//ends-with is not available with xpath
		
		//indexing in xpath:
		//htmltag[@attr='value'][index]
	//	(//a[text(),'Forgotten Password'])[2]
	//	(//input[@id])[1]
		
		//position():
		// (//input[@id])[position()=1]
		
		//last():
		// (//input[@id])[last()] -- it will point to last element
		// (//input[@id])[last()-1] -- it will point 2 last element
		// (//input[@id])[last()-last()+1] -- 6-6=0+1==1 it will go to first element
		
		
		//Interview Question:
		
	//	((//div[@class='navFooterVerticalRow navAccessibility']/div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()]
		
		//text with space:
		//label[normalize-space()='Yes'] -- normalize-space
		
	}

}
