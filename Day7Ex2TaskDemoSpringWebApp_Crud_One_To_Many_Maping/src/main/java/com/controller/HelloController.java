package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Supplier;
import com.serviceimpl.Homeserviceimpl;



@Controller
public class HelloController {
	@Autowired
	Homeserviceimpl hsi;
	@RequestMapping(value = "/")
	public String preLogin() {
	System.out.println("Open Login page");
		return "login";
	}
	

	@RequestMapping(value = "/AddProduct")
	public String proDataAdd() {
		System.out.println("DataAddLoginPage");
		return "p";
	}	
	@RequestMapping(value = "/AddSupplier")
	public String suppDataAdd() {
	System.out.println("DataAddLoginPage");
	return "s";
	}

	@RequestMapping(value = "/save")
	public String saveStudent(@ModelAttribute Supplier s) {
		hsi.saveSupplier(s);
		return "login";
	}

			
	@RequestMapping(value ="/Login")
	public String LoginCheck(@RequestParam String supplierId,@RequestParam String supplierName, Model m) {
	
	if (supplierId.equals("Addmin")&&supplierName.equals("Addmin"))
	{
		System.out.println("login Success page");
		List<Supplier> list=hsi.getSuppliers();
		m.addAttribute("data", list);
		return "success";
	}
	else {
	return "login";
	}
	} 
	
}	
