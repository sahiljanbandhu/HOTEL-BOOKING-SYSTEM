package com.jsp.controller;

import java.util.ArrayList;
import com.jsp.dto.Admin;
import com.jsp.dto.LandLord;
import com.jsp.service.AdminService;
import com.jsp.service.LandlordService;

public class AdminController {
	public static void main(String[] args) {
		Admin admin = new Admin();
		admin.setAdmin_name("SAHIL");
		admin.setEmail_id("sahil14498@gmail.com");

		LandLord landLord = new LandLord();
		landLord.setName("NISHNAT");
		landLord.setAddress("NERUL");
		landLord.setAdmin(admin);
		LandLord landLord1 = new LandLord();
		landLord1.setName("SNEHA");
		landLord1.setAddress("VASHI");
		landLord1.setAdmin(admin);
		LandLord landLord2 = new LandLord();
		landLord2.setName("SABURI");
		landLord2.setAddress("NAVI MUMBAI");
		landLord2.setAdmin(admin);

		ArrayList<LandLord> landLords = new ArrayList<LandLord>();
		landLords.add(landLord);
		landLords.add(landLord1);
		landLords.add(landLord2);

		admin.setLandLords(landLords);

		AdminService adminService = new AdminService();
		adminService.create(admin);

		LandlordService landlordService = new LandlordService();
		landlordService.create(landLord);
		landlordService.create(landLord1);
		landlordService.create(landLord2);
		System.out.println("");

	}
}
