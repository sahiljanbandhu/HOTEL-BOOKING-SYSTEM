package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsp.service.AdminService;

@WebServlet("/loginservaletadmin")
public class AdminLogin extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();
		String u = req.getParameter("username");
		String p = req.getParameter("password");
		AdminService adminService = new AdminService();
		if(adminService.authenticate(u,p)) {
			HttpSession httpSession = req.getSession();
			httpSession.setAttribute("adminname", u);
			req.getRequestDispatcher("onlyAdmin.jsp").include(req, resp);
		}
		else {
			printWriter.println("<h2>Incorrect Details</h2>");
			req.getRequestDispatcher("loginAdmin.html").include(req, resp);
		}
		printWriter.close();		
	}
}
