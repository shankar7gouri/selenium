package utility;

import java.io.FileInputStream;

import java.util.Properties;


public class PropertyFileUtil {

	public static String getvalueforkey(String key) throws Exception{
		
	Properties p=new Properties();
	FileInputStream fi=new FileInputStream("D:\\11oclockselenium\\TP\\PropertiesFile\\Environment.properties");
	p.load(fi);
	
	return p.getProperty(key);
}
}
