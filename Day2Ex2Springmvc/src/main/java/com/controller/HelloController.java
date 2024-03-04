package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.DispatcherServlet;

@Controller
public class HelloController {
	
	@RequestMapping(value = "/AT")
	public String AT() {
		System.out.println("in AT controller class method");
		return "TeacherRej";
	}
	@RequestMapping(value ="/AS")
	public String AS() {
		System.out.println("in AS controller class method");
		return "StudentRej";
	}
	
	
}