package com.mydata.model;

import java.io.Serializable;



public class Register  implements Serializable 
{
	
     private int Accountno;
     private String name;
     private String username;
     private String IFSCode;
     private String password;
     private String contactno;
     private String Emailid;
     private String address;
     private Float Amount;
     
     public Register(){}


	


	public Register(int accountno, String name, String username, String iFSCode, String password, String contactno,
			String emailid, String address) {
		super();
		Accountno = accountno;
		this.name = name;
		this.username = username;
		IFSCode = iFSCode;
		this.password = password;
		this.contactno = contactno;
		Emailid = emailid;
		this.address = address;
		Amount = 5000f;
	}





	public Register(int accountno, String name, String username, String iFSCode, String password, String contactno,
			String emailid, String address, Float amount) {
		super();
		Accountno = accountno;
		this.name = name;
		this.username = username;
		IFSCode = iFSCode;
		this.password = password;
		this.contactno = contactno;
		Emailid = emailid;
		this.address = address;
		Amount = amount;
	}





	public int getAccountno() {
		return Accountno;
	}


	public void setAccountno(int accountno) {
		Accountno = accountno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getIFSCode() {
		return IFSCode;
	}


	public void setIFSCode(String iFSCode) {
		IFSCode = iFSCode;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Float getAmount() {
		return Amount;
	}





	public void setAmount(Float amount) {
		Amount = amount;
	}





	public String getContactno() {
		return contactno;
	}


	public void setContactno(String contactno) {
		this.contactno = contactno;
	}


	public String getEmailid() {
		return Emailid;
	}


	public void setEmailid(String emailid) {
		Emailid = emailid;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Register [Accountno=" + Accountno + ", name=" + name + ", username=" + username + ", IFSCode=" + IFSCode
				+ ", password=" + password + ", contactno=" + contactno + ", Emailid=" + Emailid + ", address="
				+ address + "]";
	}

}	