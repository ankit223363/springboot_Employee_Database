package com.isocel.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.isocel.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {
	List<Employee> findByName(String name);

}
