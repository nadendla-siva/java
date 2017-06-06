package com.spring.validation.service;

import org.springframework.stereotype.Service;

import com.spring.validation.entity.RegisterEntity;

@Service
public interface RegisterService {
	
	void insert(RegisterEntity registerEntity);
	RegisterEntity getLogin(String email);

}
