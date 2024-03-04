package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Supplier {
	@Id
	private String supplierId;
	private String supplierName;
	private long supplierMobileNo;
	private String supplierCity;
	public String getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public long getSupplierMobileNo() {
		return supplierMobileNo;
	}
	public void setSupplierMobileNo(long supplierMobileNo) {
		this.supplierMobileNo = supplierMobileNo;
	}
	public String getSupplierCity() {
		return supplierCity;
	}
	public void setSupplierCity(String supplierCity) {
		this.supplierCity = supplierCity;
	}


	
}
