package com.jsp.controller;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.service.RoomService;
@WebServlet("/deleteroom")
public class DeleteRoom extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String sid = req.getParameter("id");
		int id = Integer.parseInt(sid);

		RoomService roomService= new RoomService();
		roomService.deleteById(id);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("LandlordOnly.jsp");
		 requestDispatcher.forward(req, resp);
	}
}
