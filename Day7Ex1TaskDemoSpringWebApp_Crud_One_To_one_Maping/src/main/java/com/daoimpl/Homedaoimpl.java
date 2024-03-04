package com.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.daoi.Homedaoi;
import com.model.Product;
@Repository
public class Homedaoimpl implements Homedaoi {
	
	@Autowired
	SessionFactory sf;
	



	@Override
	public void saveProduct(Product p) {
		
		Session session=sf.openSession();
		session.save(p);
		session.beginTransaction().commit();
	}


@Override
public List<Product> getProduct() {
	Session session=sf.openSession();
	return session.createQuery("from Product").getResultList();
}


}
