package testngSessions;

import org.testng.annotations.Test;

public class PriorityConcept {
	
	@Test (priority = 1)
	public void searchTest() {
		System.out.println("search Test");
	}
	
	@Test(priority = 2)
	public void addToCart() {
		System.out.println("add To Cart");
	}
	
	@Test(priority = 5)
	public void checkOutTest() {
		System.out.println("checkOut Test");
	}
	
	@Test(priority = 3)
	public void paymentTest() {
		System.out.println("payment Test");
	}
	
	@Test(priority = 4)
	public void orderTest() {
		System.out.println("order Test");
	}

}
