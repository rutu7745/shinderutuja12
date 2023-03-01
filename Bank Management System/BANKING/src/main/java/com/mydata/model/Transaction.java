package com.mydata.model;

public class Transaction
{
private int Accountno1;
private String ifsCode1;
private int Accountno2;
private String ifsCode2;
private float Amount;
public Transaction(){}
public Transaction( int Accountno1 ,String ifsCode1 , float Amount)
{
this.Accountno1 = Accountno1 ;
this.ifsCode1=ifsCode1;
	this.Amount=Amount;
}

public int getAccountno1() {
	return Accountno1;
}
public void setAccountno1(int accountno1) {
	Accountno1 = accountno1;
}
public String getIfsCode1() {
	return ifsCode1;
}
public void setIfsCode1(String ifsCode1) {
	this.ifsCode1 = ifsCode1;
}
public int getAccountno2() {
	return Accountno2;
}
public void setAccountno2(int accountno2) {
	Accountno2 = accountno2;
}
public String getIfsCode2() {
	return ifsCode2;
}
public void setIfsCode2(String ifsCode2) {
	this.ifsCode2 = ifsCode2;
}
public float getAmount() {
	return Amount;
}
public void setAmount(float amount) {
	Amount = amount;
}
public Transaction(int accountno1, String ifsCode1, int accountno2, String ifsCode2, float amount) {
	super();
	Accountno1 = accountno1;
	this.ifsCode1 = ifsCode1;
	Accountno2 = accountno2;
	this.ifsCode2 = ifsCode2;
	Amount = amount;
}
@Override
public String toString() {
	return "Transaction [Accountno1=" + Accountno1 + ", ifsCode1=" + ifsCode1 + ", Accountno2=" + Accountno2
			+ ", ifsCode2=" + ifsCode2 + ", Amount=" + Amount + "]";
}


}
