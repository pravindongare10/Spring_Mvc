package com.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.daoi.Homedaoi;
import com.model.Product;
import com.model.Supplier;
@Repository
public class Homedaoimpl implements Homedaoi {
	@Autowired
	SessionFactory sf;
	@Override
	public void saveSupplier(Supplier s) {
		Session session=sf.openSession();
		session.save(s);
		session.beginTransaction().commit();
		
	}
	

@Override
public List<Supplier> getSuppliers() {
	Session session=sf.openSession();
	return session.createQuery("from Supplier").getResultList();
}

}
