package com.mydata.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.mydata.model.Transaction;
import com.mydata.util.CreateConnection;

public class TransactionDaoImpl implements TransactionDao
{
	Connection c= CreateConnection.initConnection();
	
	

	
	public int SaveTransaction(Transaction t) {
		int x=0;
		
		
		try
		{
			 
		
				PreparedStatement ps=c.prepareStatement("insert into transaction values(?,?,?,?,?)");
				ps.setInt(1,t.getAccountno1());
				
				ps.setString(2, t.getIfsCode1());
				ps.setInt(3, t.getAccountno2());
				ps.setString(4, t.getIfsCode2());
				ps.setFloat(5, t.getAmount());

		         x =ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
		
		return x;
	}
	
	

}
