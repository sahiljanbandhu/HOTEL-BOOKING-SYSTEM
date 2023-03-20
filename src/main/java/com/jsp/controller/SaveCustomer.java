package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Customer;
import com.jsp.service.CustomerService;
@WebServlet("/signup")
public class SaveCustomer extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter printWriter = resp.getWriter();
		String name = req.getParameter("name");
		String phoneno = req.getParameter("phoneno");
		String aadharnumber = req.getParameter("adhaar");
		String email=req.getParameter("Email");
		String username=req.getParameter("username");
        String password=req.getParameter("password");

		Customer customer = new Customer();
		customer.setCustomer_name(name);
		customer.setCustomer_phnone_num(phoneno);
		customer.setCustomer_aadhar_num(aadharnumber);
		customer.setEmail(email);
		customer.setUsername(username);
		customer.setPassword(password);
		
		CustomerService customerService = new CustomerService();
//		customerService.create(customer);
		if(name.isEmpty() || phoneno.isEmpty() || email.isEmpty() || aadharnumber.isEmpty() || username.isEmpty() ||password.isEmpty()) {
			printWriter.write("<html><body><h2>please fill details</h2></body></html>");
			req.getRequestDispatcher("signup.html").include(req, resp);
		}
		else {
			customerService.create(customer);
			req.getRequestDispatcher("CustomerLogin.jsp").include(req, resp);
		}
	}
}
