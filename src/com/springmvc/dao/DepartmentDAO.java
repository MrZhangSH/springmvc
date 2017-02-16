package com.springmvc.dao;

import java.util.List;

import com.springmvc.model.Department;

public interface DepartmentDAO {
	public List<Department> getAllDepartments();

	public Department getDepartment(Integer id);

	public boolean addDepartment(Department department);
}
