package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.service.AdminService;
@WebServlet("/deleteadmin")
public class DeleteAdmin extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String sid = req.getParameter("id");
		int id = Integer.parseInt(sid);
		AdminService adminService = new AdminService();
		adminService.delete(id);

		RequestDispatcher requestDispatcher = req.getRequestDispatcher("onlyadmin.jsp");
		 requestDispatcher.forward(req, resp);


	}
}
