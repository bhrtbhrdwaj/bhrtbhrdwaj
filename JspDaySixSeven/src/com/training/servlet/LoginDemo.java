package com.training.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginDemo.do")
public class LoginDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginDemo() {
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url="jdbc:mysql://localhost:3306/example";
		String userName="debian-sys-maint";
		String password="a48qIJwnTfPENyKp";
		Connection con=null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url,userName,password);
			PreparedStatement stmt = con.prepareStatement("select * from demo where id = ?");
			stmt.setInt(1, Integer.parseInt(request.getParameter("id")));
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
			if(rs.getString("name").equals(request.getParameter("name"))) {
				RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
				rd.forward(request, response);
			}else {
				RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
				rd.forward(request, response);
			}	
			}
			}catch(Exception e) {}
			
	}

}
