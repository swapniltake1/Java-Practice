<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
  <h1> First Jsp Page </h1>
  <%!
  // we can declare here 
  int a=50;
  int b=20;
  
  String name="Swapnil";
  
  public int doSum()
  {
	  return a+b;
  }
  
  public String reverse(){
	  StringBuffer br=new StringBuffer(name);
	  return br.reverse().toString();
  }
  
  %>
  
  <%
  /// we can call from this tag 
  out.println(a);
  out.println(b);
  out.println("=");
  
  out.println(doSum());
  out.println("<br>");
  out.println(reverse());
  
  %>
</body>
</html>