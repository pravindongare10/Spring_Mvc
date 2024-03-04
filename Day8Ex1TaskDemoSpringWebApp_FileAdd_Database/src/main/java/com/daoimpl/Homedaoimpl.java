package com.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.daoi.Homedaoi;
import com.model.Student;
@Repository
public class Homedaoimpl implements Homedaoi {
	@Autowired
	SessionFactory sf;
	
	@Override
	public void saveStudent(Student s) {
		Session session=sf.openSession();
		session.save(s);
		session.beginTransaction().commit();
	}

}
