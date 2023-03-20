package com.jsp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Hotel;
import com.jsp.service.HotelService;
@WebServlet("/addroomsbyhotel")
public class AddRoomsByHotel extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		int id1  = Integer.parseInt(req.getParameter("id1")); 
		Hotel hotel = new Hotel();
		hotel.setHotel_id(id1);

		int room_id=id;
		HotelService hotelService = new HotelService();
		hotelService.addRoomsByHotelId(room_id, hotel);
		req.getRequestDispatcher("LandLordOnly.jsp").include(req, resp);
		

	}
}
