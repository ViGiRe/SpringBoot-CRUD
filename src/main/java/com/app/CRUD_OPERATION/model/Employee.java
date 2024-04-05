package com.app.CRUD_OPERATION.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Employee")
public class Employee {

	@Id
	@Column(name = "id")
	private Integer eId;
	
	@Column(name = "Name")
	private String name;
	
	
	@Column(name = "Company")
	private String company;
	
	@Column(name = "Salary")
	private Double sal;

	public Integer geteId() {
		return eId;
	}

	public void seteId(Integer eId) {
		this.eId = eId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", name=" + name + ", company=" + company + ", sal=" + sal + "]";
	}

	
	
}
