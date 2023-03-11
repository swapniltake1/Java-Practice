package com.servlets.httpservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	  System.out.println("This is doGet method");
	  
	  response.setContentType("text/html");
	  PrintWriter printWriter=response.getWriter();
	  printWriter.print("<h1>Hiii this is get method of myservlet class</h1>");
	  printWriter.print(new Date().toString());
	  printWriter.print("<h1>---------------------</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doGet(request, response);
		System.out.println("This is doPost method");
		 response.setContentType("text/html");
		  PrintWriter printWriter1=response.getWriter();
		  printWriter1.print("<h1>Hiii this is doPost method of myservlet class</h1>");
		  printWriter1.print(new Date().toString());
	}

}
