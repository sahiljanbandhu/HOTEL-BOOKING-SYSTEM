package com.jsp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Customer;
import com.jsp.service.RoomService;
@WebServlet("/readcustomerbyroomid")
public class ReadCustomerByRoomId extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String sid = req.getParameter("id");
		int id = Integer.parseInt(sid);
		RoomService roomService = new RoomService();
		Customer customer = roomService.readCustomerByRoomId(id);

		System.out.println(customer.getCustomer_id());
		System.out.println(customer.getCustomer_name());
		System.out.println("Phone number - " + customer.getCustomer_phnone_num());
		System.out.println("Aadhar Number - " + customer.getCustomer_aadhar_num());
	}
}
