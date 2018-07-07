package com.pages;

import org.openqa.selenium.*;

import com.Utilities.Action;

public class HomePage extends Action {

	static String searchField = "//*[@id='twotabsearchtextbox']";
	static String searchButton = "//*[@id='nav-search']/form/div[2]/div/input";
	
	
				
	public static void searchProduct(String productid,WebDriver driver) throws InterruptedException{
	//	driver.findElement(By.xpath(searchField)).sendKeys(productid);
		 setText(driver,searchField,productid);
		 click(driver,searchButton);
		 
	   // driver.findElement(By.xpath(searchButton)).click();
	}    
}
	