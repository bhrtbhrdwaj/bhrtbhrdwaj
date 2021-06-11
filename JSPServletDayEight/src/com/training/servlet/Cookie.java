package com.training.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie.do")
public class Cookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Cookie() {
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		javax.servlet.http.Cookie cookie = new javax.servlet.http.Cookie("name", request.getParameter("name"));
		cookie.setMaxAge(60 * 60 * 1);
		response.addCookie(cookie);
		
		RequestDispatcher rd = request.getRequestDispatcher("cookie.jsp");
		rd.forward(request, response);
		
	}

}
