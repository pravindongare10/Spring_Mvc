package com.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController {
	
	@RequestMapping(value = "/Login")
	public ModelAndView login(@ModelAttribute user u) {
		List<user> users=new ArrayList<>();
		users.add(u);
		users.add(u);
		users.add(u);		//		viewzName  key  values
	ModelAndView m=new ModelAndView("success","data",users);
	
	return m;
	}
} 