package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping(value = "/login/{username}/{password}")
	public String login(@PathVariable("username")String u,@PathVariable("password")String p) {
		System.out.println(u);
		System.out.println(p);
		return "success";
	}
} 