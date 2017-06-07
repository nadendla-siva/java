package com.spring.validation.service;

import org.springframework.stereotype.Service;

import com.spring.validation.entity.InstEntity;

@Service
public interface InstService {
	
	void saveInst(InstEntity instEntity);
	InstEntity getInst(String anchor);
}
