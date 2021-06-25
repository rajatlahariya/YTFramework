package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {

	public static Properties loadProperty(String path) throws IOException
	{
		File file=new File(path);
		FileInputStream fi=new FileInputStream(file);
		Properties pr=new Properties();
		pr.load(fi);	
		return pr;
	}
}
