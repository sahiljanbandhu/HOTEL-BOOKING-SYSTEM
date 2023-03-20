package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Customer;
import com.jsp.service.CustomerService;
@WebServlet("/updatecustomer")

public class UpdateCustomer extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String sid = req.getParameter("id");
		int id = Integer.parseInt(sid);
		String name = req.getParameter("name");
		String pnoneno = req.getParameter("pnoneno");
		String aadharnumber = req.getParameter("aadharnumber");
		Customer customer = new Customer();
		customer.setCustomer_id(id);
		customer.setCustomer_name(name);
		customer.setCustomer_phnone_num(pnoneno);
		customer.setCustomer_aadhar_num(aadharnumber);

		CustomerService customerService = new CustomerService();
		customerService.update(customer);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("CustomerOnly.jsp");
		 requestDispatcher.forward(req, resp);
	}
}
