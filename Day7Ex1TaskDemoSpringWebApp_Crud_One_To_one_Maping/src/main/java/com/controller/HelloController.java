package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Product;
import com.servicei.Homeservicei;



@Controller
public class HelloController {
	@Autowired
	Homeservicei hsi;
	@RequestMapping(value = "/")
	public String preLogin() {
	System.out.println("Open Login page");
		return "login";
	}
	

	@RequestMapping(value = "/OpenAddPage")
	public String PreRegister() {
		System.out.println("DataAddLoginPage");
		return "DataAddPage";
	}

	@RequestMapping(value = "/save")
	public String saveStudent(@ModelAttribute Product p) {
		hsi.saveProduct(p);
		return "login";
	}

			
	@RequestMapping(value ="/Login")
	public String LoginCheck(@RequestParam String productId,String productName, Model m) {
	
	if (productId.equals("Addmin")&&productName.equals("Addmin"))
	{
		System.out.println("login Success page");
		List<Product> list=hsi.getProduct();
		m.addAttribute("data", list);
	}
	return "success";
	} 
}	
