package testngSessions;

import org.testng.annotations.Test;

public class DependsOnConcept {

	@Test()
	public void loginTest() {
		System.out.println("login test");	
		int i = 9/0;
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void addToCartTest() {
		System.out.println("add to cart test");	
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void orderTest() {
		System.out.println("order test");	
	}
}
