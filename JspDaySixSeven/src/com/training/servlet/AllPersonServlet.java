package com.training.servlet;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/allPerson.do")
public class AllPersonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AllPersonServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("allPerson.jsp");
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Bharat"));
		persons.add(new Person("Rajat"));
		persons.add(new Person("Ravi"));
		persons.add(new Person("Jai"));
		persons.add(new Person("Rohan"));
		request.setAttribute("persons", persons );
		rd.forward(request, response);	}

}
