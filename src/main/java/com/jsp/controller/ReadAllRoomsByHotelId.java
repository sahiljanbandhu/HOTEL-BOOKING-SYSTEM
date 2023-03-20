package com.jsp.controller;

import java.util.List;

import com.jsp.dto.Room;
import com.jsp.service.HotelService;

public class ReadAllRoomsByHotelId {
	public static void main(String[] args) {
		int hotel_id = 1;

		HotelService hotelService = new HotelService();
		List<Room> rooms = hotelService.readAllRoomsByHotelId(hotel_id);

		for (Room room : rooms) {
			System.out.println(room.getRoom_id());
			System.out.println(room.getRoom_price());
			System.out.println(room.getRoom_status());
			System.out.println("hotel id is " + room.getHotel().getHotel_id());
			System.out.println();
		}
	}
}
