package org.testing.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void takeScreenshoot(ChromeDriver driver,String path) throws IOException {
		File file=driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(path));
		
	}
}
