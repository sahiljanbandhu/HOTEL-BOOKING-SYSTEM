package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Room;
import com.jsp.service.RoomService;
@WebServlet("/readroombyid")
public class ReadRoomById extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String sid = req.getParameter("id");
		int id = Integer.parseInt(sid);

		RoomService roomService = new RoomService();

		Room room = roomService.readById(id);
		System.out.println(room.getRoom_id());
		System.out.println(room.getRoom_price());
		System.out.println(room.getRoom_status());
		System.out.println("Hotel id is " + room.getHotel());
		System.out.println("Customer id is " + room.getCustomer());
		
		PrintWriter printWriter = resp.getWriter();
		printWriter.write("<h2> ID :  <mark>" + room.getRoom_id() + "</mark></h2><h2> Price : <mark>" + room.getRoom_price()
				+ "</mark></h2><h2> Status : <mark>" + room.getRoom_status() + "</mark></h2>"
				+ "</mark></h2><h2> Hotel Id : <mark>" +room.getHotel()+ "</mark></h2>"
				+ "</mark></h2><h2> customer Id : <mark>" +room.getCustomer()+ "</mark></h2>");
	}

}
