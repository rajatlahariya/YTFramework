package org.testing.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;
import org.testing.Base.*;

public class TC6 extends Base_class {
	
	@Test
	public void test() throws InterruptedException
	{
		Actions ac=new Actions(driver);
		/*************Login Code*************************/
		driver.findElement(By.xpath("(.//*[@id='button' and @aria-label='Sign in'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//input[@aria-label='Email or phone']")).sendKeys("tesmin5666@gmail.com");
		ac.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2500);
		driver.findElement(By.xpath(".//input[@type='password' and @aria-label='Enter your password']")).sendKeys("mintes233");
		Thread.sleep(1000);
		ac.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		
		/*************Event Code*************************/
		driver.findElement(By.xpath(".//yt-formatted-string[@id='video-title']")).click();
		Thread.sleep(3000);
		ac.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//yt-formatted-string[@id='simplebox-placeholder']")).click();
		driver.findElement(By.xpath(".//*[@id='contenteditable-root' or @aria-label='Commenting publicly as test admin']")).sendKeys("youtube is automated");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//yt-formatted-string[text()='Comment']")).click();
		Thread.sleep(1000);
	
		/*************Logout Code*************************/
		driver.findElement(By.xpath(".//button[@id='avatar-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(.//*[@id='label'])[5]")).click();
	}

}