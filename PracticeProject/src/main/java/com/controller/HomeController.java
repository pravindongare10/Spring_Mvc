package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping(value="/")
	public String preloging() {
		System.out.println("OpenLoging Page");
		return "login";
	}
	@RequestMapping(value="/Log")
	public String login(@RequestParam String Username ,@RequestParam String Password) {
		
		System.out.println(Username);
		System.out.println(Password);
		return "success";
	}
}
