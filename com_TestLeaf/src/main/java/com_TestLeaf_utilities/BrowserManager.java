package com_TestLeaf_utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;

public class BrowserManager extends Propertyloader {
	public static WebDriver driver;
	@BeforeTest
	public static void browsermanagement() throws IOException {
		
		
		if(p_browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", p_bloct);
			driver = new FirefoxDriver();
			driver.navigate().to(p_url);
			System.out.println(p_browser+ " firefox is launched");
		}
			else if(p_browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", p_bloct);
				driver = new ChromeDriver();
				driver.navigate().to(p_url);
			
			
		}
		
		
	}
	/*
	 * @AfterSuite public static void teardown() { driver.quit(); }
	 */
	
	

}
