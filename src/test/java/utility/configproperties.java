package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class configproperties {

	
	Properties prop;
	
	public configproperties()
	{
		File src=new File("C:\\Asessment\\facebook\\confugeration\\config.properties");

	try {
		FileInputStream fis = new FileInputStream(src);
		prop=new Properties();
		prop.load(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	
	public String geturl()
	{
		String urll=prop.getProperty("baseurl");
		return urll;
	}
}
	
	
