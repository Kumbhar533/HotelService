package com.hotel.service.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "hotel_enity")
public class HotelEntity {

	@Id
	@Column(name = "Id")
	private String id;

	@Column(name = "Name")
	private String name;

	@Column(name = "About")
	private String about;

	@Column(name = "Location")
	private String location;

}
