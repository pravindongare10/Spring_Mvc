package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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


	@RequestMapping(value = "/save")
	public String saveStudent(@ModelAttribute Student s) {
		hsi.saveStudent(s);
		return "login";
	}
	
	@RequestMapping(value ="/Login")
	public String Logincheck(@RequestParam String username,@RequestParam String password ,Model m ) {
	
	if (username.equals("Addmin")&&password.equals("Addmin"))
	{
			List<Student> list=hsi.getStudents();
			m.addAttribute("data", list);
		return "success";
	}
	else {
		List<Student>list=hsi.logincheck(username,password);
		if(!list.isEmpty()) {
			m.addAttribute("data",list);
			return "success";
		}
		else {
			return "login";
			}																																																																																
		}	
	
	}
	
		
	
	@RequestMapping(value ="/delete")
	public String deleteStudent(@RequestParam int rollno,Model m ){
		System.out.println(rollno);
		hsi.deleteStudent(rollno);
		
		List<Student>list=hsi.getStudents();
		m.addAttribute("data", list);
		
		return "success";
	
		 
	}
	
	@RequestMapping(value ="/edit")
	public String editStudent(@RequestParam int rollno,Model m ){

		Student s=hsi.editStudent(rollno);
		m.addAttribute("s", s);
		return "edit";	 
	}
	
	@RequestMapping(value ="/update")
	public String updateStudent(@ModelAttribute Student s,Model m ){
	
		hsi.updateStudent(s);
		List<Student>list=hsi.getStudents();
		m.addAttribute("data", list);
		
		return "success";	 
	}
	
} 									