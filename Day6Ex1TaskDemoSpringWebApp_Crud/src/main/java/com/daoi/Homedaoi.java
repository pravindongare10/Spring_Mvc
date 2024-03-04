package com.daoi;

import java.util.List;

import com.model.Student;

public interface Homedaoi {
		
		public void saveStudent(Student s);

		
		public List<Student>getStudents();
		
		
		public void deleteStudent(int rollno);
		
		public Student editStudent(int rollno);
		
		public void updateStudent(Student s);
		
		public List<Student> logincheck(String username,String password);	
		
}
