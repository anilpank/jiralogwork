package org.jiratime.auto.home.main;

import org.jiratime.auto.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JiraHomePage extends PageObject {

	@FindBy(name="searchString")
	private WebElement search;

	
	public JiraHomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public JiraTicketPage openJiraTicket(String ticketNo) {
		search.sendKeys(ticketNo);
		search.sendKeys(Keys.ENTER);
		return new JiraTicketPage(driver);
	}

	

}
