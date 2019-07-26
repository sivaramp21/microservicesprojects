package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.PersonEntity;

public interface PersonRepository extends CrudRepository<PersonEntity, Long> {

	PersonEntity findByPersonCode(String code);

}
