package com.jsp.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import java.util.List;
import com.jsp.dao.AdminDao;
import com.jsp.dto.Admin;
import com.jsp.dto.LandLord;

public class AdminService {
	AdminDao adminDao = new AdminDao();
	LandlordService landlordService = new LandlordService();

	public void create(Admin admin) {
		adminDao.create(admin);
	}

	public void update(Admin admin) {
		adminDao.update(admin);
	}

	public void delete(int id) {
		Admin admin = adminDao.readById(id);

		for (LandLord landLord : admin.getLandLords()) {
			landlordService.delete(landLord.getId());
		}
		adminDao.delete(id);
	}

	public Admin readById(int id) {
		return adminDao.readById(id);
	}

	public List<Admin> readAllAdmin() {
		return adminDao.readAllAdmin();
	}

	public List<LandLord> readAllUnapprovedLandlords() {
		List<LandLord> landLords = landlordService.readAllLandlord();
		List<LandLord> landLords2 = new ArrayList<LandLord>();

		for (LandLord landLord : landLords) {
			if (landLord.getStatus().equalsIgnoreCase("Not Approved")) {
				landLords2.add(landLord);
			}
		}
		return landLords2;
	}

	public List<LandLord> readAllApprovedLandlords() {
		List<LandLord> landLords = landlordService.readAllLandlord();
		List<LandLord> landLords2 = new ArrayList<LandLord>();

		for (LandLord landLord : landLords) {
			if (landLord.getStatus().equalsIgnoreCase("Approved")) {
				landLords2.add(landLord);
			}
		}
		return landLords2;
	}

	public void approveLandlordById(int id, Admin admin) {

		LandLord landLord = landlordService.readById(id);
		landLord.setAdmin(admin);
		landLord.setStatus("APPROVED");

		ArrayList<LandLord> landLords = new ArrayList<LandLord>();
		landLords.add(landLord);

		admin.setLandLords(landLords);

		adminDao.update(admin);
		landlordService.update(landLord);
	}
	
	HelperConn helperconn= new HelperConn();
	public boolean authenticate(String username,String password) {
		boolean status= false;
		try {
			Connection connection=helperconn.getConnection();
			PreparedStatement preparedStatement= connection.prepareStatement("select * from admin where username=? and password=?");
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			ResultSet resultSet=preparedStatement.executeQuery();
			if (resultSet.next()) 
			{
				status=true;
			}
			connection.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}

}
