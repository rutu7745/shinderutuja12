package com.mydata.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mydata.dao.LoginDao;
import com.mydata.dao.LoginDaoImpl;
import com.mydata.model.Login;
import com.mydata.model.Register;


public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public loginServlet() {
        super();
       
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		   response.setContentType("text/html");
	       PrintWriter out=response.getWriter();
	       String u=request.getParameter("un");
	       String p=request.getParameter("pwd");
	       System.out.println(p+" "+u);
	       Login l=new Login(u,p);
	       LoginDao ld=new LoginDaoImpl();
	       List<Register>li=ld.Validate(u,p);
	       
	      System.out.println(li);
	      
	       if(li.isEmpty())
	   	{
	    		out.print("<br>");
		   		out.print("<br>");
		   		out.print("<center><b>Invalid username or password!!!!!</b></center>");
		   		request.getRequestDispatcher("index.jsp").include(request,response);
	    	   
	    	   
	   	}else{
	   	

	   		request.setAttribute("un",u);
	    	   request.setAttribute("pwd",p);
	        request.getRequestDispatcher("Home.jsp").forward(request,response);
	    	 
	   	}
	   	
	      }
	

}
