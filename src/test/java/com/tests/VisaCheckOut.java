package com.tests;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;

import com.Utilities.DatabaseUtilities;
import com.Utilities.Utilities;
import com.pages.AddressPage;
import com.pages.HomePage;
import com.pages.ProductPage;


public class VisaCheckOut extends Utilities {
	
	
	@BeforeMethod
	public void setup() throws IOException{
		
		Utilities.initialize();
		
	}
	
	@AfterMethod	
	public void tearDown(){		
		driver.close();
	}
	
	@Test
	public void VisaCheckoutGuestUser() throws InterruptedException, IOException{
		
		String productid = DatabaseUtilities.getProductID();
		HomePage homepage = new HomePage();
		HomePage.searchProduct(productid,driver);
		
		ProductPage productpage = new ProductPage();
		ProductPage.ClickToProduct(driver);
		ProductPage.AddToCartButton(driver);
		Thread.sleep(2000);
		ProductPage.CartButton(driver);
		
			
	}

	@Test
	public void VisaCheckoutGuestUser1() throws IOException, InterruptedException{	
		
		String productid = DatabaseUtilities.getProductID();		
		HomePage.searchProduct(productid,driver);
	      ProductPage productpage = new ProductPage();
    	  ProductPage.ClickToProduct(driver);
		  ProductPage.AddToCartButton(driver);
		  Thread.sleep(2000);
		  ProductPage.ProccedToCheckOutButton(driver);
		
			
	}
	
	@Test
	public void VisaCheckoutGuestUser2() throws IOException, InterruptedException, ParserConfigurationException, SAXException{
		
		String productid = DatabaseUtilities.getProductID();		
		HomePage.searchProduct(productid,driver);		
		ProductPage productpage = new ProductPage();
		ProductPage.ClickToProduct(driver);
		ProductPage.AddToCartButton(driver);
		Thread.sleep(2000);
		ProductPage.ProccedToCheckOutButton(driver);
		ProductPage.Email(driver);
		ProductPage.ContinueButton(driver);
		ProductPage.Password(driver);
		ProductPage.signInSubmit(driver);
		AddressPage.filladdress(driver,"IL");
		
	}
			
	}
	

	