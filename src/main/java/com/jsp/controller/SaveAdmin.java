package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Admin;
import com.jsp.service.AdminService;

@WebServlet("/signupadmin")
public class SaveAdmin extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter printWriter = resp.getWriter();
		String name = req.getParameter("name");
		String email = req.getParameter("Email");
		String username = req.getParameter("username");
		String password = req.getParameter("password");

		Admin admin = new Admin();
		admin.setAdmin_name(name);
		admin.setEmail_id(email);
		admin.setUsername(username);
		admin.setPassword(password);

		AdminService adminService = new AdminService();
		if (name.isEmpty() || email.isEmpty() || username.isEmpty() || password.isEmpty()) {
			printWriter.write("<html><body><h2>please fill details</h2></body></html>");
			req.getRequestDispatcher("signupAdmin.jsp").include(req, resp);
		} else {
			adminService.create(admin);
			req.getRequestDispatcher("AdminLogin.jsp").include(req, resp);
		}
	}
}
