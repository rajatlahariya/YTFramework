package org.testing.TestScripts;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import org.testing.Base.*;
import org.testing.Pages.Login;
import org.testing.Pages.Logout1;
import org.testing.utilities.LogsCapture;
import org.testing.utilities.Screenshot;

public class TC1 extends Base_class {
	
	@Test
	public void test() throws InterruptedException, IOException
	{
		String expected=null;
		SoftAssert sa=new SoftAssert();
		Login lo=new Login(driver,pr);
		lo.loginpage("tesmin5666@gmail.com", "mintes233");
		//Assert.assertEquals(driver.getCurrentUrl(), expected);
		sa.assertEquals(driver.getCurrentUrl(), expected);
		Screenshot.takeScreenshoot(driver,"E:\\Study Material\\screenshot\\login.jpeg");
		LogsCapture.takelogs("Login","Login Successful");
		/*************Event Code*************************/
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//yt-formatted-string[text()='Explore']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("(.//a[@id='destination-content-root'])[1]")).click();
		Thread.sleep(2000);
		
		/*************Logout Code*************************/
		Logout1 lg=	new Logout1(driver, pr);
		lg.logoutpage();
	}
}
