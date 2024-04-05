package com.app.CRUD_OPERATION.iservice;

import java.util.List;

import com.app.CRUD_OPERATION.model.Employee;

public interface EmployeeServiceInterface {

	Employee insertData(Employee id);

	List<Employee> getAllData();

	void deleteData(Long id);

	Employee getEmployee(Long id);

	Employee updateEmployee(Employee emp, Long id);


}
