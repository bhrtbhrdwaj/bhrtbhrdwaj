package com.training.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name = "ShowPersonServlet", urlPatterns = {"/showPerson.do"}, initParams={
@WebInitParam(name="name", value="Not provided"), 
@WebInitParam(name="email", value="Not provided")})
public class ShowPersonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ShowPersonServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("person.jsp");
	request.setAttribute("person", new Person("Bharat"));
	rd.forward(request, response);
	}

}
