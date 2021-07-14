package org.testing.TestScripts;

import org.openqa.selenium.By;
import org.testng.annotations.*;
import org.testing.Base.*;
import org.testing.Pages.Login;
import org.testing.Pages.Logout1;

public class TC7 extends Base_class {
	
	@Test
	public void test() throws InterruptedException
	{
		Login lo=new Login(driver,pr);
		lo.loginpage("tesmin5666@gmail.com", "mintes233");
		
		/*************Event Code*************************/
		driver.findElement(By.xpath(".//yt-formatted-string[@id='video-title']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(.//button[@id='button' and @aria-label='Save to playlist'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id=\"checkboxContainer\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(.//button[@aria-label='Cancel'])[1]")).click();
		
		
		/*************Logout Code*************************/
		Logout1 lg=	new Logout1(driver, pr);
		lg.logoutpage();
	}

}
