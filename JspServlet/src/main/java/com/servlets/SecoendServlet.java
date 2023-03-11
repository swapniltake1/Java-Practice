package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/SecoendServlet")
public class SecoendServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public SecoendServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Secoend Servlet");
		response.setContentType("text/html");
		PrintWriter printWriter=response.getWriter();
		printWriter.println("<h1>This Seconed Servlet using Generic Servlet Class<h1>");
	}

}
