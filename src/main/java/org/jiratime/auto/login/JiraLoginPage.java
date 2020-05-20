package org.jiratime.auto.login;

import org.jiratime.auto.PageObject;
import org.jiratime.auto.home.main.JiraHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * 
 * @author averma
 *
 */
public class JiraLoginPage extends PageObject {
	@FindBy(name="os_username")
	private WebElement userName;
	
	@FindBy(name="os_password")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement login;

	public JiraLoginPage(WebDriver driver) {
		super(driver);		
	}
	
	
	public void enterUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	

	public void enterPassword(String password) {
		this.password.clear();
		this.password.sendKeys(password);
	}
	
	
	public JiraHomePage submit() {
		login.click();
		return new JiraHomePage(driver);
	}
}
