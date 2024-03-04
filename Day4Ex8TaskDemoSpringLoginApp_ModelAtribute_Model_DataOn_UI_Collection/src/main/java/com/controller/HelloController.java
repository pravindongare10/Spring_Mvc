package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class HelloController {
	
	@RequestMapping(value = "/SLogin")
	public String Student(@ModelAttribute user u,Model m) {
		List<user> users=new ArrayList<>();
		users.add(u);
		m.addAttribute("data", users);
		return "StudentRej";
	}
	

	@RequestMapping(value = "/SUCCESS")
	public String hello() { 

	return "success";
				
	}
		
		
	@RequestMapping(value = "/TLogin")
	public String Teacher(@ModelAttribute seconduser n,Model m) {
	List<seconduser> susers=new ArrayList<>();
	susers.add(n);
	m.addAttribute("seconddata", susers);
		
	return "TeacherRej";
	}
		
	
} 