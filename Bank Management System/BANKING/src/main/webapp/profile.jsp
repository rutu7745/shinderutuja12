<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.Iterator"%>
<%@page import="com.mydata.model.Register"%>
<%@page import="java.util.List"%>
    <%@page import="com.mydata.dao.LoginDaoImpl"%>
<%@page import="com.mydata.dao.LoginDao"%>
<%@page import="com.mydata.model.Login"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<title>Profile </title>
</head>
<body>
   <jsp:include page="Home.jsp"></jsp:include>
<div class="card" style="width: 18rem;">
  <div class="card-body bg-light" >
    <h5 class="card-title">Welcome !!!!!</h5>
    <h6 class="card-subtitle mb-2 text-muted">Your Information</h6>
<%
String un=(request.getParameter("un"));
String pass=request.getParameter("pwd");


LoginDao ld=new LoginDaoImpl();
List<Register>li=ld.Validate(un, pass);
Iterator<Register> it=li.iterator();
while(it.hasNext())
{
	Register rd=it.next(); 
%>
   
 <b>Account No:</b><%=rd.getAccountno()%><br>
  <b>User Name:</b>  <%= rd.getName() %><br>
 <b>Contact No:</b> <%=rd.getContactno()%><br>
 <b>Email Id:</b><%=rd.getEmailid()%><br>
<b>Address:</b>  <%= rd.getAddress()%><br>
<b>Username:</b>  <%= rd.getUsername()%><br>
<b>IfSC code:</b>  <%= rd.getIFSCode()%><br>
<b>Amount:</b>  <%= rd.getAmount()%><br>

  <%} %>
  </div>

 
</div>
</body>
</html>