package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Admin;
import com.jsp.service.AdminService;

@WebServlet("/updateadmin")
public class UpdateAdmin extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String sid = req.getParameter("id");
		int id = Integer.parseInt(sid);
		String name = req.getParameter("name");
		String email = req.getParameter("emaild");
		Admin admin = new Admin();
		admin.setAdmin_id(id);
		admin.setAdmin_name(name);
		admin.setEmail_id(email);

		AdminService adminService = new AdminService();
		adminService.update(admin);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("AdminHome.html");
		 requestDispatcher.forward(req, resp);
	}

}
