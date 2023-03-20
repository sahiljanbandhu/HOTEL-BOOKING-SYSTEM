package com.jsp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.LandLord;
import com.jsp.service.LandlordService;
@WebServlet("/addhotelbylandlord")
public class AddHotelByLandlord extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		int id1  = Integer.parseInt(req.getParameter("id1")); 
		LandLord landLord = new LandLord();
		landLord.setId(id1);

		int hotel_id = id;
		LandlordService landlordService = new LandlordService();
		landlordService.addHotelById(hotel_id, landLord);
		req.getRequestDispatcher("LandLordOnly.jsp").include(req, resp);
	}
}
