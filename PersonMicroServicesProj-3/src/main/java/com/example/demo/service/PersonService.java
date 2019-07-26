package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PersonDao;
import com.example.demo.entity.PersonEntity;

@Service("personService")
public class PersonService {

	@Autowired
	private PersonDao personDao;

	public List getAllPersons() {
		// TODO Auto-generated method stub
		return personDao.getAllPersons();
	}

	public PersonEntity getPersonStatus(String code) {
		// TODO Auto-generated method stub
		return personDao.getPersonStatus(code);
	}
}
