package org.jiratime.auto.home.main;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.jiratime.auto.Configurations;
import org.jiratime.auto.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JiraWorkLogPage extends PageObject {
	
	// -> 03/Feb/20
	private DateFormat sourceFormat = new SimpleDateFormat("dd/MMM/yy");
	
	// -> 19/May/20 08:38 PM
	private DateFormat destinationFormat = new SimpleDateFormat("dd/MMM/yy hh:mm a");

	@FindBy(name="timeLogged")
	private WebElement timeLogged;
	
	@FindBy(name="Log")
	private WebElement log;
	
	@FindBy(name="startDate")
	private WebElement startDate;
	
	public JiraWorkLogPage(WebDriver driver) {
		super(driver);		
	}
	
	public JiraHomePage logTime(String timelog, String startDateStr) throws ParseException {
		timeLogged.sendKeys(timelog);	
		startDate.clear();
		Date inputDate = sourceFormat.parse(startDateStr);
		String targetDateStr = destinationFormat.format(inputDate);
		System.out.println(targetDateStr);
		startDate.sendKeys(targetDateStr);
		log.submit();
		return new JiraHomePage(driver);		
	}

}
