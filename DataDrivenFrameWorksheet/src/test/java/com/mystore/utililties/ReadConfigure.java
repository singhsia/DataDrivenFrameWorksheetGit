package com.mystore.utililties;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfigure {
	//create class object 
	Properties property;
	String path="/Users/mayank/eclipse-workspace/DataDrivenFrameWorksheet/congiguration/configure.properties";
	
	public ReadConfigure() {
		try {
		property=new Properties();
		FileInputStream fil=new FileInputStream(path);
		property.load(fil);
	}
		catch(Exception e) {
					e.printStackTrace();
		}
	}
	//method to read keys from property file
	public String getBaseUrl() {
		String value=property.getProperty("baseUrl");
		if(value!=null)
			
		return value;
		else
			throw new RuntimeException("URL not found in config file");
			}
	public String getBrowser() {
		String value=property.getProperty("browser");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("Browser not found in config file");
		
	}
	}
	
