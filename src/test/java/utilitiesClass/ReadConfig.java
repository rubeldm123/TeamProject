package utilitiesClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
	
	public ReadConfig() {
		File src=new File("./config.properties");
		
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is "+ e.getMessage());
		}//end of try catch 
		}//end of constructor
		
		//action method
		
		public String getPortalURL() {
			pro.getProperty("baseURl");			
			String url=pro.getProperty("baseURl");
			return url;
		}//end of getPortalUrl
		
		public String getChromepath() {
			pro.getProperty("chromepath");
			String cp=pro.getProperty("chromepath");
			return cp;
		}
		
		
	
	
	

}//end class
