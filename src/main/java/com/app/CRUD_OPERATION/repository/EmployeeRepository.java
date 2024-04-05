package com.app.CRUD_OPERATION.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.CRUD_OPERATION.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{


	
}
