package com.testscripts;

import org.apache.commons.lang3.RandomStringUtils;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.loginpages;
import com.utils.browser;
import com.utils.readdata;

public class tc001 {

	protected WebDriver driver;
	
	@BeforeClass
	public void setup() throws Exception {
		String browsername=readdata.getData("browserData", "browser1");
		String url=readdata.getData("browserData", "url");
		driver=browser.launchBrowser(browsername);
		browser.openURL(url);
	}
	@AfterClass
	public void teardown() {
		browser.closeBrowser();
		
	}
	@Test
	public void hrmlogin() throws Exception {
		String uname=readdata.getData("logininfo","username");
		String pass=readdata.getData("logininfo", "password");
		loginpages login=new loginpages(driver);
		login.hrmlogin(uname,pass);
		
		

		 boolean res=driver.getPageSource().contains("Welcome To Manager's Page of Guru99 Bank");
		 
		 if(res==true) {
			
			 Assert.assertTrue(true);
			 
			
		 }
		 
		 else {
			 Assert.assertTrue(false);
		 }
		 Thread.sleep(5000);
	}
	
	
	
	public String randomestring() 
	{
		
		 String generatedstring=RandomStringUtils.randomAlphabetic(8);
		 return (generatedstring);
	}
	

	public String randomeNum() 
	{
		
		 String generatedstring2=RandomStringUtils.randomNumeric(5);
		 return (generatedstring2);
		 
	}
}
