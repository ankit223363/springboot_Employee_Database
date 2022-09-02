package com.isocel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.isocel.entity.Employee;
import com.isocel.repository.EmployeeRepository;

@Controller
@RequestMapping("/Sopra")
public class EmployeeController {
	private int idEm;
	
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@RequestMapping("/home")
	public String home(Model model) {
		
		System.out.println("home");
		return "home";
	}
	
	@RequestMapping("add")
	public String add(Model model) {
		
		System.out.println("add");
		return "addEmployee";
	}

	
		@PostMapping("/addemploye")

	public String create(@ModelAttribute Employee employee, Model model) {
			
		employeeRepository.save(employee);

		List<Employee> employees = (List<Employee>) employeeRepository.findAll();
		model.addAttribute("employees", employees);
		model.addAttribute("msg", "Employee has been added.");
		System.out.println("create");

		return displayEmployeeInfo(model);
	}
	


	@RequestMapping("/display")
	public String displayEmployeeInfo(Model model) {
		List<Employee> employees = (List<Employee>) employeeRepository.findAll();
		model.addAttribute("employees", employees);
		model.addAttribute("msg", "Welcome to Employee Management System");
		return "displayEmployee";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(Model model, @PathVariable int id) {

		employeeRepository.deleteById(id);

		return displayEmployeeInfo(model);
	}
	
	@RequestMapping("edt/{id}")
	public String editEmployee(Model model , @PathVariable int id) {
		idEm=id;
		System.out.println("edt");
		return "edit";
	}
	
	@PostMapping("/editemployee")

	public String editemp(@ModelAttribute Employee employee, Model model) {
		Employee emp = employeeRepository.findById(idEm).get();	
		emp.setEmpId(employee.getEmpId());
		emp.setName(employee.getName());
		emp.setProjectName(employee.getProjectName());
		emp.setDU(employee.getDU());
		
		return displayEmployeeInfo(model);
	}


}
