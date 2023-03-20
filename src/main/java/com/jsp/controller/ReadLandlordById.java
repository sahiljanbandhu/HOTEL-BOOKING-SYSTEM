package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.LandLord;
import com.jsp.service.LandlordService;
@WebServlet("/readlandlordbyid")
public class ReadLandlordById extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String sid = req.getParameter("id");
		int id = Integer.parseInt(sid);

		LandlordService landlordService = new LandlordService();
		LandLord landLord = landlordService.readById(id);
		System.out.println(landLord.getId());
		System.out.println(landLord.getName());
		System.out.println(landLord.getAddress());
		System.out.println(landLord.getStatus());
		
		PrintWriter printWriter = resp.getWriter();
		printWriter.write("<h2> ID :  <mark>" + landLord.getId()+ "</mark></h2><h2> Name : <mark>" + landLord.getName()
		+ "</mark></h2><h2> Address : <mark>" + landLord.getAddress() + "</mark></h2>"
		+ "</mark></h2><h2> Status : <mark>" +landLord.getStatus() + "</mark></h2>");
		
	}
}
