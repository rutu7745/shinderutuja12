package com.mydata.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class CreateConnection
{
	
		//JDBC 1st and 2nd step	
		static private String driver="com.mysql.jdbc.Driver";
		static private String url="jdbc:mysql://localhost:3306/bank";
		static private String username="root";
		static private String password="root";
		public static Connection initConnection()
		{
			Connection c=null;		
			try
			{
				Class.forName(driver);
				c=DriverManager.getConnection(url, username, password);
				
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
			return c;
		}
}

