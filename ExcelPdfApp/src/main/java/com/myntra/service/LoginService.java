package com.myntra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LoginService {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public boolean check(String userName,String password){
		int i=jdbcTemplate.queryForInt("select count(*) from userlogin where username=? and password=?", userName,password);
		if(i==1){
			return true;
		}
			else{
				return false;
		}
		
	}
}
