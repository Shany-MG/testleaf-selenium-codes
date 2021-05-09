package com_TestLeaf_utilities;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Loggermanager_test {
	public static Logger logger;
	public static void loggermethod() {
		
		 logger = Logger.getLogger(BrowserManager.class);
		 //BasicConfigurator.configure();
		 PropertyConfigurator.configure("log4j.properties");
	}

}
