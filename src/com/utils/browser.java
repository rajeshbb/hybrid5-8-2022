package com.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
public class browser {

	private static WebDriver driver;
	
	private static  String chromepath="E:\\TESTING\\chromedriver_win32 (2)\\chromedriver.exe";
	
	public static WebDriver launchBrowser(String browsername) {
		
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", chromepath);
			 driver=new ChromeDriver();
		}
		
		return driver;
	}
	
	public static void openURL(String url) {
		
		
		driver.get(url);
	}
	
	public static void closeBrowser() {
		
		driver.close();
	}
	
//	public static void verifyresultpage( String expectedurl) {
//		
//		String actualurl=driver.getCurrentUrl();
//		boolean status=actualurl.contains(expectedurl);
//		Assert.assertEquals(status, true,"\nActual URL : "+actualurl+" Does contain ExpectedURL : "+expectedurl);
//	}
}
