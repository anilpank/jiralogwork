package org.jiratime.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestUtil {

	public static void wait(WebDriver driver, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, 5);		
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public static void waitForElementToBeRemoved(WebDriver driver, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, 30);		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
	}
}
