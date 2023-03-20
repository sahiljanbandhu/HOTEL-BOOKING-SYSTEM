package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.service.CustomerService;
@WebServlet("/deletecustomer")
public class DeleteCustomer extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String sid = req.getParameter("id");
		int id = Integer.parseInt(sid);
		CustomerService customerService = new CustomerService();
		customerService.delete(id);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("CustomerOnly.jsp");
		 requestDispatcher.forward(req, resp);
	}
}
