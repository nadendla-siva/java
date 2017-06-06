package com.spring.validation.service;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.validation.dao.RegisterDao;
import com.spring.validation.entity.RegisterEntity;

@Service
public class RegisterServiceImpl implements RegisterService{
	
	@Autowired
	private RegisterDao registerDao;

	Logger logger=Logger.getLogger(RegisterService.class);
	
	public void setRegisterDao(RegisterDao registerDao) {
		this.registerDao = registerDao;
	}



	public void insert(RegisterEntity registerEntity) {

		//String password=RandomStringUtils.randomAlphanumeric(6);
		registerEntity.setPassword(RandomStringUtils.randomAlphanumeric(6));
		logger.debug("insert() in Registration Service Class");
		registerDao.Insert(registerEntity);
		
	}



	public RegisterEntity getLogin(String email) {
		logger.debug("getLogin() in Registration Service Class");
		return registerDao.getLogin(email);
	}

}
