<!DOCTYPE html>
<html lang="en">
<head>
  <title>Register Form</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
 <jsp:include page="Home.jsp"></jsp:include>
   
   
    <%String str=request.getParameter("un");
    String pwd=request.getParameter("pwd");

   
   if(str==null){
    %> <section class="h-100 h-custom" style="background-color: #8fc4b7;">
        <div class="container py-5 h-100">
          <div class="row d-flex justify-content-center align-items-center h-100">
            <div class="col-lg-8 col-xl-6">
              <div class="card rounded-3">
                <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-registration/img3.webp"
                  class="w-100" style="border-top-left-radius: .3rem; border-top-right-radius: .3rem;"
                  alt="Sample photo">
                <div class="card-body p-4 p-md-5">
                  <h3 class="mb-4 pb-2 pb-md-0 mb-md-5 px-md-2">Transaction Form</h3>
           
               <form  action="TransactionServlet" method="post" class="px-md-2">
      
                 <input type="hidden" value="<%=str%>" name="user"><input type="hidden" value="<%=pwd%>" name="pwd">
                          
                    <div class="form-outline mb-4">
                        <label class="form-label" for="form3Example1q">Enter Account No 2:</label>
                      <input type="number" name="accno" id="form3Example1q" class="form-control" />
                    
                    </div>
                    <div class="form-outline mb-4">
                        <label class="form-label" for="form3Example1q">Enter IFSC Code 2:</label>
                      <input type="text" name="ifsc" id="form3Example1q" class="form-control" />
                    
                    </div>
                    <div class="form-outline mb-4">
                        <label class="form-label" for="form3Example1q">Enter Amount:</label>
                      <input type="text" name="amt" id="form3Example1q" class="form-control" />
                    
                    </div>
            
                
   <button type="submit" class="btn btn-success btn-lg mb-1">Submit</button>
      
                  </form>
               
     
     

      
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>

    <%}else{%>
     <section class="h-100 h-custom" style="background-color: #8fc4b7;">
        <div class="container py-5 h-100">
          <div class="row d-flex justify-content-center align-items-center h-100">
            <div class="col-lg-8 col-xl-6">
              <div class="card rounded-3">
                <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-registration/img3.webp"
                  class="w-100" style="border-top-left-radius: .3rem; border-top-right-radius: .3rem;"
                  alt="Sample photo">
                <div class="card-body p-4 p-md-5">
                  <h3 class="mb-4 pb-2 pb-md-0 mb-md-5 px-md-2">Transaction Form</h3>
                  <%
                  
                    String  value= request.getParameter("value");
                  //System.out.println(value);
                  String demo="invalid";
                  if(value!=null)
                  {                  
                  
                  %>
                                    <h4><i>Account number and ifsc code invalid</i></h4>
                  
                  <%} %>
                  <form  action="TransactionServlet" method="post" class="px-md-2">
      
                 
                   <input type="hidden" value="<%=str%>" name="user"><input type="hidden" value="<%=pwd%>" name="pwd">        
                    <div class="form-outline mb-4">
                        <label class="form-label" for="form3Example1q">Enter Account No 2:</label>
                      <input type="number" name="accno" id="form3Example1q" class="form-control" />
                    
                    </div>
                    <div class="form-outline mb-4">
                        <label class="form-label" for="form3Example1q">Enter IFSC Code 2:</label>
                      <input type="text" name="ifsc" id="form3Example1q" class="form-control" />
                    
                    </div>
                    <div class="form-outline mb-4">
                        <label class="form-label" for="form3Example1q">Enter Amount:</label>
                      <input type="text" name="amt" id="form3Example1q" class="form-control" />
                    
                    </div>
            
                
   <button type="submit" class="btn btn-success btn-lg mb-1">Submit</button>
      
                  </form>
     

      
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>    
   
  
    <%} %>
</body>
</html>


