package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Logout1 {
		public ChromeDriver driver;
		public Properties pr;
		public Logout1(ChromeDriver driver,Properties pr) {
			this.driver=driver;
			this.pr=pr;
		}	
		
	public void logoutpage() throws InterruptedException {
		
		driver.findElement(By.xpath(pr.getProperty("profile_button"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(pr.getProperty("signout_button"))).click();
	}
	}
