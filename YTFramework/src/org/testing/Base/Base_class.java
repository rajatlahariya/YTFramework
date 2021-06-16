package org.testing.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Base_class {
	public WebDriver driver;
	
	@BeforeMethod
	public void beforemethod() {
		System.setProperty("webdriver.chrome.driver","../YTFramework/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.youtube.com/");
		driver.manage().window().maximize();
System.out.println("This is the change");

}

	@AfterMethod
	public void Aftermethod()
	{
	//driver.quit();
		
	}










}
