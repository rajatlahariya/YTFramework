package org.testing.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandle {

	public static void selectbyValue(WebElement element,String value) {
	Select s=new Select(element);
	s.selectByValue(value);	
	}
	
	public static void selectbyIndex(WebElement element,int index) {
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	
	public static void selectbyVisibleText(WebElement element,String value) {
		Select s=new Select(element);
		s.selectByVisibleText(value);
	}	
}
