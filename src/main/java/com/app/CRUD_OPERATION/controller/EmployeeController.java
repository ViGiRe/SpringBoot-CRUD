package com.app.CRUD_OPERATION.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.CRUD_OPERATION.iservice.EmployeeServiceInterface;
import com.app.CRUD_OPERATION.model.Employee;
import com.app.CRUD_OPERATION.serviceimpl.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	EmployeeServiceInterface ser;

	@PostMapping("/employee")
	public ResponseEntity<Employee> insertData(@RequestBody Employee id){
		Employee emp = ser.insertData(id);
		return new ResponseEntity<Employee>(emp,HttpStatus.CREATED);
	}
	
	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getAllData(){
		List<Employee> listEmp = ser.getAllData();
		return new ResponseEntity<List<Employee>>(listEmp, HttpStatus.OK);
	}
	
	@DeleteMapping("/employee/{id}")
	public void deleteData(@PathVariable Long id) {
		ser.deleteData(id);
	}
	
	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployee(@PathVariable Long id){
		Employee emp = ser.getEmployee(id);
		return new ResponseEntity<Employee>(emp,HttpStatus.OK);
		
	}
	
	@PutMapping("/employee/{id}")
	public Employee updateEmployee(@RequestBody Employee emp, @PathVariable Long id) {
		
		return ser.updateEmployee(emp,id);
		
	}
}
