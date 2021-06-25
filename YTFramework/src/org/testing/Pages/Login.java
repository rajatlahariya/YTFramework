package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Login {

	WebDriver driver;
	Properties pr;
	public Login(WebDriver driver,Properties pr)
	{
		this.pr=pr;
		this.driver=driver;
				
		
	}

	public void loginpage(String username,String password) throws InterruptedException
	{
		Actions ac=new Actions(driver);
		WebElement signin=driver.findElement(By.xpath(pr.getProperty("signin_button")));
		signin.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pr.getProperty("email_textbox"))).sendKeys(username);
		ac.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2500);
		driver.findElement(By.xpath(pr.getProperty("password_textbox"))).sendKeys(password);
		Thread.sleep(1000);
		ac.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
	}
}
