package com.example.demo.service;

import com.example.demo.pojo.Employee;

public class Service {
         
   public static boolean isUser(Employee e,String password) {
	      if(e.getPassword().equals(password)) {
	    	  return true;
	      }
	      return false;
   }
}
