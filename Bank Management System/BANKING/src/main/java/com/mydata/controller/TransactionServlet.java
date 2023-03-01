package com.mydata.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mydata.dao.LoginDao;
import com.mydata.dao.LoginDaoImpl;
import com.mydata.dao.RegisterDao;
import com.mydata.dao.RegisterDaoImpl;
import com.mydata.dao.TransactionDao;
import com.mydata.dao.TransactionDaoImpl;
import com.mydata.model.Register;
import com.mydata.model.Transaction;


public class TransactionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public TransactionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }



	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		 response.setContentType("text/html");
	       PrintWriter out=response.getWriter();
	       String user=request.getParameter("user");
	       System.out.println("username" +user);
	        String pass =request.getParameter("pwd");
		       System.out.println("password"+pass);

	        int accno2=Integer.parseInt(request.getParameter("accno"));
	    	
	        String ifsCode2 =request.getParameter("ifsc");
	        
	        
	        float Amount=Float.parseFloat(request.getParameter("amt"));
	        //register object
	        RegisterDao rd=new RegisterDaoImpl();
	        
	        //acc1 and ifsc
	        int accno = 0;
	        String ifsc = null;
	         //amount;
	        
	        LoginDao ld=new LoginDaoImpl();
	       List<Register>d1= rd.Deposit(accno2, ifsCode2);
	      
	       if(d1.isEmpty())
	       {
	          
	    	   request.getRequestDispatcher("Transaction.jsp?value=invalid&&un=demo").include(request, response); 
	       }
	       else
	       {
	    	   System.out.println("user = "+user+" pass = "+pass);
		       List<Register> li=ld.Validate(user, pass);
		       System.out.println("li = "+li);
		       Iterator<Register> it=li.iterator();
	       while(it.hasNext())
	       {
	       	Register rd1=it.next(); 
	       	   accno=rd1.getAccountno();
                ifsc=rd1.getIFSCode();
               System.out.println(accno);
               System.out.println(ifsc);
                     float  amount=rd1.getAmount();
                    System.out.println(amount);
                     Float amta2=amount-Amount;
                     System.out.println(amta2);
                    int a=rd.Withdraw1(accno, ifsc, amta2);
	       
	       }
	      
	    Iterator<Register>it1=d1.iterator();
	        while (it1.hasNext()) {
               Register r=it1.next();
               float am=r.getAmount();
               
               Float amt2=am+Amount;
               rd.Deposit1(accno2, ifsCode2, amt2);
				
			}
	   
	       
	       Transaction t =new Transaction(accno, ifsc, accno2, ifsCode2, Amount);
	       TransactionDao td=new TransactionDaoImpl();
	     int x=  td.SaveTransaction(t);
	       
	     
	      if(x>0)
	       {
	    	 request.setAttribute("un",user);

	    	 request.setAttribute("pwd",pass);
	    	  
	    	   request.getRequestDispatcher("Home.jsp?un="+user+"&&pwd="+pass).forward(request, response);
	       }
	      else
	      {
	    	  request.getRequestDispatcher("Transaction.jsp?value=invalid").include(request, response);
	      }
	}

}
}
