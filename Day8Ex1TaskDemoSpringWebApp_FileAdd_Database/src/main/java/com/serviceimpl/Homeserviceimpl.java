package com.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daoi.Homedaoi;
import com.model.Student;
import com.servicei.Homeservicei;
@Service
public class Homeserviceimpl implements Homeservicei{
	@Autowired
	Homedaoi hdi;
	@Override
	public void saveStudent(Student s) {
		hdi.saveStudent(s);
	}
}
