package com.mydata.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mydata.model.Login;
import com.mydata.model.Register;
import com.mydata.util.CreateConnection;

public class LoginDaoImpl implements LoginDao
{

	Connection c=CreateConnection.initConnection();
	   
	public List<Register> Validate(String username,String pass) {
		{
			List<Register> li=new ArrayList<Register>();
			try{
				PreparedStatement ps=c.prepareStatement("select * from register where username=? and password=?");
			    ps.setString(1,username);
			    ps.setString(2, pass);
			   ResultSet rs =ps.executeQuery();
			while(rs.next())
			{
				Register r=new Register();
				/*int ac=rs.getInt("Accountno");
				String pas=rs.getString("password");
				String no=rs.getString("contactno");
				String email=rs.getString("emailid");
				String add=rs.getString("address");
				String name=rs.getString("name");
				String un=rs.getString("username");
				String ifsc=rs.getString("IFSCode");
				Register reg=new Register(ac, name,un,ifsc, pas, no, email, add);*/
				r.setAccountno(rs.getInt("Accountno"));
				r.setPassword(rs.getString("password"));
				r.setContactno(rs.getString("contactno"));
				r.setEmailid(rs.getString("emailid"));
				r.setAddress(rs.getString("address"));
				r.setName(rs.getString("name"));
				r.setUsername(rs.getString("username"));
				r.setIFSCode(rs.getString("IFSCode"));
				r.setAmount(rs.getFloat("Amount"));
				
				
				li.add(r);
			}
			
				
			}catch(Exception e)
			
			{
				System.out.println(e);
			}
			System.out.println("li LoginDSAo = "+li);
			return li;
		}
	}

}
