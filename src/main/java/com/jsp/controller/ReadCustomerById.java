package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Customer;
import com.jsp.service.CustomerService;

@WebServlet("/readcustomerbyid")
public class ReadCustomerById extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String sid = req.getParameter("id");
		int id = Integer.parseInt(sid);
		CustomerService customerService = new CustomerService();
		Customer customer = customerService.readById(id);
		System.out.println(customer.getCustomer_id());
		System.out.println(customer.getCustomer_name());
		System.out.println(customer.getCustomer_phnone_num());
		System.out.println(customer.getCustomer_aadhar_num());
		
		PrintWriter printWriter = resp.getWriter();
		printWriter.write("<h2> ID :  <mark>" + customer.getCustomer_id() + "</mark></h2><h2> Name : <mark>" + customer.getCustomer_name()
				+ "</mark></h2><h2> Phone No. : <mark>" + customer.getCustomer_phnone_num() + "</mark></h2>"
				+ "</mark></h2><h2> Aadhar No. : <mark>" +customer.getCustomer_aadhar_num() + "</mark></h2>");
	}

}
