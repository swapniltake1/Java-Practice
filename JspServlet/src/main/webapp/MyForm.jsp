<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> MyForm</title>

<style>
.container{
width: 30%;
border: 1px solid black;
margin: auto;
padding: 20px;
font-size: 20px;
}

#myform table tr td input{
 font-size:20px;
}

</style>
</head>
<body>
 <div class="container">
 
 <h1> MyForm </h1>
 
 <form action="RegisterServlet" method="post" id="myform">
     <table>
       <tr> 
           <td> Enter Your Name : </td>
           <td> <input type="text" name="username" placeholder="Enter Name"/> </td>
       </tr>
       
       <tr>
           <td> Enter Your Password : </td>
           <td> <input type="password" name="password" placeholder="Enter Password"/> </td>
       </tr>
       
       <tr>
           <td> Enter Your Email : </td>
           <td> <input type="email" name="email" placeholder="Enter Email"/> </td>
       </tr>
       
        <tr>
           <td> Enter Your Education : </td>
           <td>
           <select name="education">
                    <option>Select</option>
                    <option value="B.Tech">B.Tech</option>
                    <option value="B.E">B.E</option>
                    <option value="Bsc">BSC</option>
                    <option value="BCA">BCA</option>
                    <option value="Diploma">Diploma</option>
           </select>
           </td>
       </tr>
       
       <tr>
           <td> Enter Your Gender : </td>
           <td> <input type="radio" name="usergender" value="male " /> Male <input type="radio" name="usergender" value="female" /> Female </td>
       </tr>
       
       <tr>
           <td style="text-align: right;">
                <input type="checkbox" value="checked" name="TermsAndCondition" />
           </td>
           <td>
                Agree with terms and conditions
           </td>
       </tr>
      <tr>
          <td/>
          
          <td>
              <button type="submit">Apply Now</button>
              <button type="reset"> Reset</button>
          </td>
       </tr>
       
     </table>
 </form>
 </div>
</body>
</html>