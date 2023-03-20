package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.LandLord;
import com.jsp.service.LandlordService;
@WebServlet("/signupLandlord")
public class SaveLandlord extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter printWriter = resp.getWriter();
		String name = req.getParameter("name");
		String address = req.getParameter("adress");
		String status = req.getParameter("status");
		String username = req.getParameter("username");
		String password = req.getParameter("password");

		LandLord landLord = new LandLord();
		landLord.setName(name);
		landLord.setAddress(address);
		landLord.setStatus(status);
		landLord.setUsername(username);
		landLord.setPassword(password);

		LandlordService landlordService = new LandlordService();
		landlordService.create(landLord);
		
		if(name.isEmpty() || address.isEmpty() || status.isEmpty() || username.isEmpty() ||password.isEmpty()) {
			printWriter.write("<html><body><h2>please fill details</h2></body></html>");
			req.getRequestDispatcher("signupLandlord.jsp").include(req, resp);
		}
		else {
			landlordService.create(landLord);
			req.getRequestDispatcher("LandlordLogin.jsp").include(req, resp);
		}
	}

}
	