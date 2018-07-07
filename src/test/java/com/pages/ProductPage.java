package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage{
	
	static String ClickProduct = "//*[@id='result_0']/div/div/div/div[2]/div[1]/div[1]/a/h2";
	static String AddToCartButton = "html/body/div[2]/div[2]/div[10]/div[5]/div[3]/div/div/div/form/div/div[1]/div/div/div/div[2]/div[5]/span/span/input";
	//static String AddButton= "//*[@id='siAddCoverage-announce']";
	//static String NoThanksButton= "//*[@id='siNoCoverage-announce']";
	static String CartButton = "html/body/div[1]/div/div[3]/div[2]/div/div/div/div[4]/div/div/div/span[1]/span/span/a";
	static String ProccedToCheckOutButton ="html/body/div[1]/div/div[3]/div[2]/div/div/div/div[4]/div/div/div/span[2]/span/a";
	static String Email = "//*[@id='ap_email']";
	static String ContinueButton = "//*[@id='continue']";
	static String Password = "//*[@id='ap_password']";
	static String signInSubmit = "//*[@id='signInSubmit']";
	
	
	public static void ClickToProduct(WebDriver driver) throws InterruptedException{
		
		driver.findElement(By.xpath(ClickProduct)).click();
		Thread.sleep(5000);
	}
	
	   public static void AddToCartButton (WebDriver driver){
			
			driver.findElement(By.xpath(AddToCartButton)).click();
				
		}
	//public static void AddButton(WebDriver driver){
		
		//driver.findElement(By.xpath(AddButton)).click();			
 //}
	
    //public static void NoThanksButton (WebDriver driver){		
	//driver.findElement(By.xpath(NoThanksButton)).click();
	//	}
	public static void CartButton (WebDriver driver){
		driver.findElement(By.xpath(CartButton)).click();
	}
	
	public static void ProccedToCheckOutButton (WebDriver driver){
		driver.findElement(By.xpath(ProccedToCheckOutButton)).click();
	}
	public static void Email (WebDriver driver) throws InterruptedException{
	driver.findElement(By.xpath(Email)).sendKeys("Siddhartha2in.Ghosh@gmail.com");
	}
	public static void ContinueButton (WebDriver driver){
	  driver.findElement(By.xpath(ContinueButton)).click();
	   }
	public static void Password (WebDriver driver) throws InterruptedException{
    driver.findElement(By.xpath(Password)).sendKeys("hariom@5872");
    }
	public static void signInSubmit (WebDriver driver){
    driver.findElement(By.xpath(signInSubmit)).click();;
    }
}
	
	
   