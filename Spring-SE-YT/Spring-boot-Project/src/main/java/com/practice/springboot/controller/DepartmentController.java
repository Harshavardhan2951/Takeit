package com.practice.springboot.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.practice.springboot.Entity.Department;
import com.practice.springboot.Service.DepartmentService;

import jakarta.validation.Valid;

@RestController
public class DepartmentController {
	/*We have to implement services and repositories*/
	/*Creating a method to save the Department*/
	@Autowired
	private DepartmentService departmentService;
	
	private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);
	@PostMapping("/departments")
	public Department saveDepartment(@Valid @RequestBody Department department) {
		/*Now we have to call the service layer ot pass the business login, later call the repository layer to save it*/
		LOGGER.info("Inside save Department of DepartmentController");
		return departmentService.saveDepartment(department);
	}
	@GetMapping("/departments")
	public List<Department> fetchDepartmentList() {
		LOGGER.info("Inside save fetchDepartmentList of DepartmentController");
		return departmentService.fetchDepartmentList();
	}
	@GetMapping("/departments/{id}")
	public Department fetchDepartmentById(@PathVariable("id") Long departmentId) {
		return departmentService.fetchDepartmentById(departmentId);
	}
	@DeleteMapping("/departments/{id}")
	public String deleteDepartmentById(@PathVariable("id")  Long departmentId) {
		departmentService.deleteDepartmentById(departmentId);
		return "Department Deleted Successfully";
	}
	/*Update*/
	@PutMapping("/departments/{id}")
	public Department updateDepartment(@PathVariable("id")  Long departmentId,@RequestBody Department department) {
		return departmentService.updateDepartment(departmentId, department);
	}
	/*Fetch Data by name*/
	@GetMapping("/departments/name/{name}")
	public Department fetchDepartmentByName(@PathVariable("name") String departmentName) {
		return departmentService.fetchDepartmentByName(departmentName);
	}
	
}