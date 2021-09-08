package com.example.demo.controller;



import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.pojo.Employee;
import com.example.demo.service.Service;

import antlr.collections.List;

@RestController
public class MainController {
	
	@Autowired
	EmployeeeRepo repo;
	
	@RequestMapping("/")
	public ModelAndView welcome() {
		ModelAndView mv=new ModelAndView("welcome");
		return mv;
	}
   @RequestMapping(path="/register")
   public ModelAndView home() {
	   System.out.println("Home running");
	   ModelAndView mv=new ModelAndView("home");
	   return mv;
   }
   @PostMapping(path="/registration")
   public ModelAndView insert( Employee e) {
	   ModelAndView mv =new ModelAndView("about");
	   mv.addObject("message","registration successful");
	   repo.save(e);
	   return mv;
   }
   @RequestMapping(method=RequestMethod.GET,path="/login")
   public ModelAndView login() {
	   ModelAndView mv=new ModelAndView("login");
	   return mv;
   }
    @GetMapping(path = "/loginCheck")
	public ModelAndView loginCheck(int id, String password) {
		ModelAndView mv;
		Employee e = repo.findById(id).orElse(new Employee());
		boolean checkUser = Service.isUser(e, password);
		if (checkUser) {
			mv = new ModelAndView("about");
			mv.addObject("message", "login succesful");
		} else {
			mv = new ModelAndView("error");
		}
		return mv;
	}
   @GetMapping(path="/doDelete")
   public ModelAndView deDelete(int id) {
	   ModelAndView mv =new ModelAndView("about");
	   mv.addObject("message", "Delete successful");
	   repo.deleteById(id);
	   return mv;
   }
   @RequestMapping(path="/delete")
   public ModelAndView delete() {
	   ModelAndView mv =new ModelAndView("delete");
	   return mv;
   }
   @RequestMapping(path="/checkupdate")
   public ModelAndView checkupdate() {
	   ModelAndView mv =new ModelAndView("validate");
	   return mv;
   }
   @RequestMapping(path="/update")
   public ModelAndView update(int id,String password) {
	   ModelAndView mv =new ModelAndView("update");
	   Employee e = repo.findById(id).orElse(new Employee());
		boolean checkUser = Service.isUser(e, password);
		if (checkUser) {
			mv = new ModelAndView("update");
			mv.addObject("id", e.getId());
			mv.addObject("name",e.getName());
			mv.addObject("designation", e.getDesignation());
			mv.addObject("password", e.getPassword());
		} else {
			mv = new ModelAndView("error");
		}
	   return mv;
   }
   @RequestMapping(path="/doUpdate")
   public ModelAndView doupdate(Employee e) {
	   ModelAndView mv =new ModelAndView("about");
	   repo.updateEmployee(e.getId(),e.getName(),e.getDesignation(),e.getPassword());
	   mv.addObject("message","Update successful");
	   return mv;
   }
   @RequestMapping(path="/getAll")
   public ModelAndView getAll() {
	   ModelAndView mv =new ModelAndView("show");
	   Iterable<Employee> employees=repo.findAll();
	   employees.forEach((e)->System.out.println(e.getName()));
	   mv.addObject("data", employees);
	   return mv;
   }
}
