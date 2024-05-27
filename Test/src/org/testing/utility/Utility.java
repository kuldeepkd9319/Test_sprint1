package org.testing.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utility {
	public static String fetchPropertyValue(String key) throws IOException {
		FileInputStream file= new FileInputStream("./Config/Config.properties");
		Properties property=new Properties();
		property.load(file);
		return property.get(key).toString();
	}
	public static String fetchLocatorsValue(String key) throws IOException{
		
		FileInputStream file= new FileInputStream("./Config/Elements.properties");
		Properties property= new Properties();
		property.load(file);
		return property.get(key).toString();
	}

}
