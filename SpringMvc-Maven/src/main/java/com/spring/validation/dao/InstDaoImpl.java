package com.spring.validation.dao;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.validation.entity.CourseEntity;
import com.spring.validation.entity.InstEntity;

@Repository
public class InstDaoImpl implements InstDao{

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void saveInst(InstEntity instEntity) {
		 CourseEntity courseEntity= new CourseEntity();
		 courseEntity.setCollegeName("nalanda");
		 courseEntity.setCourseName("MBA");
		 courseEntity.setCourseId("1");
		 courseEntity.setLevel("PG");
		 System.out.println("CourseEntity..."+courseEntity );
		 CourseEntity courseEntity1= new CourseEntity();
		 courseEntity.setCollegeName("nalanda");
		 courseEntity.setCourseName("MCA");
		 courseEntity.setCourseId("2");
		 courseEntity.setLevel("PG");
		
		 System.out.println("CourseEntity..."+courseEntity1);
		   Set<CourseEntity> courses=new HashSet<CourseEntity>();
		   courses.add(courseEntity1);
		   courses.add(courseEntity);
		   instEntity.setCourseList(courses);
		   
		Session session=this.sessionFactory.getCurrentSession();
		   Transaction transaction=session.beginTransaction();
		   System.out.println("before Save....");
		   System.out.println(instEntity.getCourseList());
		   session.save(instEntity);
		   System.out.println("after Save..........");
		   transaction.commit();
		   session.close();
		   
	  }

	@Override
	public InstEntity getInst(String anchor) {
		Session session=this.sessionFactory.getCurrentSession();
		Transaction transaction=session.beginTransaction();
		//session.get(InstEntity.class, "rcm-college");
		Query query=session.createQuery("From InstEntity e where e.anchor=:anchor");
		query.setParameter("anchor", anchor);
		query.setMaxResults(1);
		InstEntity instEntity=(InstEntity) query.uniqueResult();
	 	transaction.commit();
		return instEntity;
	}
  }
