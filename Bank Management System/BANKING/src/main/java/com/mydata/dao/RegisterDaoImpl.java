package com.mydata.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mydata.model.Register;
import com.mydata.util.CreateConnection;


public class RegisterDaoImpl implements RegisterDao 
{
Connection c= CreateConnection.initConnection();
	
	public int save(Register r)
	{
		int x=0;
		try{
			PreparedStatement ps=c.prepareStatement("insert into register values(?,?,?,?,?,?,?,?,?)");
			ps.setInt(1, r.getAccountno());
			ps.setString(2, r.getPassword());
			ps.setString(3, r.getContactno());
			ps.setString(4, r.getEmailid());
			ps.setString(5, r.getAddress());
			ps.setString(6,r.getName());
		    ps.setString(7,r.getUsername());
		    ps.setString(8, r.getIFSCode());
		  ps.setFloat(9, r.getAmount());
	         x =ps.executeUpdate();

		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		return x;
		
	}

	public List<Register> Deposit(int Accountno,String IFSCode) {
		List<Register>li=new ArrayList<Register>();
try
{

	PreparedStatement ps=c.prepareStatement("select * from register where  Accountno=? and  IFSCode=?");
	
	ps.setInt(1, Accountno);
	  ps.setString(2,IFSCode);
	  
	ResultSet rs =ps.executeQuery();
	while(rs.next())
	{
		int ac=rs.getInt("Accountno");
		String pas=rs.getString("password");
		String no=rs.getString("contactno");
		String email=rs.getString("emailid");
		String add=rs.getString("address");
		String name=rs.getString("name");
		String un=rs.getString("username");
		String ifsc=rs.getString("IFSCode");
		float amt=rs.getFloat("Amount");
		
		Register r=new Register(ac, name, un, ifsc, pas,no, email, add, amt);
		li.add(r);
	}

	

}catch(Exception e)
{
	System.out.println(e);

}
return li;
}

	public int Deposit1(int Accountno, String IFSCode, Float Amount) 
	{
		int x=0;
		try
		{
		PreparedStatement ps1=c.prepareStatement("update  register set Amount=? where  Accountno=? and  IFSCode=?");
		ps1.setFloat(1,Amount);
		ps1.setInt(2, Accountno);

		ps1.setString(3,IFSCode);
         x=	ps1.executeUpdate();
		
		}catch(Exception e)
		{
			System.out.println(e);
		}
         return x;
	}


	public  List<Register> Withdraw(int Accountno, String IFSCode) {
		List<Register>li=new ArrayList<Register>();
	try
	{

		PreparedStatement ps=c.prepareStatement("select * from register where  Accountno=? and  IFSCode=?");
		
		ps.setInt(1, Accountno);
		  ps.setString(2,IFSCode);
		  
		ResultSet rs =ps.executeQuery();
		while(rs.next())
		{
			int ac=rs.getInt("Accountno");
			String pas=rs.getString("password");
			String no=rs.getString("contactno");
			String email=rs.getString("emailid");
			String add=rs.getString("address");
			String name=rs.getString("name");
			String un=rs.getString("username");
			String ifsc=rs.getString("IFSCode");
			float amt=rs.getFloat("Amount");
			
			Register r=new Register(ac, name, un, ifsc, pas,no, email, add, amt);
			li.add(r);
		}

		

	}catch(Exception e)
	{
		System.out.println(e);

	}
	return li;

}


	public int Withdraw1(int Accountno, String IFSCode, Float Amount) {
		int x=0;
		try{
		PreparedStatement ps1=c.prepareStatement("update  register set Amount=? where  Accountno=? and  IFSCode=?");
		ps1.setFloat(1,Amount);
		ps1.setInt(2, Accountno);

		ps1.setString(3,IFSCode);
         x=	ps1.executeUpdate();
		
		}catch(Exception e)
		{
			System.out.println(e);
		}
         return x;
	}


}

