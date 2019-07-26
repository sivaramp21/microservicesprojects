package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.LocationDao;
import com.example.demo.entity.LocationEntity;

@Service("locationService")
public class LocationService {
	
	@Autowired
	private LocationDao locationDao;

	public List getAllLocations() {
		// TODO Auto-generated method stub
		return locationDao.getAllLocations();
	}

	public LocationEntity getLocationStatus(String code) {
		// TODO Auto-generated method stub
		return locationDao.getLocationStatus(code);
	}


}
