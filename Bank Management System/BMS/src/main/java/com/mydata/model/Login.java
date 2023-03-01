package com.mydata.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;


public class Login  implements Serializable
{
	
	private int Accountno;
	private String password;

	public Login(){}
	public Login(int accountno, String password) {
		super();
		Accountno = accountno;
		this.password = password;
	}
	public int getAccountno() {
		return Accountno;
	}
	public void setAccountno(int accountno) {
		Accountno = accountno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Login [Accountno=" + Accountno + ", password=" + password + "]";
	}
	

}
