package testngSessions;

import org.testng.annotations.Test;

public class InvocationCountConcept {

	@Test(invocationCount = 5)
	public void addUserTest() {
		System.out.println("adding user test");
	}
}
