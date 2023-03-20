package com.jsp.controller;

import java.util.List;

import com.jsp.dto.Admin;
import com.jsp.service.AdminService;

public class ReadAllAdmin {
	public static void main(String[] args) {
		AdminService adminService = new AdminService();

		List<Admin> admins = adminService.readAllAdmin();
		for (Admin admin : admins) {
			System.out.println(admin.getAdmin_id());
			System.out.println(admin.getAdmin_name());
			System.out.println(admin.getEmail_id());
			System.out.println();
		}

	}
}
