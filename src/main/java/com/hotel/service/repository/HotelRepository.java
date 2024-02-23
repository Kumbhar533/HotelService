package com.hotel.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.service.entity.HotelEntity;

public interface HotelRepository extends JpaRepository<HotelEntity, String> {

}
