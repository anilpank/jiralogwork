package org.jiratime.auto;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Configurations {
	
	private Properties prop;
	private static final Logger logger = LogManager.getLogger(Configurations.class);

	public Configurations() {	
		loadProperties();
	}
	
	private  void loadProperties() {		
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
	
	public String get(String name) {
		return prop.getProperty(name);
	}
}
