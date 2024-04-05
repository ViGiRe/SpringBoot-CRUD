package com.app.CRUD_OPERATION.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.CRUD_OPERATION.iservice.EmployeeServiceInterface;
import com.app.CRUD_OPERATION.model.Employee;
import com.app.CRUD_OPERATION.repository.EmployeeRepository;

@Service
public class EmployeeService implements EmployeeServiceInterface{

	@Autowired
	EmployeeRepository repo;

	@Override
	public Employee insertData(Employee id) {
		Employee emp = repo.save(id);
		return emp;
	}

	public List<Employee> getAllData() {
		
		return (List<Employee>) repo.findAll();
	}

	@Override
	public void deleteData(Long id) {
		repo.deleteById(id);
	}

	@Override
	public Employee getEmployee(Long id) {
		Employee emp = repo.findById(id).get();
		return emp;
	}

	@Override
	public Employee updateEmployee(Employee emp, Long id) {
		Employee e = repo.findById(id).get();
		
		
		e.setName(emp.getName());
		e.setCompany(emp.getCompany());
		e.setSal(emp.getSal());
		
		return repo.save(e);
	}

	
	
	
	

}
