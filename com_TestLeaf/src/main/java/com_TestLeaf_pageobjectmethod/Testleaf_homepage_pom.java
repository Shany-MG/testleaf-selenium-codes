package com_TestLeaf_pageobjectmethod;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Testleaf_homepage_pom {
	
	@FindBy(xpath = "//a[@href='pages/mouseOver.html']")
	public static WebElement mousehover; 
	
	@FindBy(xpath = "//a[@class='btnMouse']")
	public static WebElement testleafcourses;
	
	@FindBy(xpath = "//a[@class='btnMouse']/following::a")
	public static List<WebElement> testleafcourseslist;

}
