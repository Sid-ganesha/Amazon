package com.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Action {

	public static void click(WebDriver driver, String xpath) throws InterruptedException{
		
		findElement(driver,xpath).click();
		
	}
	
	public static void dropDownSelectByVisibleText(WebDriver driver, String xpath, WebElement element, String texttoselect) throws InterruptedException{
		
		Select dropdownelem = new Select (findElement(driver,xpath));
		dropdownelem.selectByVisibleText(texttoselect);
		
	}
    public static void setText(WebDriver driver, String xpath, String texttoset) throws InterruptedException{
    	
    	findElement(driver,xpath).sendKeys(texttoset);;
		
	}
    public static WebElement findElement(WebDriver driver, String xpath) throws InterruptedException{
    	
    	WebElement elementdef;
    	try{
    		
    		elementdef = driver.findElement(By.xpath(xpath));
    		WebDriverWait wait = new WebDriverWait(driver, 5);
    		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
    	  driver.findElement(By.xpath(xpath));
    	}catch (StaleElementReferenceException e){
    		Thread.sleep(2000);
    		elementdef = driver.findElement(By.xpath(xpath));
    	}
		return elementdef;
    	
  }
}
