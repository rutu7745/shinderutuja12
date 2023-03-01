package com.mydata.dao;

import java.util.List;

import com.mydata.model.Login;
import com.mydata.model.Register;

public interface LoginDao 
{
	public List<Register>Validate(String user,String pass);


}
