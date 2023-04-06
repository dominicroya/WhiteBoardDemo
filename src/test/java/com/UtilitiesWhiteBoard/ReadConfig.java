	package com.UtilitiesWhiteBoard;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
public static Properties prop;
	
	public ReadConfig()
	{
		File src = new File("./Configuration/config.properties");
		try {
			FileInputStream fis=new FileInputStream(src);
			prop=new Properties();
			prop.load(fis);
		} catch(Exception e){
			System.out.println("Exception is "+ e.getMessage());
		} 	
	}

	public String getApplicationURL()
	{
		String url=prop.getProperty("baseURL");
		return url;
	}
	
	public String getChromepath()
	{
		String chromepath=prop.getProperty("chromepath");
		return chromepath;
	}
	
	public String getFilePath()
	{
		String filepath=prop.getProperty("filepath");
		return filepath;
	}
	
	public String expected_language()
	{
		String language=prop.getProperty("language");
		return language;
	}
	public String Student_detail()
	{
		String student_name=prop.getProperty("student_name");
		return student_name;
	}
	public String getedgepath()
	{
		String edgepath=prop.getProperty("edgepath");
		return edgepath;
	}
	
	public String getdownloaded_FilePath()
	{
		String downloaded_FilePath=prop.getProperty("download_path");
		return downloaded_FilePath;
	}
	
}
