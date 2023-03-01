package com.mydata.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

public class Register  implements Serializable 
{
	
     private int Accountno;
     private String password;
     private String contactno;
     private String Emailid;
     private String address;
     public Register(){}
	public Register(int accountno, String password, String contactno, String emailid, String address) {
		super();
		Accountno = accountno;
		this.password = password;
		this.contactno = contactno;
		Emailid = emailid;
		this.address = address;
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
		return "Register [Accountno=" + Accountno + ", password=" + password + ", contactno=" + contactno + ", Emailid="
				+ Emailid + ", address=" + address + "]";
	}
     
}
