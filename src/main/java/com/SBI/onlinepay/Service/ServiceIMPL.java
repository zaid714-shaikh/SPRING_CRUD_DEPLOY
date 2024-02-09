package com.SBI.onlinepay.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.SBI.onlinepay.Entity.Student;
import com.SBI.onlinepay.dao.daoservice;

@org.springframework.stereotype.Service
public class ServiceIMPL implements Service {

	@Autowired
	private daoservice dao;

	@Override
	public void addcustomer(Student student) {

		dao.addcustomer(student);
	}

	

}
