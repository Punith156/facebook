import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configproperties {

	public static Properties prop;
	
	
	private static String configertation="C:\\Asessment\\facebook\\confugeration\\config.properties";
	
	public static void initializepropfile()
	{
		prop=new Properties();
	try {
		FileInputStream fis = new FileInputStream(configertation);
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
}
}