package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.LocationEntity;
import com.example.demo.repository.LocationRepository;

@Repository("locationDao")
public class LocationDao {
	@Autowired
	private LocationRepository locationRepository;

	public List getAllLocations() {
		// TODO Auto-generated method stub
		return (List) locationRepository.findAll();
	}

	public LocationEntity getLocationStatus(String code) {
		// TODO Auto-generated method stub
		return locationRepository.findByPersonCode(code);
	}

}
