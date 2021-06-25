package org.testing.TestScripts;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import org.testing.Base.*;
import org.testing.Pages.Login;

public class TC1 extends Base_class {
	
	@Test
	public void test() throws InterruptedException, IOException
	{
		
		Login lo=new Login(driver,pr);
		lo.loginpage("tesmin5666@gmail.com", "mintes233");
		/*************Event Code*************************/
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//yt-formatted-string[text()='Explore']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("(.//a[@id='destination-content-root'])[1]")).click();
		Thread.sleep(2000);
		
		/*************Logout Code*************************/
		driver.findElement(By.xpath(pr.getProperty("profile_button"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(pr.getProperty("signout_button"))).click();	
	}
}
