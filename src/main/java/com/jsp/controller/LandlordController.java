package com.jsp.controller;

import java.util.ArrayList;
import com.jsp.dto.Hotel;
import com.jsp.dto.LandLord;
import com.jsp.dto.Room;
import com.jsp.service.HotelService;
import com.jsp.service.LandlordService;
import com.jsp.service.RoomService;

public class LandlordController {
	public static void main(String[] args) {

		LandLord landLord1 = new LandLord();
		LandLord landLord2 = new LandLord();
		LandLord landLord3 = new LandLord();
		landLord1.setId(1);
		landLord2.setId(2);
		landLord3.setId(3);

		Hotel hotel = new Hotel();
		hotel.setHotel_name("TAJ HOTEL");
		hotel.setHotel_location("MUMBAI");
		hotel.setNum_of_rooms(3);
		hotel.setRating(4);
		hotel.setLandLord(landLord1);

		Hotel hotel2 = new Hotel();
		hotel2.setHotel_name("THE LALIT");
		hotel2.setHotel_location("MUMBAI");
		hotel2.setNum_of_rooms(3);
		hotel2.setRating(4);
		hotel2.setLandLord(landLord2);

		Hotel hotel3 = new Hotel();
		hotel3.setHotel_name("IBIS");
		hotel3.setHotel_location("VASHI");
		hotel3.setNum_of_rooms(3);
		hotel3.setRating(5);
		hotel3.setLandLord(landLord3);

		Room room1 = new Room();
		room1.setRoom_price(2000.00);
		room1.setRoom_status("AVAILABLE");
		room1.setHotel(hotel);

		Room room2 = new Room();
		room2.setRoom_price(1000.00);
		room2.setRoom_status("AVAILABLE");
		room2.setHotel(hotel);

		Room room3 = new Room();
		room3.setRoom_price(3000.00);
		room3.setRoom_status("AVAILABLE");
		room3.setHotel(hotel);

		Room room4 = new Room();
		room4.setRoom_price(2000.00);
		room4.setRoom_status("AVAILABLE");
		room4.setHotel(hotel2);

		Room room5 = new Room();
		room5.setRoom_price(1000.00);
		room5.setRoom_status("AVAILABLE");
		room5.setHotel(hotel2);

		Room room6 = new Room();
		room6.setRoom_price(3000.00);
		room6.setRoom_status("AVAILABLE");
		room6.setHotel(hotel2);

		Room room7 = new Room();
		room7.setRoom_price(2000.00);
		room7.setRoom_status("AVAILABLE");
		room7.setHotel(hotel3);

		Room room8 = new Room();
		room8.setRoom_price(1000.00);
		room8.setRoom_status("AVAILABLE");
		room8.setHotel(hotel3);

		Room room9 = new Room();
		room9.setRoom_price(3000.00);
		room9.setRoom_status("AVAILABLE");
		room9.setHotel(hotel3);

		ArrayList<Room> roomAl = new ArrayList<Room>();
		roomAl.add(room1);
		roomAl.add(room2);
		roomAl.add(room3);

		ArrayList<Room> roomAl2 = new ArrayList<Room>();
		roomAl2.add(room4);
		roomAl2.add(room5);
		roomAl2.add(room6);

		ArrayList<Room> roomAl3 = new ArrayList<Room>();
		roomAl3.add(room7);
		roomAl3.add(room8);
		roomAl3.add(room9);

//		SETTING ROOMS FOR EVERY HOTELS
		hotel.setRoom(roomAl);
		hotel2.setRoom(roomAl2);
		hotel3.setRoom(roomAl3);

		ArrayList<Hotel> hotelAl = new ArrayList<Hotel>();
		hotelAl.add(hotel);
		ArrayList<Hotel> hotelAl1 = new ArrayList<Hotel>();
		hotelAl1.add(hotel2);
		ArrayList<Hotel> hotelAl2 = new ArrayList<Hotel>();
		hotelAl2.add(hotel3);

//		SETTING HOTEL ARRAYLIST TO LANDLORDS

		landLord1.setHotels(hotelAl);
		landLord2.setHotels(hotelAl1);
		landLord3.setHotels(hotelAl2);

		LandlordService landlordService = new LandlordService();
		landlordService.update(landLord1);
		landlordService.update(landLord2);
		landlordService.update(landLord3);

		HotelService hotelService = new HotelService();
		hotelService.create(hotel);
		hotelService.create(hotel2);
		hotelService.create(hotel3);

		RoomService roomService = new RoomService();
		roomService.create(room1);
		roomService.create(room2);
		roomService.create(room3);
		roomService.create(room4);
		roomService.create(room5);
		roomService.create(room6);
		roomService.create(room7);
		roomService.create(room8);
		roomService.create(room9);

	}
}
