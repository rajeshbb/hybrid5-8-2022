package com.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.Reporter;


import com.pagelocator.loginlocator;



public class loginpages extends loginlocator {

	
	private WebDriver driver;
	
	public loginpages (WebDriver driver) {
		
		this.driver=driver;
	}

	public void setUserName(String uname) {
		WebElement userelement=driver.findElement(username);
		userelement.sendKeys(uname);
	}

	public void setPassword(String pass) {
		WebElement passwordelement=driver.findElement(password);
		passwordelement.sendKeys(pass);
	}
	public void clickLogin(){
		WebElement loginelement=driver.findElement(login);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].click();", loginelement);
	}
	public void hrmlogin(String uname, String pass) {
		Reporter.log(" login execuation started");
		
		this.setUserName(uname);
		this.setPassword(pass);
		this.clickLogin();
//		String expectedURL="WelcomeTo Manager'sPage of Guru99 Bank";
		
//		com.utils.browser.verifyresultpage(expectedURL);
		Reporter.log(" login method excuted");
	}
}
