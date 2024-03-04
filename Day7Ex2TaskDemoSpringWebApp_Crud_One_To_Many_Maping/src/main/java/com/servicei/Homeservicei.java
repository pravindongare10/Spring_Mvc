package com.servicei;


import java.util.List;

import com.model.Product;
import com.model.Supplier;

public interface Homeservicei {
	
	public void saveSupplier(Supplier s);
	
	public List<Supplier>getSuppliers();
	

}
