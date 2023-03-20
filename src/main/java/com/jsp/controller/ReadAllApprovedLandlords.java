package com.jsp.controller;

import java.util.List;

import com.jsp.dto.LandLord;
import com.jsp.service.AdminService;

public class ReadAllApprovedLandlords {
	public static void main(String[] args) {
		AdminService adminService = new AdminService();
		List<LandLord> landLords = adminService.readAllApprovedLandlords();
		for (LandLord landLord : landLords) {
			System.out.println(landLord.getId());
			System.out.println(landLord.getName());
			System.out.println(landLord.getAddress());
			System.out.println(landLord.getStatus());
			System.out.println();
		}
	}
}
