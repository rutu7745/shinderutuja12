package com.mydata.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mydata.dao.RegisterDao;
import com.mydata.dao.RegisterDaoImpl;
import com.mydata.model.Register;

public class registerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public registerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   response.setContentType("text/html");
	       PrintWriter out=response.getWriter();
   int accno=Integer.parseInt(request.getParameter("accno"));
    String name=request.getParameter("name");
   String password=request.getParameter("pwd");
   String contactno=request.getParameter("cn");
   String emailID=request.getParameter("eid");
   String address=request.getParameter("addr");
   String username=request.getParameter("un");
   String ifsc =request.getParameter("ifsc");
   HttpSession s=request.getSession();
   s.setAttribute("name", name);
   s.setAttribute("Accountno",accno);
       s.setAttribute("Ifsc",ifsc);
   
       
		   Register r=new Register(accno, name, username, ifsc, password, contactno, emailID, address);
		   RegisterDao rd=new RegisterDaoImpl();
		   int x=rd.save(r);
		   if(x>0){
			   out.print("Registerd succcessfully!!!!!!");
			   request.getRequestDispatcher("index.jsp").include(request, response);
		   }
		  
		   
	}

}
