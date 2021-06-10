package com.training.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/database.do")
public class DatabaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DatabaseServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Demo> list = new ArrayList<>();
		RequestDispatcher rd = request.getRequestDispatcher("allDemo.jsp");
		String url="jdbc:mysql://localhost:3306/example";
		String userName="debian-sys-maint";
		String password="a48qIJwnTfPENyKp";
		Connection con=null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url,userName,password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from demo");
			
			while(rs.next()) {
			Demo d = new Demo(rs.getInt("id"), rs.getString("name"));
			list.add(d);
			}
			con.close();
			rs.close();
			stmt.close();
			request.setAttribute("demos", list);
			rd.forward(request, response);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
			
			
	}

}
