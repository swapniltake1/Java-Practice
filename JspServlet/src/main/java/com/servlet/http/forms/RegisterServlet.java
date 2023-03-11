package com.servlet.http.forms;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
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
		printWriter.println("<h2>Welcome to Register Servlet</h2>");
		
		String name=request.getParameter("username");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String education=request.getParameter("education");
		String usergender=request.getParameter("usergender");
		String TermsAndCondition=request.getParameter("TermsAndCondition");
		
		if(TermsAndCondition!=null)
		{
		if(TermsAndCondition.equals("checked")) {
			printWriter.println("<h2>Name :"+name+"</h2>");
			printWriter.println("<h2>password :"+password+"</h2>");
			printWriter.println("<h2>email :"+email+"</h2>");
			printWriter.println("<h2>Education :"+education+"</h2>");
			printWriter.println("<h2>Gender :"+usergender+"</h2>");
			printWriter.println("<h2>T&C :"+TermsAndCondition+"</h2>");
			
			
			// Forword to success servlet.
			
			RequestDispatcher rd=request.getRequestDispatcher("SuccessServlet");
			rd.forward(request, response);
			
		} 
		else{     
			///  Nosting to print  //
			}
		}
		else {
			printWriter.println("<h2> Please Accept T&C</h2>");
			
			//when i want to include output of Myform.jsp page when getting error.
			
			//get the object of RequestDisptacher
			
			RequestDispatcher rd=request.getRequestDispatcher("MyForm.jsp");
			
			// include
			
			rd.include(request, response);
		}
		
		
	}

}
