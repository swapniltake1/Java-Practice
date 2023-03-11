package com.user;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")  @MultipartConfig
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		//getting the incoming data
		
		String name=request.getParameter("user_name");
		String password=request.getParameter("user_password");
		String email=request.getParameter("user_email");
		String phone=request.getParameter("user_phone");
// For Checking image file 
		Part img=request.getPart("img");
		String filename=img.getSubmittedFileName();
	//	out.println(filename);
		
	
//		out.println(name);
//		out.println(password);
//		out.println(email);
//		out.println(phone);
//		
		
		// Creating Connection usig JDBC
		
		try {
			
			Thread.sleep(3000);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/swapnildb","root","admin");
			System.out.println("Connection Successfull !!!!");
			// query
			
			String q="insert into users(Name,Password,Email,Phone,Image) values(?,?,?,?,?)";
			
			PreparedStatement statement=con.prepareStatement(q);
			statement.setString(1, name);
			statement.setString(2, password);
			statement.setString(3, email);
			statement.setString(4, phone);
			statement.setString(5, filename);
			
		    statement.executeUpdate();
			
			
			// upload file to folder
			InputStream is=img.getInputStream();
			// make a array for input data
			byte []data=new byte[is.available()];
			// Reading data
				is.read(data);
			// Setting realtime path for storing that data
				String path=request.getRealPath("/")+"img"+File.pathSeparator+filename;
				// Printing the path for data
			//	out.println(path);
				// getting data to write from path
			    FileOutputStream fos=new FileOutputStream(path);
			    // Writting data into local folder 
			    fos.write(data);
			    // closing write function
			    fos.close();
			    // Printing final output 
			   // out.println("Photo Uploaded on folder succesfully !!");
			    out.println("done");
			    
			    
			
		} catch (ClassNotFoundException | SQLException | InterruptedException e) {
			
			e.printStackTrace();
			out.println("error");
		}
	}

}
