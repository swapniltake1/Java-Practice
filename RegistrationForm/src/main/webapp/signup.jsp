<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up Here </title>

 <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
            
</head>
<body style="background: url(img/workplace-with-blue-office-supplies.jpg); background-size: cover; background-attachment: fixed;">
<div class="container">
   <div class="row">
       <div class="col m6 offset-m3">
       
          <div class="card">
               <div class="card-content">
               
                   <h3 style="margin-top: 10px" class="center-align"> Register Here !! </h3>
                   <h6 id="msg" class="center">    </h6>
                   
                   <div class="form center-align">
                <!-- // Creating Form -->
                
                <form action="Register" method="post" id="myform">
                   <input type="text" name="user_name" placeholder="Enter User Name">
                   <input type="password" name="user_password" placeholder="Enter your Password">
                   <input type="email" name="user_email" placeholder="Enter your Email">
                   <input type="text" name="user_phone" placeholder="Enter your Phone">
                   <div class="file-field input-field">
                     <div class="btn">
                         <span>File</span>
                         <input name="img" type="file">
                      </div>
                     <div class="file-path-wrapper">
                      <input class="file-path validate" type="text">
                      </div>
                     </div>
                   
                   <button type="submit" class="btn red">Sign Up</button>
                </form>
                   
                   </div>
 <div class="loader center-align" style="margin-top: 15px; display: none; ">
                               
    <div class="preloader-wrapper big active">
      <div class="spinner-layer spinner-blue">
        <div class="circle-clipper left">
          <div class="circle"></div>
        </div><div class="gap-patch">
          <div class="circle"></div>
        </div><div class="circle-clipper right">
          <div class="circle"></div>
        </div>
      </div>

      <div class="spinner-layer spinner-red">
        <div class="circle-clipper left">
          <div class="circle"></div>
        </div><div class="gap-patch">
          <div class="circle"></div>
        </div><div class="circle-clipper right">
          <div class="circle"></div>
        </div>
      </div>

      <div class="spinner-layer spinner-yellow">
        <div class="circle-clipper left">
          <div class="circle"></div>
        </div><div class="gap-patch">
          <div class="circle"></div>
        </div><div class="circle-clipper right">
          <div class="circle"></div>
        </div>
      </div>

      <div class="spinner-layer spinner-green">
        <div class="circle-clipper left">
          <div class="circle"></div>
        </div><div class="gap-patch">
          <div class="circle"></div>
        </div><div class="circle-clipper right">
          <div class="circle"></div>
        </div>
      </div>
    </div>
    <h5>Please Wait......</h5>
        
                   
                   </div>
               </div>
          </div>
       
       </div>
   </div>


</div>
<script
  src="https://code.jquery.com/jquery-2.2.4.js"
  integrity="sha256-iT6Q9iMJYuQiMWNd9lDyBUStIq/8PuOW33aOqmvFpqI="
  crossorigin="anonymous"></script>
  
  <script>
  $(document).ready(function (){
	  console.log("Page Is Ready........")
	  $("#myform").on('submit',function(event){
		  event.preventDefault();
		  
		 // var f=$(this).serialize();   // when we have text data
		 
		 let f=new FormData(this);   // For sending data with img 
		  console.log(f);
		  
		  $(".loader").show();
		  $(".form").hide();
		  
		  
		  $.ajax({
			  url: "Register",
			  data: f,
			  type:'POST',
			  success: function (data, textStatus, jqXHR){
				  console.log(data);
				//  console.log("Ajax connection successs")
				  $(".loader").hide();
				  $(".form").show();
				  if (data.trim() === 'done')
					  {
					     $("#msg").html("Successfully Registerd  !!")
					     $("#msg").addClass('green-text')
					  } else 
						  {
						  $("#msg").html("Something went wrong on server..... !!")
						   $("#msg").addClass('red-text')
						  }

			  },
			  error: function (jqXHR, textStatus, errorThrown){
				  console.log(data);
				  console.log("Errorrrrr  !!!!!!!!1")
				  $(".loader").hide();
				  $(".form").show();
				  $("#msg").html("Something went wrong on server..... !!")
				  $("#msg").addClass('red-text')
			  },
			  processData: false, contentType:false
		  })
		  
		  
	  })
  })
  </script>
  
  
</body>
</html>