package com.springmvc.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.dao.DepartmentDAO;
import com.springmvc.model.Department;

@Controller
@RequestMapping("/depart")
public class DepartmentController {

	@Autowired
	public DepartmentDAO departmentDAO;

	public void setDao(DepartmentDAO dao) {
		this.departmentDAO = dao;
	}

	@RequestMapping("/getAll")
	public String getAllDepartments(Map<String, Object> map) {
		List<Department> departments = departmentDAO.getAllDepartments();
		map.put("departments", departments);
		return "departments";
	}

	@RequestMapping("/put")
	public String addDepartments(Department department) {
		departmentDAO.addDepartment(department);
		return "redirect:/depart/getAll";
	}
}
