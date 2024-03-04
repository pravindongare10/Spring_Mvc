package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping(value = "/Login")
	public String hello() {
		System.out.println("in login controller class method");
		return "success";
	}
} 