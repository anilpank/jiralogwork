package org.jiratime.auto.home.main;

import org.jiratime.auto.Configurations;
import org.jiratime.auto.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JiraTicketPage extends PageObject {

	@FindBy(className = "issue-link")
	private WebElement issueLink;
	
	public JiraTicketPage(WebDriver driver) {
		super(driver);		
	}
	
	public JiraWorkLogPage openWorklogPage() {
		String ticketId = issueLink.getAttribute("rel");
		String jiraBaseUrl = new Configurations().get("jira.base.url");
		String worklogUrl = jiraBaseUrl + "jira/secure/CreateWorklog!default.jspa?id=" + ticketId;
		driver.get(worklogUrl);
		return new JiraWorkLogPage(driver);
	}

}
