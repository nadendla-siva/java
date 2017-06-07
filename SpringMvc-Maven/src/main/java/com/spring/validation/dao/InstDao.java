package com.spring.validation.dao;

import org.springframework.stereotype.Repository;

import com.spring.validation.entity.InstEntity;

@Repository
public interface InstDao {

	void saveInst(InstEntity instEntity);
	InstEntity getInst(String anchor);
}
