package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.LandLord;
import com.jsp.service.LandlordService;

@WebServlet("/updatelandlord")
public class UpdateLandlord extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String sid = req.getParameter("id");
		int id = Integer.parseInt(sid);
		String name = req.getParameter("name");
		String address = req.getParameter("address");
		String status = req.getParameter("status");
		LandLord landLord = new LandLord();
		landLord.setId(id);
		landLord.setName(name);
		landLord.setAddress(address);
		landLord.setStatus(status);

		LandlordService landlordService = new LandlordService();
		landlordService.update(landLord);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("LandlordOnly.jsp");
		 requestDispatcher.forward(req, resp);
	}
}
