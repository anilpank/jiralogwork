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
public class JiraLoginPageExt extends PageObject {
	@FindBy(name="username")
	private WebElement userName;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(name="submit")
	private WebElement login;

	public JiraLoginPageExt(WebDriver driver) {
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
	
	
	public JiraLoginPage submit() {
		login.click();
		return new JiraLoginPage(driver);
	}
}
