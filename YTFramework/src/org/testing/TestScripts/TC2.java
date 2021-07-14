package org.testing.TestScripts;

import org.openqa.selenium.By;
import org.testing.Base.*;
import org.testing.Pages.Login;
import org.testing.Pages.Logout1;
import org.testng.annotations.*;


public class TC2 extends Base_class {
	
	@Test
	public void test() throws InterruptedException
	{
		Login lo=new Login(driver,pr);
		lo.loginpage("tesmin5666@gmail.com", "mintes233");
		/*************Event Code*************************/
		
		driver.findElement(By.xpath("(.//yt-formatted-string[text()='History'])[1]")).click();
		Thread.sleep(1500);
	
		/*************Logout Code*************************/
		Logout1 lg=	new Logout1(driver, pr);
		lg.logoutpage();
	}

}
