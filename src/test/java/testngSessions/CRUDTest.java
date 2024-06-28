package testngSessions;

import org.testng.annotations.Test;

public class CRUDTest {

	//CRUD -- Create Read Update Delete
	
	public int addUser() {
		return 123;
	}
	
	public String getUser(int uid) {
		return "user info for " + uid;
	}

	public String updateUser(int uid) {
		return "updated user info for " + uid;
	}

	public void deleteUser(int uid) {
		System.out.println("user is deleted");
	}
	
	@Test
	public void addUserTest() {
		addUser();
	}
	
	@Test
	public void getUserTest() {
		int uid = addUser();
		String userInfo = getUser(uid);
		System.out.println(userInfo);
	}
	
	@Test
	public void updateUserTest() {
		int uid = addUser();
		updateUser(uid);
		getUser(uid);
	}
	
	@Test
	public void deleteUserTest() {
		int uid = addUser();
		deleteUser(uid);
		getUser(uid);
	}
}
