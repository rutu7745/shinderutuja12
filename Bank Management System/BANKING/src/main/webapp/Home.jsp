<!DOCTYPE html>
<%@page import="java.util.Iterator"%>
<%@page import="com.mydata.model.Register"%>
<%@page import="java.util.List"%>
<%@page import="com.mydata.dao.LoginDaoImpl"%>
<%@page import="com.mydata.dao.LoginDao"%>
<%@page import="com.mydata.model.Login"%>
<html lang="en">
<head>
  <title>Home page Bank  Management System </title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>

<body background="https://as1.ftcdn.net/v2/jpg/04/63/95/74/1000_F_463957455_aVAb21LseCKQZ9CZ3N0w8KCv0qMG0khQ.jpg">
  <nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
 <%
 String username=request.getParameter("un");
 String pwd=request.getParameter("pwd");

 System.out.println(username);
 System.out.println(pwd);
Register r=new Register();
 %>


      <a class="navbar-brand" href="profile.jsp?un=<%=username%>&&pwd=<%=pwd%>"><b>Profile</b></a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarNavDropdown">
        <ul class="navbar-nav">
           <li class="nav-item">
            <a class="nav-link active" aria-current="" href="Home.jsp?un=<%=username%>&&pwd=<%=pwd%>"><b>Home</b></a>
          </li>
          <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="Transaction.jsp?un=<%=username%>&&pwd=<%=pwd%>"><b>Transaction</b></a>
          </li>
       
          <li class="nav-item">
            <a class="nav-link" href="Deposit.jsp?un=<%=username%>&&pwd=<%=pwd%>"><b>Deposit</b></a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="Withdraw.jsp?un=<%=username%>&&pwd=<%=pwd%>"><b>Withdraw</b></a>
          </li>
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false">
             <b>services</b>
            </a>
            <ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
              <li><a class="dropdown-item" href="#">RD</a></li>
              <li><a class="dropdown-item" href="#">FD</a></li>
             </ul>
          </li>
            <li class="nav-item">
            <a class="nav-link" href="LogoutServlet"><b>Logout</b></a>
          </li>
          
        </ul>
        
      </div>
    </div>
  </nav>
  <br>

</div>


   <% if(request.getAttribute("accno")!=null){%>
 <h1><font color="white">Account no:<%=request.getAttribute("accno") %></font></h1>
   
    <h1><font color="white">Ifsc code:<%=request.getAttribute("ifsc") %></font></h1>
    <h1><font color="white">Acccount Balance:<%=request.getAttribute("amt") %></font></h1>
   
   <%}
    %>
  
</body>
</html>