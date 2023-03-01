	package com.mydata.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mydata.dao.RegisterDao;
import com.mydata.dao.RegisterDaoImpl;
import com.mydata.model.Register;

/**
 * Servlet implementation class DepositServlet
 */
public class DepositServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DepositServlet() {
        super();
        // TODO Auto-generated constructor stub
    }




	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		   response.setContentType("text/html");
	       PrintWriter out=response.getWriter();
	    
	       int accno=Integer.parseInt(request.getParameter("accno"));
	       String ifsc =request.getParameter("ifsc");
	       RegisterDao rd=new RegisterDaoImpl();
         List<Register>r= rd.Deposit(accno, ifsc);
           
           if(!r.isEmpty())
           {
           Register rd1= r.get(0);
           float amt=rd1.getAmount();
           String user=rd1.getUsername();
           String pass=rd1.getPassword();
         //  System.out.println(amt);
           
           
           Float amt1=Float.parseFloat(request.getParameter("amt"));
         //  System.out.println(amt1);
           Float amt2=amt+amt1;
          // System.out.println(amt2);
           int x=rd.Deposit1(accno, ifsc, amt2);
           
          
        	   out.print("Deposited succcessfully!!!!!!");
        	    request.setAttribute("accno",accno);
        	    request.setAttribute("ifsc",ifsc);
        	    request.setAttribute("amt",amt2);
        	    request.setAttribute("un", user);
        	    request.setAttribute("pwd", pass);
        	   
			   request.getRequestDispatcher("Home.jsp?un="+user+"&&pwd="+pass).include(request, response);
           }
           else{
        	  // request.setAttribute("value","invalid");
			   request.getRequestDispatcher("Deposit.jsp?value=invalid").include(request, response);

           }
	       
	     
	       
	
	       
	       
	}

}
