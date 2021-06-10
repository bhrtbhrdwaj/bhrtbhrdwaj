package com.training.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/signupDemo.do")
public class SignupDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SignupDemo() {
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url="jdbc:mysql://localhost:3306/example";
		String userName="debian-sys-maint";
		String password="a48qIJwnTfPENyKp";
		Connection con=null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url,userName,password);
			PreparedStatement stmt = con.prepareStatement("insert into demo values(?, ?)");
			stmt.setInt(1, Integer.parseInt(request.getParameter("id")));
			stmt.setString(2, request.getParameter("name"));
			int x  = stmt.executeUpdate();
			
			if(x > 0) {
				RequestDispatcher rd = request.getRequestDispatcher("successSignup.jsp");
				rd.forward(request, response);
			}else {
				RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
				rd.forward(request, response);
			}	
			}
			catch(Exception e) {}
			
	
	}

}
