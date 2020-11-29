package com.ecom.tests.SeleniumTestNgJenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ApplicationTest {
	
	SoftAssert soft = new SoftAssert();
	final String siteUrl = "https://www.facebook.com/";
	final String driverPath = "/home/wahidkhan74gmai/selenium-workspace/driver/chromedriver";
	WebDriver driver ;
	
  @Test
  public void testEasy() {
	  System.setProperty("webdriver.chrome.driver", driverPath);
  	  driver = new ChromeDriver();
  	  driver.get(siteUrl);
  	  soft.assertEquals("FB Login", driver.getTitle());
  }
  
  @BeforeTest
  public void beforTest() {
	  Reporter.log("Befor Test");
  }
  
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }
  
}
