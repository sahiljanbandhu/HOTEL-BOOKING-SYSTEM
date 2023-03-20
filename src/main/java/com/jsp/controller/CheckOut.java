package com.jsp.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Room;
import com.jsp.service.CustomerService;

@WebServlet("/checkout")
public class CheckOut extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		int id1 = Integer.parseInt(req.getParameter("id1"));
		int id2 = Integer.parseInt(req.getParameter("id2"));
		int customer_id = id;

		Room room = new Room();
		room.setRoom_id(id1);

		Room room1 = new Room();
		room1.setRoom_id(id2);

		ArrayList<Room> rooms = new ArrayList<Room>();
		rooms.add(room);
		rooms.add(room1);

		CustomerService customerService = new CustomerService();

		System.out.println(customerService.checkIn(customer_id, rooms));
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("CustomerOnly.jsp");
		requestDispatcher.forward(req, resp);
	}
}
