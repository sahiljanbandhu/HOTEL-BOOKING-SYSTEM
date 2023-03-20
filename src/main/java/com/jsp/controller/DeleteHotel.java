package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.service.HotelService;

@WebServlet("/deletehotel")
public class DeleteHotel extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int id= Integer.parseInt(req.getParameter("id"));
	HotelService hotelService = new HotelService();
	hotelService.delete(id);
	RequestDispatcher requestDispatcher = req.getRequestDispatcher("LandlordOnly.jsp");
	 requestDispatcher.forward(req, resp);
}
}
