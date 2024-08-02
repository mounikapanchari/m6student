package genericliborutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertiesUtilorLib {
	/**
	 * 
	 * @param data
	 * @return
	 * @throws Exception
	 */
public String getDataFromProperties(String data) throws Exception
{
	FileInputStream fis = new FileInputStream(IconStantUtility.propertiespath);
	Properties pobj=new Properties();
	pobj.load(fis);
	String info=pobj.getProperty(data);
	return info;
	
}
}
