package com.example.demo.controller;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.pojo.Employee;


public interface EmployeeeRepo extends CrudRepository<Employee,Integer> {
    @Transactional
	@Modifying
	@Query("UPDATE Employee SET name = :name, designation = :designation , password = :password where id= :id ")   
	void updateEmployee(int id,String name,String designation,String password);
}
