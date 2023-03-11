package com.servlet.attribute;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class S2
 */
@WebServlet("/S2")
public class S2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public S2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		response.setContentType("text/html");
		
		PrintWriter printWriter=response.getWriter();
		
		int nn1=Integer.parseInt(request.getParameter("n1"));
		int nn2=Integer.parseInt(request.getParameter("n2"));
		
		int p=nn1+nn2;
		
		//get attribute
		
		int sum= (int) request.getAttribute("sum");
		
		printWriter.println("<h1>");
		printWriter.println("sum is = "+sum);
		printWriter.print("<br>");
		printWriter.println("Product is = "+p);
		printWriter.println("</h1>");
		
		
	}

}
