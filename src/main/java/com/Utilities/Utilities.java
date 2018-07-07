package com.Utilities;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.internal.Graph.Node;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class Utilities {
	
	protected static WebDriver driver;
	
	public static String getProperty(String property) throws IOException{
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/env.properties");
		prop.load(fis);		
	    return prop.getProperty(property);
	}

	public static void initialize() throws IOException{
		
		driver = new FirefoxDriver();
		driver.get(Utilities.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	 
	 public static HashMap <String,String> getAddress (String State) throws ParserConfigurationException, SAXException, IOException{
	
	HashMap<String,String> data = new HashMap<String,String>();
	
	String xmlFile = System.getProperty("user.dir") + "//src//main//resources//Address.Xml";
	
	File fxmlFile = new File(xmlFile);
	
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	Document doc = dBuilder.parse(xmlFile);
    NodeList sList= doc.getElementsByTagName(State);
	NodeList sVisaNodeLst = sList.item(0).getChildNodes();
	
	 for(int i = 0;i<sVisaNodeLst.getLength();i++){
		org.w3c.dom.Node node = sVisaNodeLst.item(i);			
		if (node.getNodeType() == node.ELEMENT_NODE){
			// System.out.println("node name:  "  + node.getNodeName());
			// System.out.println("node value:  "  + node.getTextContext());
			
			System.out.println(node.getNodeName() + "*********" + node.getTextContent());
			data.put(node.getNodeName(), node.getTextContent());
			
		}
		
	}
			return data;
		}
}	


