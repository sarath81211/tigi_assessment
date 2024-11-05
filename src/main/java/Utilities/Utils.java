package Utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Utils extends Drivers{

	public String webSite = "https://magento.softwaretestingboard.com/";
	
	public String accountPath = "/html/body/div[2]/header/div[1]/div/ul/li[3]/a";
	
	public String firstNamePath = "//input[@id = 'firstname']";
	public String lastNamePath = "//input[@id = 'lastname']";
	public String emailPath = "//input[@name = 'email']";
	public String passwordPath = "//input[@name = 'password']";
	public String confPasswordPath = "//input[@name = 'password_confirmation']";
	public String accountCreateButtonPath = "//button[@title = 'Create an Account']";
	
	public String accountSuccessMessagePath = "//*[text() = 'Thank you for registering with Main Website Store.']";
	
	public String profileDropdownPath = "//span[@data-toggle = 'dropdown']";
	public String signOutPath = "/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a";
	
	public String signInPath = "/html/body/div[2]/header/div[1]/div/ul/li[2]/a";
	public String loginEmailPath = "//input[@name = 'login[username]']";
	public String loginPasswordPath = "//input[@name = 'login[password]']";
	public String loginButtonPath = "//*[@id=\"send2\"]";
	
	public void syncWait(Integer timeInSeconds) {
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(timeInSeconds));
	}
	
	public WebElement getWebEle(String Xpath) {
		return getDriver().findElement(By.xpath(Xpath));
	}
}
