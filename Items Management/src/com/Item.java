package com;
import java.sql.Connection;
import java.sql.DriverManager;

public class Item {
	
	public Connection connect() 
	{
		Connection con = null;
		
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				con= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/it18199086","root","");
				
				//For testing
				System.out.print("Successfully Connected");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			return con;
	}


}
