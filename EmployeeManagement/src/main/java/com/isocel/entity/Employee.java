package com.isocel.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EmployeeDataBase")
public class Employee {
	@Id
	private int empId;
	private String name;
	private String projectName;
	private String DU;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getDU() {
		return DU;
	}
	public void setDU(String dU) {
		DU = dU;
	}
}
