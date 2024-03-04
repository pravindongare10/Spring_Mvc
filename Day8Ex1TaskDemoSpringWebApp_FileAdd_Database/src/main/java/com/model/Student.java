package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Student {
	@Id
		private int rollno;
		private String name;
		private String password;
		private String username;
		@Lob
		private byte[] repo;
		public int getRollno() {
			return rollno;
		}
		public void setRollno(int rollno) {
			this.rollno = rollno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public byte[] getRepo() {
			return repo;
		}
		public void setRepo(byte[] repo) {
			this.repo = repo;
		}
		
	
}
