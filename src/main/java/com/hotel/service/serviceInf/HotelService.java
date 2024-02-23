package com.hotel.service.serviceInf;

import java.util.List;

import com.hotel.service.entity.HotelEntity;

public interface HotelService {

	HotelEntity addHotel(HotelEntity entity);

	HotelEntity getById(String id);

	List<HotelEntity> getAll();

}
