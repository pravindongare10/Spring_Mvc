package com.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daoi.Homedaoi;
import com.model.Student;
import com.servicei.Homeservicei;
@Service
public class Homeserviceimpl implements Homeservicei{
	@Autowired
	Homedaoi hdi;
	@Override
	public void saveStudent(Student s) {
		hdi.saveStudent(s);
	}
	@Override
	public List<Student> getStudents() {
		List<Student>list=hdi.getStudents();
		return list;
	}
	@Override
	public void deleteStudent(int rollno) {
		hdi.deleteStudent(rollno);
		
	}
	@Override
	public Student editStudent(int rollno) {
	
		return hdi.editStudent(rollno);
	}
	@Override
	public void updateStudent(Student s) {
		hdi.updateStudent(s);
		
	}
	@Override
	public List<Student> logincheck(String username, String password) {
		
		return  hdi.logincheck(username,password);
	}
}
