package com.testscripts;



import org.testng.Assert;
import org.testng.annotations.Test;


import com.hrm.utils.readdata;
import com.pages.customerpage;



public class tc002  extends tc001{

	
	
//	@Test
//	public void hrmlogin() throws Exception {
//		
//		String uname= readdata.getData("logininfo", "username");
//		String pass= readdata.getData("logininfo", "password");
//		
//		loginpages login=new loginpages(driver);
//		login.hrmlogin(uname,pass);
//	}
	
	@Test
	public void addcustomerpage() throws Exception
	{
	
		String fname= readdata.getData("employeeinfo", "customername");
		String gender= readdata.getData("employeeinfo", "customergender");
		String dob= readdata.getData("employeeinfo", "datebirthh");
        String address= readdata.getData("employeeinfo","addresss");
     	String city= readdata.getData("employeeinfo", "cityy");
	
   	String state= readdata.getData("employeeinfo","statee");
	String mobile= readdata.getData("employeeinfo","telephone");
     	String pin= readdata.getData("employeeinfo", "pinn");
     	String emailid=randomestring()+"@gmail.com";

	String passwordd= readdata.getData("employeeinfo", "password");
		customerpage add=new customerpage(driver);
		
		add.addcustomerpage(fname, gender, dob, address, city, state, pin, mobile, emailid, passwordd);
		Thread.sleep(5000);
		
		 boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		 
		 if(res==true) {
			
			 Assert.assertTrue(true);
		 }
		 
		 else {
			 Assert.assertTrue(false);
		 }
		 Thread.sleep(5000);
	}
				



}
