package com.mydata.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.mydata.model.Register;
import com.mydata.util.CreateConnection;


public class RegisterDaoImpl implements RegisterDao 
{
Connection c= CreateConnection.initConnection();
	
	public int save(Register r)
	{
		int x=0;
		try{
			PreparedStatement ps=c.prepareStatement("insert into register values(?,?,?,?,?)");
			ps.setInt(1, r.getAccountno());
			ps.setString(2, r.getPassword());
			ps.setString(3, r.getContactno());
			ps.setString(4, r.getEmailid());
			ps.setString(5, r.getAddress());
	         x =ps.executeUpdate();

		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		return x;
		
	}

}
