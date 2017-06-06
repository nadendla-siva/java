package com.spring.validation.dao;

import org.springframework.stereotype.Repository;

import com.spring.validation.entity.RegisterEntity;

@Repository
public interface RegisterDao {
	void Insert(RegisterEntity registerEntity);
	RegisterEntity getLogin(String email);
	
}
