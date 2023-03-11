package com.servlet.SessionTracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */
@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
            response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		//Geting a cookies 
		
		Cookie[] cookies = request.getCookies();
		
		boolean username=false;
		String name="";
		
		if(cookies==null) 
		{
			out.println("<h1>Hii Please submit your name to see our site</h1>");
			return;
		}
		else {
			for(Cookie c:cookies) {
				String userNameCookie=c.getName();
				if(userNameCookie.equals("user_name")) {
					username=true;
					name=c.getValue();
				}
			}
		}
		if(username)
		{
			out.println("<h1>Hiiii,"+name+"Welcome Back to our site");
		}
		else {
			out.println("<h1>hello, please go to home page and submit your name Thank you!!!! </h1>");
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
