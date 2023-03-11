package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/FirstServlet")
public class FirstServlet implements Servlet {

	
	
	ServletConfig config;
    
    @Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.config=config;
		System.out.println("Hiii this is init method  -- Creating object");		
	} 
    
    @Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Servicing----");
		res.setContentType("text/html");
		PrintWriter printWriter =res.getWriter();
		printWriter.println("<h1>Hiiiiiiiiiiiiiiiiiii</h1>");
	}

         
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Object Destoyed");	
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return this.config=config;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "This Servlet Created By Swapnil";
	}

	


}
