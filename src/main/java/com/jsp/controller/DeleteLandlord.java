package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.service.LandlordService;

@WebServlet("/deletelandlord")
public class DeleteLandlord extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String sid = req.getParameter("id");
		int id = Integer.parseInt(sid);
		LandlordService landlordService = new LandlordService();
		landlordService.delete(id);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("LandlordOnly.jsp");
		 requestDispatcher.forward(req, resp);
	}

}
