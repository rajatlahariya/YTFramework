package org.testing.TestScripts;

import org.openqa.selenium.By;
import org.testng.annotations.*;
import org.testing.Base.*;
import org.testing.Pages.Login;
import org.testing.Pages.Logout1;

public class TC5 extends Base_class {

	@Test
	public void test() throws InterruptedException
	{
		Login lo=new Login(driver,pr);
		lo.loginpage("tesmin5666@gmail.com", "mintes233");
		
		/*************Event Code*************************/
		driver.findElement(By.xpath(".//yt-formatted-string[@id='video-title']")).click();
		Thread.sleep(2000);
	    try {
		driver.findElement(By.xpath("(.//yt-formatted-string[text()='Subscribe'])[2]")).click();
		Thread.sleep(500);
	    }
	    catch(Exception e) {
	    	driver.findElement(By.xpath("(.//yt-formatted-string[text()='Subscribed'])[2]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//yt-formatted-string[@id='text' and text()='Unsubscribe']")).click();
			Thread.sleep(2000);
	    }
		/*************Logout Code*************************/
	    Logout1 lg=	new Logout1(driver, pr);
		lg.logoutpage();
	}

}
