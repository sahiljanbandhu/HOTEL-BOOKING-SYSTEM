package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.LandLord;

public class LandlordDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("nishant");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void create(LandLord landLord) {
		entityTransaction.begin();
		entityManager.persist(landLord);
		entityTransaction.commit();
	}

	public void update(LandLord landLord) {
		LandLord landLord2 = entityManager.find(LandLord.class, landLord.getId());
		if (landLord2 != null) {
			entityTransaction.begin();
			if (landLord.getName() != null) {
				landLord2.setName(landLord.getName());
			}
			if (landLord.getAddress() != null) {
				landLord2.setAddress(landLord.getAddress());
			}
			if (landLord.getHotels() != null) {
				landLord2.setHotels(landLord.getHotels());
			}
			if (landLord.getAdmin() != null) {
				landLord2.setAdmin(landLord.getAdmin());
			}
			entityManager.merge(landLord2);
			entityTransaction.commit();
		} else {
			System.out.println("Id Not Found");
		}
	}

	public void delete(int id) {
		LandLord landLord2 = entityManager.find(LandLord.class, id);
		if (landLord2 != null) {
			entityTransaction.begin();
			entityManager.remove(landLord2);
			entityTransaction.commit();
		}
	}

	public LandLord readById(int id) {
		return entityManager.find(LandLord.class, id);
	}

	public List<LandLord> readAllLandlord() {
		String sql = "select e from LandLord e";
		Query query = entityManager.createQuery(sql);
		List<LandLord> landLords = query.getResultList();
		return landLords;
	}
}
