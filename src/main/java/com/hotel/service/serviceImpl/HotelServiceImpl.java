package com.hotel.service.serviceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.service.Exception.ResourceNotFoundException;
import com.hotel.service.entity.HotelEntity;
import com.hotel.service.repository.HotelRepository;
import com.hotel.service.serviceInf.HotelService;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelRepository hotelRepository;

	@Override
	public HotelEntity addHotel(HotelEntity entity) {

		String randomId = UUID.randomUUID().toString();

		entity.setId(randomId);

		return this.hotelRepository.save(entity);
	}

	@Override
	public HotelEntity getById(String id) {

		return this.hotelRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Hotel not found exception"));
	}

	@Override
	public List<HotelEntity> getAll() {

		List<HotelEntity> users = this.hotelRepository.findAll();
		return users;
	}

}
