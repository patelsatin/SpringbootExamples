package com.example.demo.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
         @Id
         int id;
         String name;
         String designation;
         String password;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public Employee() {
			super();
		}
         
}
