package com.ripple.poc.util;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class PropertyManager {
	
	static Properties  prop = new Properties();
	
	public static String getValue(String Key) {
		if(prop.isEmpty()) {
			loadproperties();
		}
		return prop.getProperty(Key);
	}
	
	public static void loadproperties() {
		try {
	   	    prop.load(new FileInputStream("resources/config.properties"));
	   	} catch (IOException e) {
	    	    e.printStackTrace();
	   	}
	}
}

