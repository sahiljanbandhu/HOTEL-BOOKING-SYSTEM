package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Admin;
import com.jsp.service.AdminService;
@WebServlet("/readadminbyid")
public class ReadAdminById extends HttpServlet {
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String sid = req.getParameter("id");
			int id = Integer.parseInt(sid);
			AdminService adminService = new AdminService();
			Admin admin = adminService.readById(id);

			System.out.println(admin.getAdmin_id());
			System.out.println(admin.getAdmin_name());
			System.out.println(admin.getEmail_id());
			PrintWriter printWriter = resp.getWriter();
			printWriter.write("<h2> ID :  <mark>" + admin.getAdmin_id() + "</mark></h2><h2> Name : <mark>" + admin.getAdmin_name()
					+ "</mark></h2><h2> Email : <mark>" + admin.getEmail_id() + "</mark></h2>");

		}
	
		}

