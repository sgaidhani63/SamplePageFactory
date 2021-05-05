package ConfigReader;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

	Properties pro;
	
	public ConfigDataProvider() {
		
		File src = new File("./ConfigFiles/Config.properties");
		try {
			
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}
		catch(Exception e) {
			System.out.println("Not able to Load Config File");
		}
	}
	
		public String getDataFromConfig(String KeyToSearch) {
			return pro.getProperty(KeyToSearch);
		}
		
		public String getBrowser() {
			return pro.getProperty("Browser");
		}
		
		public String getStringURL () {
			return pro.getProperty("qaURL");
		}
		
		public String getUsername () {
			return pro.getProperty("username");
		}
		
		public String getPassword () {
			return pro.getProperty("password");
		}
		
		public String getVarsion () {
			return pro.getProperty("version");
		}
}
