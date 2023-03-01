<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap 5 Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
  <section class="h-100 h-custom" style="background-color: #8fc4b7;">
        <div class="container py-5 h-100">
          <div class="row d-flex justify-content-center align-items-center h-100">
            <div class="col-lg-8 col-xl-6">
              <div class="card rounded-3">
                <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-registration/img3.webp"
                  class="w-100" style="border-top-left-radius: .3rem; border-top-right-radius: .3rem;"
                  alt="Sample photo">
                <div class="card-body p-4 p-md-5">
                  <h3 class="mb-4 pb-2 pb-md-0 mb-md-5 px-md-2">Login Form</h3>
      
                  <form  action="loginServlet" method="post" class="px-md-2">
      
                    <div class="form-outline mb-4">
                        <label class="form-label" for="form3Example1q">Enter Username:</label>
                      <input type="text" name="un" id="form3Example1q" class="form-control" />
                    
                    </div>
                
                    <div class="form-outline mb-4">
                        <label class="form-label" for="form3Example1q">Enter Password:</label>
                      <input type="password" name="pwd" id="form3Example1q" class="form-control" />
                    
                <br>
                
          <button type="submit" class="btn btn-success btn-lg mb-1">Submit</button>
      
                  </form>
                 </div>
                 <div class="signup_link">
          If do not have account  <a href="Register.html"> <button  class="btn-primary">Register</button></a>
        </div>
              </div>
            </div>
          </div>
        </div>
      </section>
  
      
</body>
</html>



