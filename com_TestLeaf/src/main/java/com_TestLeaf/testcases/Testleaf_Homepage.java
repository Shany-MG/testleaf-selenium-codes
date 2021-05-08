package com_TestLeaf.testcases;



import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com_TestLeaf_pageobjectmethod.Testleaf_homepage_pom;
import com_TestLeaf_utilities.BrowserManager;

public class Testleaf_Homepage extends BrowserManager {

	@Test
	public static void mousehover() throws InterruptedException {

		PageFactory.initElements(driver, com_TestLeaf_pageobjectmethod.Testleaf_homepage_pom.class);
		Testleaf_homepage_pom.mousehover.click();

		Actions action = new Actions(driver);
		action.moveToElement(Testleaf_homepage_pom.testleafcourses).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		for (WebElement listing : Testleaf_homepage_pom.testleafcourseslist) {
			String text =	listing.getText();
			System.out.println(text);
			if (text.contains("RPA")) {
				listing.click();

				Alert alert = driver.switchTo().alert();
				String alertext =	alert.getText();
				System.out.println(alertext);
				alert.accept();
				
			
				
			}

		}
		


	}














}
