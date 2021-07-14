package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Videoplay
{
	ChromeDriver driver;
	Properties pr;
	
	public Videoplay(ChromeDriver driver,Properties pr) 
	{
	 this.pr=pr;
	 this.driver=driver;
	}
	
	public void video() throws InterruptedException 
	{
		driver.findElement(By.xpath(pr.getProperty("video"))).click();
		Thread.sleep(2000);
	}
	
	
	
	

}
