package com.springmvc.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springmvc.dao.DepartmentDAO;
import com.springmvc.model.Department;

@Repository
public class DepartmentDAOImpl implements DepartmentDAO {

	public static String QUERY_SQL = "select * from department";
	public static String INSERT_SQL = "insert into department (name) values (:name)";

	@Autowired
	public NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	public void setJdbcTemplate(
			NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}

	@Override
	public List<Department> getAllDepartments() {

		List<Map<String, Object>> departmentsMap = namedParameterJdbcTemplate
				.queryForList(QUERY_SQL, new HashMap<String, Object>());
		List<Department> departments = new ArrayList<Department>();
		if (departmentsMap.isEmpty()) {
			return departments;
		}
		Department department = null;
		for (Map<String, Object> departMap : departmentsMap) {
			department = new Department();
			department.setId((Integer) departMap.get("id"));
			department.setName((String) departMap.get("name"));
			departments.add(department);
		}

		return departments;
	}

	@Override
	public Department getDepartment(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addDepartment(Department department) {

		Map<String, Object> paramMap = new HashMap<String, Object>();

		paramMap.put("name", department.getName());

		try {
			namedParameterJdbcTemplate.update(INSERT_SQL, paramMap);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

}
