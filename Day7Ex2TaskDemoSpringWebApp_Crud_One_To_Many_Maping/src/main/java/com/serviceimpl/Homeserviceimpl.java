package com.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daoimpl.Homedaoimpl;
import com.model.Supplier;
import com.servicei.Homeservicei;
@Service
public class Homeserviceimpl implements Homeservicei{
	
	@Autowired
	Homedaoimpl hdi;
	
	@Override
	public void saveSupplier(Supplier s) {
		hdi.saveSupplier(s);
		
	}

	@Override
	public List<Supplier> getSuppliers() {
		List<Supplier>list=hdi.getSuppliers();
		return list;
	}
	
	
}
