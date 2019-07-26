package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.LocationEntity;

public interface LocationRepository extends CrudRepository<LocationEntity, Long> {

	LocationEntity findByPersonCode(String code);

}
