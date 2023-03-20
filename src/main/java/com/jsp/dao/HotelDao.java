package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Hotel;

public class HotelDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("nishant");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void create(Hotel hotel) {
		entityTransaction.begin();
		entityManager.persist(hotel);
		entityTransaction.commit();
	}

	public void update(Hotel hotel) {
		Hotel hotel2 = entityManager.find(Hotel.class, hotel.getHotel_id());
		if (hotel2 != null) {
			entityTransaction.begin();
			if (hotel.getHotel_name() != null) {
				hotel2.setHotel_name(hotel.getHotel_name());
			}
			if (hotel.getHotel_location() != null) {
				hotel2.setHotel_location(hotel.getHotel_location());
			}
			if (hotel.getNum_of_rooms() != null) {
				hotel2.setNum_of_rooms(hotel.getNum_of_rooms());
			}
			if (hotel.getRating() != null) {
				hotel2.setRating(hotel.getRating());
			}
			if (hotel.getLandLord() != null) {
				hotel2.setLandLord(hotel.getLandLord());
			}
			if (hotel.getRoom() != null) {
				hotel2.setRoom(hotel.getRoom());
			}
			entityManager.merge(hotel2);
			entityTransaction.commit();
		}
	}

	public void delete(int id) {
		Hotel hotel2 = entityManager.find(Hotel.class, id);
		entityTransaction.begin();
		entityManager.remove(hotel2);
		entityTransaction.commit();
	}

	public Hotel readHotelById(int id) {
		return entityManager.find(Hotel.class, id);
	}

	public List<Hotel> readAllHotel() {
		String sql = "Select s From Hotel s";
		Query query = entityManager.createQuery(sql);
		List<Hotel> hotels = query.getResultList();
		return hotels;
	}
}
