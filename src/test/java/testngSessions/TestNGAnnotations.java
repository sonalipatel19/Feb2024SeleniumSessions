package testngSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	//global pre conditions
	//pre conditions
	//test steps + exp vs act result
	//after steps
	//global after steps
	
	@BeforeSuite
	public void connectWithDB() {
		System.out.println("BS -- connect with DB");
	}
	
	@BeforeTest
	public void createUser() {
		System.out.println("BT -- create user");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC -- launch Browser");
	}
	
	@BeforeMethod
	public void loginToApp() {
		System.out.println("BM -- login To App");
	}
	
	@Test
	public void searchTest() {
		System.out.println("search Test");
	}
	
	@Test
	public void addToCart() {
		System.out.println("add To Cart");
	}
	
	@Test
	public void checkOutTest() {
		System.out.println("checkOut Test");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("AM -- logout");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC -- closeBrowser");
	}
	
	@AfterTest
	public void deleteUser() {
		System.out.println("AT -- delete User");
	}
	
	@AfterSuite
	public void disconnectWithDB() {
		System.out.println("AS -- disconnect With DB");
	}
	
	
	
	
	
	
	
	
	

}
