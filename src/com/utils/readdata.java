package com.utils;

import java.io.FileInputStream;

import java.util.Properties;

public class readdata {

	
	public static String getData(String filename,String key) throws Exception {
		
		String filepath=".//resources//"+filename+".properties";
		FileInputStream instream=new FileInputStream(filepath);
				Properties pro=new Properties();
				pro.load(instream);
				String value=pro.getProperty(key);
				return value;
				
	}
}
