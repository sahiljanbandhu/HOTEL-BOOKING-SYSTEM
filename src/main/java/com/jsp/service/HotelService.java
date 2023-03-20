package com.jsp.service;

import java.util.ArrayList;
import java.util.List;

import com.jsp.dao.HotelDao;
import com.jsp.dto.Hotel;
import com.jsp.dto.Room;

public class HotelService {
	HotelDao hotelDao = new HotelDao();
	RoomService roomService = new RoomService();

	public void create(Hotel hotel) {
		hotelDao.create(hotel);
	}

	public void update(Hotel hotel) {
		hotelDao.update(hotel);
	}

	public void delete(int id) {
		Hotel hotel = hotelDao.readHotelById(id);
		for (Room room : hotel.getRoom()) {
			roomService.deleteById(room.getRoom_id());
		}
		hotelDao.delete(id);
	}

	public Hotel readById(int id) {
		return hotelDao.readHotelById(id);
	}

	public List<Hotel> readAllHotel() {
		List<Hotel> hotels = new ArrayList<Hotel>();
		for (Hotel hotel : hotelDao.readAllHotel()) {
			if (hotel.getLandLord() != null) {
				hotels.add(hotel);
			}
		}
		return hotels;
	}

	public void addRoomsByHotelId(int id, Hotel hotel) {
		Hotel hotel2 = hotelDao.readHotelById(hotel.getHotel_id());
		if (hotel2.getLandLord() != null) {
			Room room = roomService.readById(id);
			room.setHotel(hotel);

			ArrayList<Room> rooms = new ArrayList<Room>();
			rooms.add(room);

			hotel.setRoom(rooms);

			hotelDao.update(hotel);
			roomService.update(room);
		} else {
			System.out.println("Hotel Is Not Approved");
		}
	}

	public List<Room> readAllRoomsByHotelId(int id) {
		return roomService.readAllRoomByHotelId(id);
	}

}
