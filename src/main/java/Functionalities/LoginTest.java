package Functionalities;

import Utilities.Utils;

public class LoginTest extends Utils{

	public void navigate() {
		getDriver().get(webSite);
		getDriver().manage().window().maximize();
	}
	
	public void account() {

		try {
			getWebEle(accountPath).click();
			syncWait(15);
			Thread.sleep(3000);
			getWebEle(firstNamePath).sendKeys("Sarath");
			getWebEle(lastNamePath).sendKeys("Kumar");
			getWebEle(emailPath).sendKeys("user2583@email.com");
			getWebEle(passwordPath).sendKeys("1234Sarath");
			getWebEle(confPasswordPath).sendKeys("1234Sarath");
			getWebEle(accountCreateButtonPath).click();
			if (getWebEle(accountSuccessMessagePath).isDisplayed()) {
				System.out.println("Account successfully created");
			}
		} catch (Exception e) {
			System.out.println("Unable to create an account");
			e.printStackTrace();
		}
	}
	
	public void login() {
		
		try {
			getWebEle(signInPath).click();
			getWebEle(loginEmailPath).sendKeys("user2580@email.com");
			syncWait(10);
			getWebEle(loginPasswordPath).sendKeys("1234Sarath");
			syncWait(10);
			getWebEle(loginButtonPath).click();
			System.out.println("Successfully Logged In");
		} catch (Exception e) {
			System.out.println("Unable to logIn");
		}
	}
	
	public void logout() {
		try {
			getWebEle(profileDropdownPath).click();
			Thread.sleep(2000);
			syncWait(15);
			getWebEle(signOutPath).click();
			System.out.println("Successfully Signed Out \n");
		} catch (Exception e) {
			System.out.println("Unable to logut");
		}
	}
}
