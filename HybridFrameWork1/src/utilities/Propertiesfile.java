package utilities;

import java.io.FileInputStream;
import java.util.Properties;



public class Propertiesfile {
	public static String getValueForKey(String Key) throws Exception{
	Properties p=new Properties();
	FileInputStream fis=new FileInputStream("D:\\11oclockselenium\\HybridFrameWork1\\PropertyFile\\Environment.propeties");
	p.load(fis);
	return p.getProperty(Key);
	
	}
}
