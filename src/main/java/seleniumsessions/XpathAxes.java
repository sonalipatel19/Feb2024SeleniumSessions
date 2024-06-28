package seleniumsessions;

public class XpathAxes {

	public static void main(String[] args) {
		
		
		//parent to child:
		//direct child : we use /
		//direct+indirect child:  we use //
		
		//div[@id='content']//form//input
		
		//select[@id='Form_getForm_Country']/option
		//select[@id='Form_getForm_Country']//option
	//	(//div[@class='form-group'])[1]/input

		
		//child to parent:
		//input[@id='input-email']/../../../..
		//input[@id='input-email']/..
		//input[@id='input-email']/parent::div --> direct parent of child
		//input[@id='input-email']/ancestor::form --> grand parent is called ancestor
		
		
		
		//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']
		//a[text()='Joe.Root']/ancestor::tr//input[@type='checkbox']
		
		//a[text()='Mustafa Hanif']/parent::td/preceding-sibling::td/input[@type='checkbox']
		//a[text()='Pooja Khatiyan']/parent::td/preceding-sibling::td/input[@type='checkbox'] - 2 element
		//a[text()='neha sharma']/parent::td/following-sibling::td/a[@context='company']
		
	}

}
