package org.testing.Base;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testing.utilities.PropertiesFile;
import org.testng.annotations.*;


public class Base_class {
	public ChromeDriver driver;
	public Properties pr;
	public Actions ac;
	@BeforeMethod
	public void beforemethod() throws IOException {
		System.setProperty("webdriver.chrome.driver","../YTFramework/chromedriver.exe");
		pr=PropertiesFile.loadProperty("../YTFramework/object.properties");
		driver= new ChromeDriver();
		ac=new Actions(driver);
		driver.navigate().to("https://www.youtube.com/");
		driver.manage().window().maximize();
}

	@AfterMethod
	public void Aftermethod()
	{
	driver.quit();
		
	}










}
