package com.mydata.dao;

import java.sql.PreparedStatement;
import java.util.List;

import com.mydata.model.Register;

public interface RegisterDao
{
public int save(Register r);
public List<Register> Deposit(int Accountno,String IFSCode);
public int Deposit1(int Accountno,String IFSCode,Float Amount);
public List<Register> Withdraw(int Accountno,String IFSCode);
public int    Withdraw1(int Accountno,String IFSCode,Float Amount);
}
