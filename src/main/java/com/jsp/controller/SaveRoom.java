package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Room;
import com.jsp.service.RoomService;
@WebServlet("/saveroom")
public class SaveRoom extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter printWriter = resp.getWriter();
		String sid = req.getParameter("price");
		double price = Double.parseDouble(sid);
		String status = req.getParameter("status");
		Room room1 = new Room();
		room1.setRoom_price(price);
		room1.setRoom_status(status);

		RoomService roomService = new RoomService();

		if(sid == null || status==null ) {
			printWriter.write("<html><body><h2>please fill details</h2></body></html>");
			req.getRequestDispatcher("RoomSave.jsp").include(req, resp);
		}
		else {
			roomService.create(room1);
			req.getRequestDispatcher("LandlordOnly.jsp").include(req, resp);
		}
		

	}
}
	