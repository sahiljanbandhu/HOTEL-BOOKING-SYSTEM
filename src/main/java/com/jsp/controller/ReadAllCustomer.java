package com.jsp.controller;

import java.util.List;

import com.jsp.dto.Customer;
import com.jsp.service.CustomerService;

public class ReadAllCustomer {
	public static void main(String[] args) {
		CustomerService customerService = new CustomerService();
		List<Customer> customers = customerService.readAllCustomer();

		for (Customer customer : customers) {
			System.out.println(customer.getCustomer_id());
			System.out.println(customer.getCustomer_name());
			System.out.println(customer.getCustomer_phnone_num());
			System.out.println(customer.getCustomer_aadhar_num());
			System.out.println();
		}

	}
}
