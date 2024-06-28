package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCssSelector {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// css: locator 
		
		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login?login");
		//id: #id - #input-email
		//htmltag#id - input#input-email
		
		//class: .className - .form-control
		//htmltag.className - input.form-control

		//more than one class - .c1.c2.c3...n -- input.form-control.input-lg
		//htmltag.c1.c2.c3...n
		//input.form-control.private-form__control.login-email
		//input.login-email
		//input.login-password
		
		//htmltag#id.classname
		//input#input-email.form-control
		//input.form-control.private-form__control.login-email#username
		//input.login-email#username
		
		//a.list-group-item -- 13 -- FEs
		
		//htmltag[attr='value']
		//input[name='email'] -- css
		//input[@name='email'] -- xpath
		
		//htmltag[attr1='value'][attr2='value']
		//input[name='email'][id='input-email']-- css
		//input[name='email'][id]
		
		//a[href]
		//input[name='email']#input-email
		
		//input[placeholder*='Address'] -- contains (*)
		//input[placeholder^='Address'] -- starts-with(^)
		//input[placeholder$='Address'] -- endswith ($)
		
		//text in css?  -- not available
		
		//parent to child:
		//select#form_getForm_Country > option -- direct child
		//select#form_getForm_Country option -- direct + indirect child elements
		//div#content form > div.form-group input#input-email
		//nav#top div -- direct + indirect = 4
		//nav#top > div -- direct = 1
		
		//child to parent? -- not available : backward traversing in DOM is not allowed
		
		//sibling in css:
		//preceding-sibling in css : NA
		//following-sibling in css : yes
		//label[for='input-email']+input#input-email -- direct immediate following-sibling
		//label[for='input-password']+input+a -- direct immediate following-sibling
		//label[for='input-password']~a -- indirect immediate following-sibling
		
		//indexing in css:
		//select#Form_getForm_Country > option:first-child - first child
		//select#Form_getForm_Country > option:last-child - last child
		//select#Form_getForm_Country > option:nth-child(3) - nth child -- it will go to any index from top
		//select#Form_getForm_Country > option:nth-last-child(3) - nth last child -- it will start from the last child
		//select#Form_getForm_Country > option:nth-child(odd) -- it will give all odd elements
		//select#Form_getForm_Country > option:nth-child(even) -- it will give all even elements
		//select#Form_getForm_Country > option:nth-child(n) -- all elements from top
		//select#Form_getForm_Country > option:nth-child(n+4) -- it will start from 4 element
		//select#Form_getForm_Country > option:nth-child(4n) -- multiple of 4
		
		//odd/even in xpath:
		// n%2==0 - even
	//	(//select[@id='Form_getForm_Country']/option)[position() mod 2 = 0] -- even
	//	(//select[@id='Form_getForm_Country']/option)[position() mod 2 = 1] -- odd
		
		//comma in css:
		//input#username,inpu#password,button#loginBtn,input#remember
		
		By loginFields = By.cssSelector("input#username,input#password,input#remember,button#loginBtn");
		int loginFieldsCounts = driver.findElements(loginFields).size();
		
		System.out.println(loginFieldsCounts);
		if(loginFieldsCounts == 4) {
			System.out.println("imp elements are available on the login page");
		}
		
		//union operator in xpath:
		//footer//a | //footer//h5 | //footer//p
		
		//not operator in css:
		//input.form-control:not(input[name='search']
		//input.form-control:not(input[name='search']):not(input[#input-email])
		
		
		//1. with class name - only one class is allowed.
		//driver.findElement(By.className("form-control private-form__control login-email")).sendKeys("test@gmail.com");
		//InvalidSelectorException: Compound css names not permitted.
		
		//valid
		//driver.findElement(By.className("login-email")).sendKeys("test@gmail.com");
		
		//valid
		//driver.findElement(By.xpath("form-control private-form__control login-email")).sendKeys("test@gmail.com");
		
		//valid
		//driver.findElement(By.cssSelector("form-control.private-form__control.login-email")).sendKeys("test@gmail.com");
		
		
		//performance:
		
		
		
		
		
		//difference between	 xpath          and         css:
//		1. syntax:				medium						easy
//		2. performance:			slow						faster
//		3. backward: 			yes							no
//		4. siblings:			yes							yes -- only direct following-siblings
//		5. text:				yes							no
//		6. ancestor				yes							no
//		7. index:				yes							yes -- better
//		8. startswith			yes							yes
//		9. contains				yes							yes
//		10. endswith			no							yes
//		11. comma/union			yes							yes
//		12. and					yes							yes
//		13. or					yes							no
//		14. not:				yes							yes
//		14. shadowDOM			no							yes
//		15. SVG:				yes							no
		
		
		
		
		
		
		
		
		

	}

}
