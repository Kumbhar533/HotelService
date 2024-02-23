package com.hotel.service.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.service.entity.HotelEntity;
import com.hotel.service.serviceInf.HotelService;

@RestController
@RequestMapping("/api/hotel")
public class HotelController {

	@Autowired
	private HotelService hotelService;

	@PostMapping
	public ResponseEntity<?> adduser(@RequestBody HotelEntity entity) {

		HotelEntity hotel = this.hotelService.addHotel(entity);

		return new ResponseEntity<>(hotel, HttpStatus.CREATED);

	}

	@GetMapping("/{id}")
	public ResponseEntity<?> getHotelById(@PathVariable String id) {

		HotelEntity hotel = this.hotelService.getById(id);

		return new ResponseEntity<>(hotel, HttpStatus.OK);

	}

	@GetMapping()
	public ResponseEntity<?> getHotelById() {

		List<HotelEntity> hotel = this.hotelService.getAll();

		return new ResponseEntity<>(hotel, HttpStatus.OK);

	}

}
