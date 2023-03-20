package com.jsp.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customer_id;
	private String customer_name;
	private String username;
	private String customer_phnone_num;
	private String customer_aadhar_num;
	private String email;
    private String password;

	

	@OneToMany(mappedBy = "customer")
	private List<Room> rooms;



	public int getCustomer_id() {
		return customer_id;
	}



	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}



	public String getCustomer_name() {
		return customer_name;
	}



	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getCustomer_phnone_num() {
		return customer_phnone_num;
	}



	public void setCustomer_phnone_num(String customer_phnone_num) {
		this.customer_phnone_num = customer_phnone_num;
	}



	public String getCustomer_aadhar_num() {
		return customer_aadhar_num;
	}



	public void setCustomer_aadhar_num(String customer_aadhar_num) {
		this.customer_aadhar_num = customer_aadhar_num;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public List<Room> getRooms() {
		return rooms;
	}



	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
	





	
}
