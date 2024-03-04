package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.User;

@Controller
public class HelloController {
	List<User> u1=new ArrayList<>();
	
	@RequestMapping(value = "/")
	public String Signin() {
		return "login";
	}
	@RequestMapping(value = "/new")
	public String Resistration(){
		
		return "Reg";
	}
	@RequestMapping(value = "/createacc")
	public String createacc(@ModelAttribute User u) {
		u1.add(u);
		System.out.println(u1);
		return "login";
	}
	
	@RequestMapping(value ="/SUCCESS")
	public String Success(@RequestParam("username") String un,@RequestParam("password") String pw,Model m) {
		for(User user:u1) {
			if(user.getUsername().equals(un)&&user.getPassword().equals(pw)) {
				
			m.addAttribute("suc", u1);	
				
			return
					"success";	
			}
		}
		 
		return "defaultpage";
	}
	
	
	 @RequestMapping(value="**")
	public String fourZerofour() {
	
		
		return "fourZerofour";

	} 
	 
	 
	 @RequestMapping(value ="/byname")
	 public String byName(@RequestParam String name,Model m) {
		 for(User us1:u1) {
			 if(us1.getName().equals(name)) {
				 String nm=us1.getName();  
				 m.addAttribute("name",nm); 
				 m.addAttribute("aa","You are in the world of web application ");
				return "ndetail"; 
			 }
		
		 }
		 return "bynamedefault";
		 
	 }
	
	
	 
	 @RequestMapping(value ="/byusername")
	 public String byusername(@RequestParam String username,Model m) {
		 for(User us2:u1) {
			 if(us2.getUsername().equals(username)) { 
				 String un=us2.getUsername();
				 m.addAttribute("uname",un);
				 m.addAttribute("aa","You are in the world of web application ");
				return "usernamedetail"; 
			 }
		
		 }
		 return "bynamedefault";
		 
	 }
	
	 @RequestMapping(value ="/bymob")
	 public String bymobno(@RequestParam("mno") String m1,Model m) {
		 for(User us3:u1) {
			 if(us3.getMobno().equals(m1)) {
				 String mn=us3.getMobno();
				 m.addAttribute("mobile",mn);
				 m.addAttribute("aa","You are in the world of web application ");
				return "mdetail"; 
			 }
		
		 }
		 return "bynamedefault";
		 
	 }
	 
} 