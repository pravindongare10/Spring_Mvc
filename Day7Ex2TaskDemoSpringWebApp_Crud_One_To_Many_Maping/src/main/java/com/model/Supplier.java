package com.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Supplier{
@Id
	private String supplierId;
	private String supplierName;
	private long supplierMobileNo;
	private String supplierCity;
	@OneToMany
	private Set<Product> po=new HashSet<>();
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
	public Set<Product> getPo() {
		return po;
	}
	public void setPo(Set<Product> po) {
		this.po = po;
	}
	



	
}
