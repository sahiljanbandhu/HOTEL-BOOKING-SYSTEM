package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Admin;
import com.jsp.dto.LandLord;
import com.jsp.service.AdminService;

@WebServlet("/approvelandlord")
public class ApproveLandlord extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String sid1 = req.getParameter("id1");
		int id1 = Integer.parseInt(sid1);
		
		String sid = req.getParameter("id");
		int id = Integer.parseInt(sid);
		
		Admin admin = new Admin();
		admin.setAdmin_id(id);
		
		LandLord landLord = new LandLord();
		landLord.setId(id1);
		int Landlord_id = id1;

		AdminService adminService = new AdminService();
		adminService.approveLandlordById(Landlord_id, admin);

		RequestDispatcher requestDispatcher = req.getRequestDispatcher("onlyAdmin.jsp");
		requestDispatcher.forward(req, resp);
	}

}
