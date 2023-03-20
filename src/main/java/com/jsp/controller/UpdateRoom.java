package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Room;
import com.jsp.service.RoomService;
@WebServlet("/updateroom")
public class UpdateRoom extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String sid = req.getParameter("id");
		int id = Integer.parseInt(sid);
		String sid1 = req.getParameter("price");
		double price = Double.parseDouble(sid1);
		Room room = new Room();
		room.setRoom_id(id);
		room.setRoom_price(price);

		RoomService roomService = new RoomService();
		roomService.update(room);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("LandlordOnly.jsp");
		 requestDispatcher.forward(req, resp);

	}
}
