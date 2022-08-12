package com.pages;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pagelocator.customerlogator;

public class customerpage extends customerlogator {

	
	private WebDriver driver;
	
	public customerpage( WebDriver driver) {
		this .driver=driver;
	}
	
	
	
	
	public void customerclick() {
		
		WebElement customerelement= driver.findElement(customer);
		customerelement.click();
		WebDriverWait nameelement = new WebDriverWait(driver,100); 
		nameelement.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")));
		
		
	}
	
	public void customername(String uname) {
		WebElement nameelement=driver.findElement(name);
		nameelement.sendKeys(uname);
	}
	public void customergender(String m) {
		WebElement genderelement=driver.findElement(gender);
		genderelement.sendKeys(m);
	}
   public void datebirth(String mm) {
		
		
		WebElement dobelement=driver.findElement(date);
		dobelement.sendKeys(mm);
		
	}
	
   public void addres(String add) {
	WebElement addresselement=driver.findElement(address);
	addresselement.sendKeys(add);
}
   
	public void city(String k) {
		WebElement cityelement=driver.findElement(cityy);
		cityelement.sendKeys(k);
}

	public void state(String j) {
		WebElement stateelement=driver.findElement(statee);
	stateelement.sendKeys(j);      

	}
	
	
     public void pin(String b) {
		WebElement pinelement=driver.findElement(pinn);
		pinelement.sendKeys(String.valueOf(b));
	}
	
	public void mobile (String f) {
	WebElement numberelement=driver.findElement(telephone);
	numberelement.sendKeys(f);
}
	
	public void email(String c) {
	WebElement emailelement=driver.findElement(email);
	emailelement.sendKeys(c);
}
	public void password (String d) {
		WebElement passwordelement=driver.findElement(passw);
	passwordelement.sendKeys(d);
	}
	public void submit() {
		WebElement submitelement=driver.findElement(submit);
		submitelement.click();
	}
	public void addcustomerpage(String uname,String m,String mm,String add,String k,String j,String b,String f,String c,String d) {
		this.customerclick();
		this.customername(uname);
		this.customergender(m);
		this.datebirth(mm);	
		this.addres(add);
		
     	this.city(k);
     	this.state(j);
       	this.pin(b);
	   this.mobile(f);
		this.email(c);
		this.password(d);
		
		this.submit();
		
		
		
	}
}
