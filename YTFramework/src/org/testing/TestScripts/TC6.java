package org.testing.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.*;
import org.testing.Base.*;
import org.testing.Pages.Login;
import org.testing.Pages.Logout1;
import org.testing.Pages.Videoplay;

public class TC6 extends Base_class {
	
	@Test
	public void test() throws InterruptedException
	{
		Login lo=new Login(driver,pr);
		lo.loginpage("tesmin5666@gmail.com", "mintes233");		
		/*************Event Code*************************/
		/*driver.findElement(By.xpath(".//yt-formatted-string[@id='video-title']")).click();
		Thread.sleep(3000);*/
		Videoplay vp=new Videoplay(driver,pr);
		vp.video();
		ac.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//yt-formatted-string[@id='simplebox-placeholder']")).click();
		driver.findElement(By.xpath(".//*[@id='contenteditable-root' or @aria-label='Commenting publicly as test admin']")).sendKeys("youtube is automated");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//yt-formatted-string[text()='Comment']")).click();
		Thread.sleep(1000);
	
		/*************Logout Code*************************/
		Logout1 lg=	new Logout1(driver, pr);
		lg.logoutpage();
	}

}
