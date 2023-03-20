package com.jsp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.stream.Stream;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Customer;

public class CustomerDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("nishant");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void create(Customer customer) {
		entityTransaction.begin();
		entityManager.persist(customer);
		entityTransaction.commit();
	}

	public void update(Customer customer) {
		Customer customer2 = entityManager.find(Customer.class, customer.getCustomer_id());
		if (customer2 != null) {
			entityTransaction.begin();
			if (customer.getCustomer_name() != null) {
				customer2.setCustomer_name(customer.getCustomer_name());
			}
			if (customer.getCustomer_phnone_num() != null) {
				customer2.setCustomer_phnone_num(customer.getCustomer_phnone_num());
			}
			if (customer.getCustomer_aadhar_num() != null) {
				customer2.setCustomer_aadhar_num(customer.getCustomer_aadhar_num());
			}
			if (customer.getRooms() != null) {
				customer2.setRooms(customer.getRooms());
			}
			entityManager.merge(customer2);
			entityTransaction.commit();
		}
	}

	public void delete(int id) {
		Customer customer2 = entityManager.find(Customer.class, id);
		if (customer2 != null) {
			entityTransaction.begin();
			entityManager.remove(customer2);
			entityTransaction.commit();
		}
	}

	public Customer readById(int id) {
		return entityManager.find(Customer.class, id);

	}
//	public Stream readByUsername(String username) {
//		
//		String sql ="select username,password from Customer username=? and password=?";
//		
//		Query query = entityManager.createQuery(sql);
//
//		Customer check =entityManager.find(Customer.class, username);
//		return query.getResultStream();
//
//	}
	

	public List<Customer> readAllCustomers() {
		String sql = "Select s From Customer s";
		Query query = entityManager.createQuery(sql);
		return query.getResultList();
	}
}
