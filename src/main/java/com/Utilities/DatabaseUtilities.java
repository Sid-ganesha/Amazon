package com.Utilities;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class DatabaseUtilities {
	
	public static String  getProductID(){
		
		Connection conn = null;
		String productid = null;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn=DriverManager.getConnection("jdbc:mysql://localhost/productdetails","root","pa55w0rd");
			System.out.println("Connection is successful");
			
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from product");
			while (rs.next()){
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
				if(Integer.parseInt(rs.getString(2))>0){
					productid =  rs.getString(1);
					break;
				}
			
			}
		}
		catch (Exception e){
			
			System.out.println("Connection Issue" + e.getMessage());
		}
		return productid;
		
	}
}
