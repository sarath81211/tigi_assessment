package Tests;

import org.testng.annotations.Test;

import Functionalities.LoginTest;

public class T1_LoginTest extends LoginTest{

	@Test (priority = 1)
	public void accountCreation() {
		navigate();
		account();
		logout();
	}
	
	@Test (priority = 2)
	public void loginTest() {
		navigate();
		login();
		logout();
	}
}
