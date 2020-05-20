package org.jiratime.auto;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class FunctionalTest {
	protected static WebDriver driver;
	protected static Properties prop;
	private static final Logger logger = LogManager.getLogger(FunctionalTest.class);	
	

	@BeforeClass
	public static void setUp() {		
		System.setProperty("webdriver.chrome.driver",new Configurations().get("chrome.driver.path"));
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loadProperties();		
	}

	private static void loadProperties() {		
		try (InputStream input = ClassLoader.getSystemResourceAsStream("app.properties")) {
			prop = new Properties();
			// load a properties file
			prop.load(input);
			// get the property value and print it out
			logger.info("url value -" + prop.getProperty("url"));	

		} catch (IOException ex) {
			logger.error("Unable to load properties", ex);
		}
	}
	

	@After
	public void cleanUp(){
		driver.manage().deleteAllCookies();
	}

	@AfterClass
	public static void tearDown(){
		driver.close();
	}

}
