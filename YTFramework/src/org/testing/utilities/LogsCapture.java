package org.testing.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LogsCapture {
	
	public static void takelogs(String classname, String message) {
		
		DOMConfigurator.configure("../YTFramework/layout.xml");
		Logger logger=Logger.getLogger(classname);
		logger.info(message);
	}
}
