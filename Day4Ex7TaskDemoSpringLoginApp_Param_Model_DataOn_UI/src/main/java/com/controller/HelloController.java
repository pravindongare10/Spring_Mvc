package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	
	@RequestMapping(value = "/SLogin")
	public String Student(@RequestParam("sname")String a,@RequestParam("smobno")String b,Model m) {
		// name And Value Method Use 
		m.addAttribute("sname", a);
		m.addAttribute("smobno",b);
	
		return "StudentRej";
	}

	@RequestMapping(value = "/SUCCESS")
	public String hello() { 

	return "success";
			
	}
	
	
	@RequestMapping(value = "/TLogin")
	public String Teacher(@RequestParam("tname")String a,@RequestParam("tmobno")String b,Model m) {
		// name And Value Method Use 
		m.addAttribute("tname", a);
		m.addAttribute("tmobno",b);
	
		return "TeacherRej";
	}
	
	
	
	
	
} 