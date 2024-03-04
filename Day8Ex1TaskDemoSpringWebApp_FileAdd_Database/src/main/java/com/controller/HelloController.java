package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.model.Student;
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
	

	@RequestMapping(value = "/openregisterpage")
	public String PreRegister() {
		System.out.println("Registor login page");
		return "registor";
	}


	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public String saveStudent(@ModelAttribute Student s, @RequestParam CommonsMultipartFile rc) {
		byte repos[]=rc.getBytes();
		s.setRepo(repos);
		hsi.saveStudent(s);
		return "login";
	}
} 