package com.spring.validation.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.validation.entity.RegisterEntity;

@Repository
public class RegisterDaoImpl implements RegisterDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	Logger logger=Logger.getLogger(RegisterDao.class);
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}



	public void Insert(RegisterEntity registerEntity) {
		logger.debug("insert() in RegistrationDao Class"); 
		Session session= this.sessionFactory.getCurrentSession();
		Transaction transaction=session.beginTransaction();
		session.save(registerEntity);
		transaction.commit();
	}
	public RegisterEntity getLogin(String email) {
		logger.debug("get() in RegistrationDao Class"); 
		Session session= this.sessionFactory.getCurrentSession();
		Transaction transaction=session.beginTransaction();
		//RegisterEntity entity=(RegisterEntity)session.get(RegisterEntity.class, email);
		Query query=session.createQuery("From RegisterEntity r where r.email=:email");
		query.setParameter("email", email);
		query.setMaxResults(1);
		RegisterEntity entity=(RegisterEntity) query.uniqueResult();
	 	transaction.commit();
		return entity;
	}

}
