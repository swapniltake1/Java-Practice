package com.servlet.attribute;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class S1
 */
@WebServlet("/S1")
public class S1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public S1() {
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
        
		PrintWriter printWriter=response.getWriter();
		
		String n1=request.getParameter("n1");
		String n2=request.getParameter("n2");
		
		int nn1=Integer.parseInt(n1);
		int nn2=Integer.parseInt(n2);
		
		// Addition 
		int s=nn1+nn2;
		
		printWriter.println("<h2>This is S1 == here is sum from get method "+s+"</h2>");
		
		
		
	}

	
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
        response.setContentType("text/html");
        
		PrintWriter printWriter=response.getWriter();
		
		String n1=request.getParameter("n1");
		String n2=request.getParameter("n2");
		
		int nn1=Integer.parseInt(n1);
		int nn2=Integer.parseInt(n2);
		
		// Addition 
		int s=nn1+nn2;
		
		//attribute
		
		request.setAttribute("sum", s);
		
		// forword request----
		
		RequestDispatcher rd=request.getRequestDispatcher("S2");
		rd.forward(request, response);
		
	}

	
	
	
}
