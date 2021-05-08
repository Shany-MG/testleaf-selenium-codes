package com_TestLeaf_utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Propertyloader {
	static String p_browser ;
	static String p_bloct;
	static String p_url;
	@BeforeSuite
	public static Properties propertloadermethod() throws IOException{

		FileInputStream stream = new FileInputStream("proprtyfile.properties");

		Properties file = new Properties();

		file.load(stream);
		 p_url =	file.getProperty("url");
		p_bloct =	file.getProperty("browser_location");
		p_browser =	file.getProperty("browser");


		return file;


	}

}
