<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.mydata.model.Register" %>
        <%@ page import="com.mydata.dao.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int accno=Integer.parseInt(request.getParameter("accno"));
String name=request.getParameter("name");
String password=request.getParameter("pwd");
String contactno=request.getParameter("cn");
String emailID=request.getParameter("eid");
String address=request.getParameter("addr");
String username=request.getParameter("un");
String ifsc =request.getParameter("ifsc");
Register r=new Register(accno, name,username,ifsc,password, contactno, emailID, address);
RegisterDao rd=new RegisterDaoImpl();
int x=rd.save(r);

%>
if(x>0)
{
<jsp:forward page="index.jsp"></jsp:forward>
}


</body>
</html>