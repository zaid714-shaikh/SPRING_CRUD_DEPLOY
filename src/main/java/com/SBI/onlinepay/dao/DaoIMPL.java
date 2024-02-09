package com.SBI.onlinepay.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.SBI.onlinepay.Entity.Student;

@Repository
public class DaoIMPL implements daoservice {

	@Autowired
	private SessionFactory sf;

	@Override
	public void addcustomer(Student student) {
		Session s = sf.openSession();
		s.save(student);
		s.beginTransaction().commit();
		System.out.println("Data inserted");

	}

}
