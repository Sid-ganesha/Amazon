package com.pages;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.xml.sax.SAXException;

import com.Utilities.Utilities;

public class AddressPage {
	
	static String FullName = "//*[@id='enterAddressFullName']";
	static String EnterAddressLine1 = "//*[@id='enterAddressAddressLine1']";
	static String EnterAddressLine2 = "//*[@id='enterAddressAddressLine2']";
	static String EnterAddressCity = "//*[@id='enterAddressCity']";
	static String EnterAddressState = "//*[@id='enterAddressStateOrRegion']";
	static String ZipCode = "//*[@id='enterAddressPostalCode']";
	static String CountryCode ="//*[@id='enterAddressCountryCode']";
	// static String KYCIDNumber = "//*[@id='enterAddressTaxId']";
	static String enterAddressPhoneNumber="//*[@id='enterAddressPhoneNumber']";
	static String SecurityAccessCode = "//*[@id='GateCode']";
	
	public static void filladdress(WebDriver driver, String State) throws ParserConfigurationException, SAXException, IOException, InterruptedException{
		
		HashMap <String,String> address = Utilities.getAddress(State);
	
		driver.findElement(By.xpath(FullName)).sendKeys(address.get("FullName"));
		driver.findElement(By.xpath(EnterAddressLine1)).sendKeys(address.get("EnterAddressLine1"));
		driver.findElement(By.xpath(EnterAddressLine2)).sendKeys(address.get("EnterAddressLine2"));
		driver.findElement(By.xpath(EnterAddressCity)).sendKeys(address.get("EnterAddressCity"));
		driver.findElement(By.xpath(EnterAddressState)).sendKeys(address.get("EnterAddressState"));
		driver.findElement(By.xpath(ZipCode)).sendKeys(address.get("ZipCode"));
		driver.findElement(By.xpath(CountryCode)).sendKeys(address.get("CountryCode"));
		//driver.findElement(By.xpath(KYCIDNumber)).sendKeys(address.get("KYCIDNumber"));
		driver.findElement(By.xpath(enterAddressPhoneNumber)).sendKeys(address.get("enterAddressPhoneNumber"));
		driver.findElement(By.xpath(SecurityAccessCode)).sendKeys(address.get("SecurityAccessCode"));
	
		
		}
}
