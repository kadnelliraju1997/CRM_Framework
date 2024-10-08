package genericutility;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtility {
	
	public String readDataFromPropertyFile(String key) throws Throwable {
		FileInputStream fis =new FileInputStream("./src/main/resources/commoonData.properties");
		Properties p=new Properties();
		p.load(fis);
		return p.getProperty(key);
	}

}
