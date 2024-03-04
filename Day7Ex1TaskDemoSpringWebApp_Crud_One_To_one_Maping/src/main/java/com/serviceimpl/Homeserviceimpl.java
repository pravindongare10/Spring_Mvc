package com.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daoi.Homedaoi;
import com.model.Product;
import com.servicei.Homeservicei;
@Service
public class Homeserviceimpl implements Homeservicei{
	
	@Autowired
	Homedaoi hdi;
	

	@Override
	public void saveProduct(Product p) {
		hdi.saveProduct(p);
		
	}

	@Override
	public List<Product> getProduct() {
		List<Product>list=hdi.getProduct();
		return list;
	}
}
