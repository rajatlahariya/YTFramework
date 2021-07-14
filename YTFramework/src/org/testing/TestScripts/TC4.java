package org.testing.TestScripts;

import org.openqa.selenium.By;
import org.testing.Base.*;
import org.testing.Pages.Login;
import org.testing.Pages.Logout1;
import org.testng.annotations.*;


public class TC4 extends Base_class {
	
	@Test
	public void test() throws InterruptedException
	{
		Login lo=new Login(driver,pr);
		lo.loginpage("tesmin5666@gmail.com", "mintes233");
		
		/*************Event Code*************************/
		driver.findElement(By.xpath(".//yt-formatted-string[@id='video-title']")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("(.//button[@class='style-scope yt-icon-button' and contains(@aria-label,'like this video')])[7]")).click();
		Thread.sleep(500);
	
		/*************Logout Code*************************/
		Logout1 lg=	new Logout1(driver, pr);
		lg.logoutpage();
	}

}
